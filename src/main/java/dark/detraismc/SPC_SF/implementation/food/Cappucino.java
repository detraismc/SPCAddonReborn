package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;

public class Cappucino extends CustomFood {

	  public Cappucino() {
	    super(SPCItems.category_masak, SPCItems.CAPPUCINO, new ItemStack[] {
	    		SPCItems.FRESH_MILK, SPCItems.COFFEE, SPCItems.CHOCOLATE_POWDER,
	    		null, null, null,
	    		null, null, null
	    },9);
	  }

	}