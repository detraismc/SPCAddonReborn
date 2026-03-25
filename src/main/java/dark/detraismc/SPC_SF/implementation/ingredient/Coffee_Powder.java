package dark.detraismc.SPC_SF.implementation.ingredient;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Coffee_Powder extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Coffee_Powder() {
	    super(SPCItems.category_ingredient, SPCItems.COFFEE_POWDER, RecipeType.GRIND_STONE, new ItemStack[] {
	    		SPCItems.COFFEE_BEAN, null, null,
	    		null, null, null,
	    		null, null, null
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}