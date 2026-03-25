package dark.detraismc.SPC_SF.implementation.ingredient;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Tapioca_Flour extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Tapioca_Flour() {
	    super(SPCItems.category_ingredient, SPCItems.TAPIOCA_FLOUR, RecipeType.GRIND_STONE, new ItemStack[] {
	    		SPCItems.CASSAVA, null, null,
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