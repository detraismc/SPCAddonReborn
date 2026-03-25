package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;

public class Coffee extends CustomFood {

	  public Coffee() {
	    super(SPCItems.category_masak, SPCItems.COFFEE, new ItemStack[] {
	    		new ItemStack(Material.WATER_BUCKET), SPCItems.COFFEE_POWDER, new ItemStack(Material.SUGAR),
	    		null, null, null,
	    		null, null, null
	    },8);
	  }

	}