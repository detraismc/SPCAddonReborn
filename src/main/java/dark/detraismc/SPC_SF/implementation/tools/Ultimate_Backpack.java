package dark.detraismc.SPC_SF.implementation.tools;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.backpacks.SlimefunBackpack;

public class Ultimate_Backpack extends SlimefunBackpack {
	
	public Ultimate_Backpack() {
	    super(54, SPCItems.category_tools, SPCItems.ULTIMATE_BACKPACK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.NETHERITE_PLATE, SPCItems.ENDERITE_INGOT, SPCItems.NETHERITE_PLATE,
	    		SPCItems.REINFORCED_LEATHER, SPCItems.ULTIMATE_CORE, SPCItems.REINFORCED_LEATHER,
	    		SPCItems.NETHERITE_PLATE, SPCItems.ENDERITE_INGOT, SPCItems.NETHERITE_PLATE
	    });
	  }
}
