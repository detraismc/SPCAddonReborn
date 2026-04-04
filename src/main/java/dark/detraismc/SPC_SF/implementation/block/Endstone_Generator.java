package dark.detraismc.SPC_SF.implementation.block;

import dark.detraismc.SPC_SF.SPCItems;
import dark.detraismc.SPC_SF.implementation.interfaces.SPCInventoryBlock;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;


public class Endstone_Generator extends SimpleSlimefunItem<BlockTicker> implements SPCInventoryBlock,
        EnergyNetComponent {

    private static final int ENERGY_CONSUMPTION = 80;
    private final int[] border = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 18, 19, 20, 21, 22, 27, 28, 29, 30,
            31, 36, 37, 38, 39, 40, 41, 42, 43, 44, 22};
    private final int[] inputBorder = {};
    private final int[] outputBorder = {14, 15, 16, 17, 23, 26, 32, 33, 34, 35};
    private int decrement = 2;

    public Endstone_Generator() {
        super(SPCItems.category_machine, SPCItems.ENDSTONE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.PROGRAMMABLE_ANDROID_MINER, SPCItems.CORRUPTED_ENDER_EYE_2, SlimefunItems.PROGRAMMABLE_ANDROID_MINER,
                SPCItems.SHULKER_MIND, SPCItems.DIRT_CREATOR_3, SPCItems.SHULKER_MIND,
                SlimefunItems.PROGRAMMABLE_ANDROID_MINER, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.PROGRAMMABLE_ANDROID_MINER});

        createPreset(this, this::constructMenu);

        addItemHandler(onBreak());
    }

    private void constructMenu(BlockMenuPreset preset) {
        for (int i : border) {
            preset.addItem(i, new CustomItemStack(new ItemStack(Material.GRAY_STAINED_GLASS_PANE), " "),
                    ChestMenuUtils.getEmptyClickHandler());
        }
        for (int i : inputBorder) {
            preset.addItem(i, new CustomItemStack(new ItemStack(Material.CYAN_STAINED_GLASS_PANE), " "),
                    ChestMenuUtils.getEmptyClickHandler());
        }
        for (int i : outputBorder) {
            preset.addItem(i, new CustomItemStack(new ItemStack(Material.ORANGE_STAINED_GLASS_PANE), " "),
                    ChestMenuUtils.getEmptyClickHandler());
        }

        for (int i : getOutputSlots()) {
            preset.addMenuClickHandler(i, new ChestMenu.AdvancedMenuClickHandler() {

                @Override
                public boolean onClick(Player p, int slot, ItemStack cursor, ClickAction action) {
                    return false;
                }

                @Override
                public boolean onClick(InventoryClickEvent e, Player p, int slot, ItemStack cursor,
                                       ClickAction action) {
                    return cursor == null || cursor.getType() == Material.AIR;
                }
            });
        }
    }

    @Override
    public int[] getInputSlots() {
        return new int[] {};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[] {24, 25};
    }

    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CONSUMER;
    }

    @Override
    public int getCapacity() {
        return 5120;
    }

    public BlockBreakHandler onBreak() {
        return new BlockBreakHandler(false, false) {

            @Override
            public void onPlayerBreak(BlockBreakEvent e, ItemStack item, List<ItemStack> drops) {
                Block b = e.getBlock();
                BlockMenu inv = BlockStorage.getInventory(b);

                if (inv != null) {
                    inv.dropItems(b.getLocation(), getInputSlots());
                    inv.dropItems(b.getLocation(), getOutputSlots());
                }
            }
        };
    }

    @Override
    public BlockTicker getItemHandler() {
        return new BlockTicker() {

            @Override
            public void uniqueTick() {
                if (decrement == 1) {
                    decrement = 2;
                    return;
                }
                decrement--;

            }

            @Override
            public void tick(Block b, SlimefunItem sf, Config data) {
                if (decrement != 2) {
                    return;
                }

                ItemStack output = new ItemStack(Material.END_STONE);

                if (getCharge(b.getLocation()) >= ENERGY_CONSUMPTION) {
                    BlockMenu menu = BlockStorage.getInventory(b);

                    if (!menu.fits(output, getOutputSlots())) {
                        return;
                    }

                    removeCharge(b.getLocation(), ENERGY_CONSUMPTION);
                    menu.pushItem(output, getOutputSlots());
                }
            }

            @Override
            public boolean isSynchronized() {
                return true;
            }
        };
    }

}
