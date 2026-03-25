package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

public class Egg_Fried_Rice extends CustomFood {

	  public Egg_Fried_Rice() {
	    super(SPCItems.category_masak, SPCItems.EGG_FRIED_RICE, new ItemStack[] {
	    		SPCItems.RICE, SPCItems.SWEET_SOY_SAUCE, new ItemStack(Material.EGG),
	    		SPCItems.MSG, SlimefunItem.getById("VEGETABLE_OIL").getItem(), null,
	    		null, null, null
	    }, 12);
	  }

	}