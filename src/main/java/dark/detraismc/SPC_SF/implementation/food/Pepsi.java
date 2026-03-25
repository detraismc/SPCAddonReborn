package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import dark.detraismc.SPC_SF.SPCAddon_RecipeType;
import dark.detraismc.SPC_SF.SPC_Food;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Pepsi extends SPC_Food {

	  public Pepsi() {
	    super(SPCItems.category_masak, SPCItems.PEPSI, SPCAddon_RecipeType.VENDING_MACHINE, new ItemStack[] {
	    		SlimefunItems.COBALT_INGOT, null, null,
	    		null, null, null,
	    		null, null, null
	    }, 9);
	  }

	}