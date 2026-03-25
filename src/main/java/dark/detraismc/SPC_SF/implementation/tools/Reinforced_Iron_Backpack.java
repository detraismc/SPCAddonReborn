package dark.detraismc.SPC_SF.implementation.tools;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.backpacks.SlimefunBackpack;

public class Reinforced_Iron_Backpack extends SlimefunBackpack {

	public Reinforced_Iron_Backpack() {
	    super(45, SPCItems.category_tools, SPCItems.REINFORCED_IRON_BACKPACK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SlimefunItems.REINFORCED_PLATE, SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_PLATE,
	    		SPCItems.REINFORCED_LEATHER, SPCItems.SHULKER_MIND, SPCItems.REINFORCED_LEATHER,
	    		SlimefunItems.REINFORCED_PLATE, SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_PLATE
	    });
	  }
}
