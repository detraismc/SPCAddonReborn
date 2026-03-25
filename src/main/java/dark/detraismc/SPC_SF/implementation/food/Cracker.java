package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Cracker extends CustomFood {

	  public Cracker() {
	    super(SPCItems.category_masak, SPCItems.CRACKER, new ItemStack[] {
	    		new ItemStack(Material.WATER_BUCKET), SPCItems.TAPIOCA_FLOUR, SlimefunItem.getById("VEGETABLE_OIL").getItem(),
	    		SlimefunItems.SALT, null, null,
	    		null, null, null
	    },6);
	  }

	}