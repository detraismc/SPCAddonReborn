package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;

public class Beef_Skewer extends CustomFood {

	  public Beef_Skewer() {
	    super(SPCItems.category_masak, SPCItems.BEEF_SKEWER, new ItemStack[] {
	    		new ItemStack(Material.STICK), new ItemStack(Material.BEEF), SPCItems.SWEET_SOY_SAUCE,
	    		SPCItems.CHILI, null, null,
	    		null, null, null
	    }, 12);
	  }

	}