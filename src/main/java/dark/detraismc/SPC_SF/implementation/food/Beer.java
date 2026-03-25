package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.ExoticGardenRecipeTypes;
import io.github.thebusybiscuit.slimefun4.implementation.items.food.Juice;

public class Beer extends Juice {

	  public Beer() {
	    super(SPCItems.category_masak, SPCItems.BEER, ExoticGardenRecipeTypes.KITCHEN, new ItemStack[] {
	    		new ItemStack(Material.WATER_BUCKET), SPCItems.FERMENTED_WHEAT, new ItemStack(Material.SUGAR),
	    		null, null, null,
	    		null, null, null
	    });
	  }

	}