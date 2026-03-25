package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class Guardian_Ring extends SlimefunItem {

	  public Guardian_Ring() {
	    super(SPCItems.category_weapon, SPCItems.GUARDIAN_RING, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		null, SPCItems.GUARDIAN_GEM, null,
	    		null, SPCItems.NETHERITE_RING, null,
	    		null, null, null
	    });
	  }
	}
