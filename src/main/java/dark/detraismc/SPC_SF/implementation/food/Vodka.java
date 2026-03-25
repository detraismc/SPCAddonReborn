package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.ExoticGardenRecipeTypes;
import io.github.thebusybiscuit.slimefun4.implementation.items.food.Juice;

public class Vodka extends Juice {

	  public Vodka() {
	    super(SPCItems.category_masak, SPCItems.VODKA, ExoticGardenRecipeTypes.KITCHEN, new ItemStack[] {
	    		new ItemStack(Material.WATER_BUCKET), SPCItems.FERMENTED_POTATO, new ItemStack(Material.SUGAR),
	    		null, null, null,
	    		null, null, null
	    });
	  }

	}