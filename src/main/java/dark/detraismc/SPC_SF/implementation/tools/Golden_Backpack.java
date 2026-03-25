package dark.detraismc.SPC_SF.implementation.tools;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.backpacks.SlimefunBackpack;

public class Golden_Backpack extends SlimefunBackpack {

	public Golden_Backpack() {
	    super(18, SPCItems.category_tools, SPCItems.GOLDEN_BACKPACK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.GOLDEN_PLATE, null, SPCItems.GOLDEN_PLATE,
	    		SPCItems.REINFORCED_LEATHER, SPCItems.ELITE_INGOT, SPCItems.REINFORCED_LEATHER,
	    		SPCItems.GOLDEN_PLATE, null, SPCItems.GOLDEN_PLATE
	    });
	  }
	  
}
