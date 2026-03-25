package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Beef_Rendang extends CustomFood {

	  public Beef_Rendang() {
	    super(SPCItems.category_masak, SPCItems.BEEF_RENDANG, new ItemStack[] {
	    		new ItemStack(Material.BEEF), SPCItems.SALAM_AND_SEREH, SlimefunItem.getById("COCONUT_MILK").getItem(),
	    		SlimefunItem.getById("VEGETABLE_OIL").getItem(), SlimefunItems.SALT, SPCItems.MSG,
	    		SPCItems.CHILI_POWDER, null, null
	    }, 18);
	  }

	}