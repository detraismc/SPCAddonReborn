package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

public class Banana_Split_Sundae extends CustomFood {

	  public Banana_Split_Sundae() {
	    super(SPCItems.category_masak, SPCItems.BANANA_SPLIT_SUNDAE, new ItemStack[] {
	    		SPCItems.BANANA, SlimefunItem.getById("ICE_CREAM").getItem(), SPCItems.CONDENSED_MILK,
	    		null, null, null,
	    		null, null, null
	    }, 17);
	  }

	}