package dark.detraismc.SPC_SF.implementation.weapon_armor;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCAddon;
import dark.detraismc.SPC_SF.SPCItems;

public class Monochrome_Shooter extends SlimefunItem {
	
	SPCAddon plugin = SPCAddon.getInstance();
	
   public Monochrome_Shooter() {
	   super(SPCItems.category_weapon, SPCItems.MONOCHROME_SHOOTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
				SPCItems.VOID_PLATE, SPCItems.TECH_COMPONENT, SPCItems.ARTIFACT_POWER_CORE,
	    		SPCItems.TECH_COMPONENT, SlimefunItems.EXPLOSIVE_BOW, SPCItems.TECH_COMPONENT,
	    		SPCItems.ARTIFACT_POWER_CORE, SPCItems.TECH_COMPONENT, SPCItems.VOID_PLATE
		});
   }
}
