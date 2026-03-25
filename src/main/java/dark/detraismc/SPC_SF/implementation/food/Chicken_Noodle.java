package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Chicken_Noodle extends CustomFood {

	  public Chicken_Noodle() {
	    super(SPCItems.category_masak, SPCItems.CHICKEN_NOODLE, new ItemStack[] {
	    		new ItemStack(Material.COOKED_CHICKEN), SPCItems.UNCOOK_NOODLE, new ItemStack(Material.BOWL),
	    		SlimefunItem.getById("VEGETABLE_OIL").getItem(), SlimefunItems.SALT, null,
	    		null, null, null
	    }, 11);
	  }

	}