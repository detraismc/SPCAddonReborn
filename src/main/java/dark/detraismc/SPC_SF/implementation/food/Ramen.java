package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

public class Ramen extends CustomFood {

	  public Ramen() {
	    super(SPCItems.category_masak, SPCItems.RAMEN, new ItemStack[] {
	    		new ItemStack(Material.BOWL), new ItemStack(Material.WATER_BUCKET), SPCItems.UNCOOK_NOODLE,
	    		new ItemStack(Material.EGG), SlimefunItem.getById("VEGETABLE_OIL").getItem(), SlimefunItem.getById("BACON").getItem(),
	    		SPCItems.NORI, null, null
	    }, 15);
	  }

	}