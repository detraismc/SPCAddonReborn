package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.ExoticGardenRecipeTypes;
import io.github.thebusybiscuit.slimefun4.implementation.items.food.Juice;

public class Red_Wine extends Juice {

	  public Red_Wine() {
	    super(SPCItems.category_masak, SPCItems.RED_WINE, ExoticGardenRecipeTypes.KITCHEN, new ItemStack[] {
	    		new ItemStack(Material.WATER_BUCKET), SPCItems.FERMENTED_GRAPE, new ItemStack(Material.SUGAR),
	    		null, null, null,
	    		null, null, null
	    });
	  }

	}