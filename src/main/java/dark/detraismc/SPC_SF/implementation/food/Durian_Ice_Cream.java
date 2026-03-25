package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

public class Durian_Ice_Cream extends CustomFood {

	  public Durian_Ice_Cream() {
	    super(SPCItems.category_masak, SPCItems.DURIAN_ICE_CREAM, new ItemStack[] {
	    		SlimefunItem.getById("ICE_CREAM").getItem(), SPCItems.DURIAN, SPCItems.DURIAN,
	    		null, null, null,
	    		null, null, null
	    }, 18);
	  }

	}