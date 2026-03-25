package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;

public class Spicy_Chicken_Noodle extends CustomFood {

	  public Spicy_Chicken_Noodle() {
	    super(SPCItems.category_masak, SPCItems.SPICY_CHICKEN_NOODLE, new ItemStack[] {
	    		SPCItems.CHICKEN_NOODLE, SPCItems.CHILI, SPCItems.CHILI,
	    		SPCItems.CHILI, SPCItems.CHILI, null,
	    		null, null, null
	    }, 16);
	  }

	}