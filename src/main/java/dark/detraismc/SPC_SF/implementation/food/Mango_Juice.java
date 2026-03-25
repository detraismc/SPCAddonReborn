package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.food.Juice;

public class Mango_Juice extends Juice {

	  public Mango_Juice() {
	    super(SPCItems.category_masak, SPCItems.MANGO_JUICE, RecipeType.JUICER, new ItemStack[] {
	    		SPCItems.MANGO, null, null,
	    		null, null, null,
	    		null, null, null
	    });
	  }

	}