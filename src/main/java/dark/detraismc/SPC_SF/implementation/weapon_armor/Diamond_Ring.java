package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class Diamond_Ring extends SlimefunItem {

	  public Diamond_Ring() {
	    super(SPCItems.category_weapon, SPCItems.DIAMOND_RING, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		null, new ItemStack(Material.DIAMOND), null,
	    		null, SPCItems.SILVER_RING, null,
	    		null, null, null
	    });
	  }
	}
