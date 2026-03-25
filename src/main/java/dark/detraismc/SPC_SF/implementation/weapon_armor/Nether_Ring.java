package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class Nether_Ring extends SlimefunItem {

	  public Nether_Ring() {
	    super(SPCItems.category_weapon, SPCItems.NETHER_RING, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		null, new ItemStack(Material.NETHER_STAR), null,
	    		null, SPCItems.GOLD_RING_24K, null,
	    		null, null, null
	    });
	  }
	}
