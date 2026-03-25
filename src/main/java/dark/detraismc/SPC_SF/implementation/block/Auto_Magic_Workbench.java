package dark.detraismc.SPC_SF.implementation.block;


import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.autocrafters.SlimefunAutoCrafter;

public class Auto_Magic_Workbench extends SlimefunAutoCrafter {
	
	   public Auto_Magic_Workbench() {
		   super(SPCItems.category_machine, SPCItems.AUTO_MAGIC_WORKBENCH, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
				   	SlimefunItems.MAGICAL_BOOK_COVER, SPCItems.ENDERITE_PLATE, SlimefunItems.MAGICAL_BOOK_COVER,
		       		SlimefunItems.ENHANCED_AUTO_CRAFTER, new ItemStack(Material.BOOKSHELF), SlimefunItems.ENHANCED_AUTO_CRAFTER,
		       		SlimefunItems.MAGICAL_BOOK_COVER, SPCItems.ENDERITE_PLATE, SlimefunItems.MAGICAL_BOOK_COVER
			    }, RecipeType.MAGIC_WORKBENCH);
	   }
	}
