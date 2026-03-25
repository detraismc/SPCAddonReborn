package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

public class Milk_Tea extends CustomFood {

	  public Milk_Tea() {
	    super(SPCItems.category_masak, SPCItems.MILK_TEA, new ItemStack[] {
	    		SPCItems.CONDENSED_MILK, SlimefunItem.getById("SWEETENED_TEA").getItem(), null,
	    		null, null, null,
	    		null, null, null
	    }, 9);
	  }

	}