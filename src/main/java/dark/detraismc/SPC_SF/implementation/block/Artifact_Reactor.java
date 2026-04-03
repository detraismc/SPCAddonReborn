package dark.detraismc.SPC_SF.implementation.block;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;
import org.bukkit.inventory.ItemStack;

public class Artifact_Reactor extends AGenerator {

    public Artifact_Reactor() {
        super(SPCItems.category_machine, SPCItems.ARTIFACT_REACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SPCItems.FUSION_ARTIFACT, SPCItems.ARTIFACT_CIRCUIT_BOARD, SPCItems.FUSION_ARTIFACT,
                SPCItems.ARTIFACT_POWER_CORE, SPCItems.COMPACT_REACTOR, SPCItems.ARTIFACT_POWER_CORE,
                SPCItems.ARTIFACT_CIRCUIT_BOARD, SPCItems.ELITE_GENERATOR_3, SPCItems.ARTIFACT_CIRCUIT_BOARD
	    });
    }

    @Override
    public int getEnergyProduction() {
        return 1024;
    }

    @Override
    public int getCapacity() {
        return 32768;
    }

    @Override
    protected void registerDefaultFuelTypes() {
        registerFuel(new MachineFuel(1500,
                SPCItems.ELITE_ARTIFACT));
    }

    @Override
    public ItemStack getProgressBar() {
        return new SlimefunItemStack(SPCItems.BASIC_ARTIFACT, 1);
    }

    @Override
    public String getInventoryTitle() {
        return "&4Artifact Reactor";
    }

}