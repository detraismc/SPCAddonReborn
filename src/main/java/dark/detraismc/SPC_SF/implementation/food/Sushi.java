package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;

public class Sushi extends CustomFood {

	  public Sushi() {
	    super(SPCItems.category_masak, SPCItems.SUSHI, new ItemStack[] {
	    		new ItemStack(Material.SALMON), SPCItems.NORI, SPCItems.RICE,
	    		SPCItems.SOY_SAUCE, null, null,
	    		null, null, null
	    }, 10);
	  }

	}