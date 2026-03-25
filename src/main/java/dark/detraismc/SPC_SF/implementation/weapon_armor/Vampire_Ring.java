package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class Vampire_Ring extends SlimefunItem {

	  public Vampire_Ring() {
	    super(SPCItems.category_weapon, SPCItems.VAMPIRE_RING, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		null, SPCItems.VAMPIRE_GEM, null,
	    		null, SPCItems.ENDERITE_RING, null,
	    		null, null, null
	    });
	  }
	}
