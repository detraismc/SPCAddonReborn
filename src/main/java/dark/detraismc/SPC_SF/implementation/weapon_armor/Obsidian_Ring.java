package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class Obsidian_Ring extends SlimefunItem {

	  public Obsidian_Ring() {
	    super(SPCItems.category_weapon, SPCItems.OBSIDIAN_RING, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		null, SPCItems.OBSIDIAN_GEM, null,
	    		null, SPCItems.SILVER_RING, null,
	    		null, null, null
	    });
	  }
	}
