package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

public class Spaghetti extends CustomFood {

	  public Spaghetti() {
	    super(SPCItems.category_masak, SPCItems.SPAGHETTI, new ItemStack[] {
	    		new ItemStack(Material.BEEF), SPCItems.UNCOOK_NOODLE, new ItemStack(Material.BOWL),
	    		SlimefunItem.getById("TOMATO_SOUP").getItem(), null, null,
	    		null, null, null
	    }, 12);
	  }

	}