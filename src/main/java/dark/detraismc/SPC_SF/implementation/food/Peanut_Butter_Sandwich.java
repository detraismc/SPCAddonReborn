package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Peanut_Butter_Sandwich extends CustomFood {

	  public Peanut_Butter_Sandwich() {
	    super(SPCItems.category_masak, SPCItems.PEANUT_BUTTER_SANDWICH, new ItemStack[] {
	    		new ItemStack(Material.BREAD), SPCItems.PEANUT, new ItemStack(Material.BREAD),
	    		null, SlimefunItems.BUTTER, null,
	    		null, null, null
	    }, 12);
	  }

	}