package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Chicken_Karaage extends CustomFood {

	  public Chicken_Karaage() {
	    super(SPCItems.category_masak, SPCItems.CHICKEN_KARAAGE, new ItemStack[] {
	    		new ItemStack(Material.CHICKEN), SlimefunItems.WHEAT_FLOUR, SPCItems.BREAD_CRUMB,
	    		new ItemStack(Material.EGG), SlimefunItem.getById("VEGETABLE_OIL").getItem(), null,
	    		null, null, null
	    }, 11);
	  }

	}