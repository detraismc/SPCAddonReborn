package dark.detraismc.SPC_SF.implementation.ingredient;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;

public class Fresh_Milk extends CustomFood {

	  public Fresh_Milk() {
	    super(SPCItems.category_ingredient, SPCItems.FRESH_MILK, new ItemStack[] {
	    		new ItemStack(Material.MILK_BUCKET), new ItemStack(Material.MILK_BUCKET), null,
	    		null, null, null,
	    		null, null, null
	    }, 2);
	  }
	}