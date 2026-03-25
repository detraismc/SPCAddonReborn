package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import dark.detraismc.SPC_SF.SPCAddon_RecipeType;
import dark.detraismc.SPC_SF.SPC_Food;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Fanta extends SPC_Food {

	  public Fanta() {
	    super(SPCItems.category_masak, SPCItems.FANTA, SPCAddon_RecipeType.VENDING_MACHINE, new ItemStack[] {
	    		SlimefunItems.REDSTONE_ALLOY, null, null,
	    		null, null, null,
	    		null, null, null
	    }, 9);
	  }

	}