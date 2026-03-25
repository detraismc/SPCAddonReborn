package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Hot_Fried_Chicken extends CustomFood {

	  public Hot_Fried_Chicken() {
	    super(SPCItems.category_masak, SPCItems.HOT_FRIED_CHICKEN, new ItemStack[] {
	    		new ItemStack(Material.CHICKEN), SlimefunItems.WHEAT_FLOUR, SPCItems.CHILI_POWDER,
	    		SPCItems.CHILI_POWDER, new ItemStack(Material.EGG), SlimefunItem.getById("VEGETABLE_OIL").getItem(),
	    		null, null, null
	    }, 16);
	  }

	}