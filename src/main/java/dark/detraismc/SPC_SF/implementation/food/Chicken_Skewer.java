package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;

public class Chicken_Skewer extends CustomFood {

	  public Chicken_Skewer() {
	    super(SPCItems.category_masak, SPCItems.CHICKEN_SKEWER, new ItemStack[] {
	    		new ItemStack(Material.STICK), new ItemStack(Material.CHICKEN), SPCItems.PEANUT,
	    		SPCItems.CHILI, null, null,
	    		null, null, null
	    }, 12);
	  }

	}