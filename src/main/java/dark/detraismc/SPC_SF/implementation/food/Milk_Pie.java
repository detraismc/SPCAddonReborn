package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Milk_Pie extends CustomFood {

	  public Milk_Pie() {
	    super(SPCItems.category_masak, SPCItems.MILK_PIE, new ItemStack[] {
	    		SPCItems.CONDENSED_MILK, new ItemStack(Material.EGG), SlimefunItems.HEAVY_CREAM,
	    		SlimefunItems.WHEAT_FLOUR, null, null,
	    		null, null, null
	    }, 13);
	  }

	}