package dark.detraismc.SPC_SF.implementation.block;

import java.util.List;
import java.util.stream.Collectors;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Dispenser;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;

public class Vending_Machine extends MultiBlockMachine {

    public Vending_Machine() {
        super(
        		SPCItems.category_tools, SPCItems.VENDING_MACHINE,
                new ItemStack[] {
                		null, new ItemStack(Material.PURPUR_SLAB), null, 
                		null, new ItemStack(Material.GLASS), null, 
                		null, new ItemStack(Material.DISPENSER), null},
                BlockFace.SELF
        );
    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        return recipes.stream().map(items -> items[0]).collect(Collectors.toList());
    }

    @Override
    public void onInteract(Player p, Block b) {
        Block dispBlock = b.getRelative(BlockFace.DOWN);
        Dispenser disp = (Dispenser) dispBlock.getState();
        Inventory inv = disp.getInventory();

        for (ItemStack item : inv.getContents()) {
            for (ItemStack recipeInput : RecipeType.getRecipeInputs(this)) {
                if (recipeInput != null && SlimefunUtils.isItemSimilar(item, recipeInput, true)) {
                    ItemStack output = RecipeType.getRecipeOutput(this, recipeInput);
                    Inventory outputInv = findOutputInventory(output, dispBlock, inv);

                    if (outputInv != null) {
                        ItemStack removing = item.clone();
                        removing.setAmount(recipeInput.getAmount());
                        inv.removeItem(removing);

                        craft(p, output, outputInv);
                    }
                    else {
                        Slimefun.getLocalization().sendMessage(p, "machines.full-inventory", true);
                    }

                    return;
                }
            }
        }

        Slimefun.getLocalization().sendMessage(p, "machines.unknown-material", true);
    }

    private void craft(Player p, ItemStack output, Inventory outputInv) {
        for (int i = 0; i < 4; i++) {
            int j = i;

            Bukkit.getScheduler().runTaskLater(Slimefun.instance(), () -> {
                if (j < 3) {
                    p.getWorld().playSound(p.getLocation(), j == 1 ?  Sound.BLOCK_PISTON_CONTRACT : Sound.BLOCK_PISTON_EXTEND, 1F, j == 0 ? 1F : 2F);
                }
                else {
                    p.getWorld().playSound(p.getLocation(), Sound.ENTITY_PLAYER_SMALL_FALL, 1F, 1F);
                    outputInv.addItem(output);
                }
            }, i * 20L);
        }
    }

}