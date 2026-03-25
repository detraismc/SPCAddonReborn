package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Cilok extends CustomFood {

	  public Cilok() {
	    super(SPCItems.category_masak, SPCItems.CILOK, new ItemStack[] {
	    		new ItemStack(Material.WATER_BUCKET), SPCItems.TAPIOCA_FLOUR, SPCItems.CHILI_POWDER,
	    		SlimefunItems.SALT, SPCItems.PEANUT, null,
	    		null, null, null
	    }, 8);
	  }

	}