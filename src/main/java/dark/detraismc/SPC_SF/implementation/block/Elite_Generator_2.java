package dark.detraismc.SPC_SF.implementation.block;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;

public class Elite_Generator_2 extends AGenerator {

    public Elite_Generator_2() {
        super(SPCItems.category_machine, SPCItems.ELITE_GENERATOR_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
        		SPCItems.WEEB_INGOT, SlimefunItems.LARGE_CAPACITOR, SPCItems.WEEB_INGOT,
	    		SlimefunItems.REINFORCED_PLATE, SPCItems.ELITE_GENERATOR, SlimefunItems.REINFORCED_PLATE,
	    		SPCItems.ENDERITE_INGOT, SlimefunItems.REINFORCED_PLATE, SPCItems.ENDERITE_INGOT
	    });
    }

    @Override
    public int getEnergyProduction() {
        return 125;
    }

    @Override
    public int getCapacity() {
        return 1250;
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
        return "&cElite Generator &7- &eII";
    }

}