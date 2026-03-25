package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class Ancient_Ring extends SlimefunItem {

	  public Ancient_Ring() {
	    super(SPCItems.category_weapon, SPCItems.ANCIENT_RING, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		null, SPCItems.ANCIENT_COMPONENT, null,
	    		SPCItems.ANCIENT_COMPONENT, SPCItems.VOID_RING, SPCItems.ANCIENT_COMPONENT,
	    		null, SPCItems.ANCIENT_COMPONENT, null
	    });
	  }
	}
