package dark.detraismc.SPC_SF.implementation.block;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;

public class Elite_Generator_3 extends AGenerator {

    public Elite_Generator_3() {
        super(SPCItems.category_machine, SPCItems.ELITE_GENERATOR_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
        		SPCItems.WEEB_PLATE, SlimefunItems.ENERGIZED_CAPACITOR, SPCItems.WEEB_PLATE,
        		SPCItems.VOID_INGOT, SPCItems.ELITE_GENERATOR_2, SPCItems.VOID_INGOT,
        		SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.CORRUPTED_ELITE_INGOT, SPCItems.PROFESSIONAL_CIRCUIT_BOARD
	    });
    }

    @Override
    public int getEnergyProduction() {
        return 265;
    }

    @Override
    public int getCapacity() {
        return 2650;
    }

    @Override
    protected void registerDefaultFuelTypes() {
        registerFuel(new MachineFuel(1800,
            SPCItems.ELITE_INGOT));
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.GOLD_NUGGET);
    }

    @Override
    public String getInventoryTitle() {
        return "&cElite Generator &7- &eIII";
    }

}