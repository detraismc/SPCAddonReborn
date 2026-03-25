package dark.detraismc.SPC_SF.implementation.tools;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.backpacks.SlimefunBackpack;

public class Diamond_Backpack extends SlimefunBackpack {

	public Diamond_Backpack() {
	    super(27, SPCItems.category_tools, SPCItems.DIAMOND_BACKPACK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.DIAMOND_PLATE, new ItemStack(Material.SHULKER_SHELL), SPCItems.DIAMOND_PLATE,
	    		SPCItems.REINFORCED_LEATHER, new ItemStack(Material.SHULKER_SHELL), SPCItems.REINFORCED_LEATHER,
	    		SPCItems.DIAMOND_PLATE, new ItemStack(Material.SHULKER_SHELL), SPCItems.DIAMOND_PLATE
	    });
	  }
	  
}
