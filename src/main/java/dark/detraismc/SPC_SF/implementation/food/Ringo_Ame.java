package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

public class Ringo_Ame extends CustomFood {

	  public Ringo_Ame() {
	    super(SPCItems.category_masak, SPCItems.RINGO_AME, new ItemStack[] {
	    		new ItemStack(Material.APPLE), SlimefunItem.getById("BROWN_SUGAR").getItem(), null,
	    		null, null, null,
	    		null, null, null
	    }, 6);
	  }

	}