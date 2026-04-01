package dark.detraismc.SPC_SF.implementation.block;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Compact_Reactor extends AGenerator {

    public Compact_Reactor() {
        super(SPCItems.category_machine, SPCItems.COMPACT_REACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
        		SlimefunItems.CARGO_INPUT_NODE, SlimefunItems.REACTOR_ACCESS_PORT, SlimefunItems.CARGO_OUTPUT_NODE,
	    		SlimefunItems.FREEZER_2, SlimefunItems.NUCLEAR_REACTOR, SlimefunItems.FREEZER_2,
                SPCItems.ARTIFACT_CIRCUIT_BOARD, SPCItems.ICE_KING_COOLANT_CELL, SPCItems.ARTIFACT_CIRCUIT_BOARD
	    });
    }

    @Override
    public int getEnergyProduction() {
        return 250;
    }

    @Override
    public int getCapacity() {
        return 8192;
    }

    @Override
    protected void registerDefaultFuelTypes() {
        registerFuel(new MachineFuel(1200,
                SlimefunItems.URANIUM));
        registerFuel(new MachineFuel(1500,
                SlimefunItems.BOOSTED_URANIUM));
        registerFuel(new MachineFuel(600,
                SlimefunItems.NEPTUNIUM));
    }

    @Override
    public ItemStack getProgressBar() {
        return new SlimefunItemStack(SlimefunItems.URANIUM, 1);
    }

    @Override
    public String getInventoryTitle() {
        return "&2Compact Reactor";
    }

}