package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Sapphire_Ring extends SlimefunItem {

	  public Sapphire_Ring() {
	    super(SPCItems.category_weapon, SPCItems.SAPPHIRE_RING, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		null, SlimefunItems.SYNTHETIC_SAPPHIRE, null,
	    		null, SPCItems.SILVER_RING, null,
	    		null, null, null
	    });
	  }
	}
