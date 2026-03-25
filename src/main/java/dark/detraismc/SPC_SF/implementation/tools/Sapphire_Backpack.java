package dark.detraismc.SPC_SF.implementation.tools;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.backpacks.SlimefunBackpack;

public class Sapphire_Backpack extends SlimefunBackpack {

	public Sapphire_Backpack() {
	    super(36, SPCItems.category_tools, SPCItems.SAPPHIRE_BACKPACK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.SAPPHIRE_PLATE, null, SPCItems.SAPPHIRE_PLATE,
	    		SPCItems.REINFORCED_LEATHER, SPCItems.REINFORCED_SHULKER_SHELL, SPCItems.REINFORCED_LEATHER,
	    		SPCItems.SAPPHIRE_PLATE, null, SPCItems.SAPPHIRE_PLATE
	    });
	  }
}
