package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Fried_Banana extends CustomFood {

	  public Fried_Banana() {
	    super(SPCItems.category_masak, SPCItems.FRIED_BANANA, new ItemStack[] {
	    		SPCItems.BANANA, SlimefunItems.WHEAT_FLOUR, new ItemStack(Material.SUGAR),
	    		SlimefunItem.getById("VEGETABLE_OIL").getItem(), null, null,
	    		null, null, null
	    }, 9);
	  }

	}