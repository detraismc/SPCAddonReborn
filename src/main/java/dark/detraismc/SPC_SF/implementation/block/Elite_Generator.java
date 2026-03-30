package dark.detraismc.SPC_SF.implementation.block;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;

public class Elite_Generator extends AGenerator {

    public Elite_Generator() {
        super(SPCItems.category_machine, SPCItems.ELITE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
        		SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.REDSTONE_ALLOY, SlimefunItems.ELECTRIC_MOTOR,
	    		SlimefunItems.REDSTONE_ALLOY, SlimefunItems.COAL_GENERATOR_2, SlimefunItems.REDSTONE_ALLOY,
	    		SlimefunItems.REINFORCED_PLATE, SlimefunItems.REDSTONE_ALLOY, SlimefunItems.REINFORCED_PLATE
	    });
    }

    @Override
    public int getEnergyProduction() {
        return 50;
    }

    @Override
    public int getCapacity() {
        return 500;
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
        return "&cElite Generator";
    }

}