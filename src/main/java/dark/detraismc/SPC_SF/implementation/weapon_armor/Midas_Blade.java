package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCAddon;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Midas_Blade extends SlimefunItem {

	SPCAddon plugin = SPCAddon.getInstance();
	
	public Midas_Blade() {
		super(SPCItems.category_weapon, SPCItems.MIDAS_BLADE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.ARTIFACT_CIRCUIT_BOARD, SPCItems.ARTIFACT_POWER_CORE, SPCItems.ARTIFACT_CIRCUIT_BOARD,
	    		SPCItems.NATURE_COMPONENT, SlimefunItems.BLADE_OF_VAMPIRES, SPCItems.NATURE_COMPONENT,
	    		SPCItems.ARTIFACT_CIRCUIT_BOARD, SPCItems.CORRUPTED_GOLD_INGOT_2, SPCItems.ARTIFACT_CIRCUIT_BOARD
		});
	}
}
