package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;

public class Mutton_Skewer extends CustomFood {

	  public Mutton_Skewer() {
	    super(SPCItems.category_masak, SPCItems.MUTTON_SKEWER, new ItemStack[] {
	    		new ItemStack(Material.STICK), new ItemStack(Material.MUTTON), SPCItems.SWEET_SOY_SAUCE,
	    		SPCItems.CHILI, null, null,
	    		null, null, null
	    }, 12);
	  }

	}