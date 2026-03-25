package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import dark.detraismc.SPC_SF.SPCAddon_RecipeType;
import dark.detraismc.SPC_SF.SPC_Food;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Coca_Cola extends SPC_Food {

	  public Coca_Cola() {
	    super(SPCItems.category_masak, SPCItems.COCA_COLA, SPCAddon_RecipeType.VENDING_MACHINE, new ItemStack[] {
	    		SlimefunItems.BRONZE_INGOT, null, null,
	    		null, null, null,
	    		null, null, null
	    }, 9);
	  }

	}