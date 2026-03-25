package dark.detraismc.SPC_SF.implementation.indo_ingredient;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;

public class Mango extends CustomFood {

	  public Mango() {
	    super(SPCItems.category_ingredient, SPCItems.MANGO, new ItemStack[] {
	    		null, new ItemStack(Material.SWEET_BERRIES), null,
	    		new ItemStack(Material.APPLE), SPCItems.INDONESIAN_INGREDIENT_LOOTBAG, new ItemStack(Material.APPLE),
	    		null, new ItemStack(Material.SWEET_BERRIES), null
	    },1);
	  }

	}