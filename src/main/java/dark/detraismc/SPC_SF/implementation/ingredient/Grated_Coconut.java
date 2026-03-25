package dark.detraismc.SPC_SF.implementation.ingredient;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Grated_Coconut extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Grated_Coconut() {
	    super(SPCItems.category_ingredient, SPCItems.GRATED_COCONUT, RecipeType.GRIND_STONE, new ItemStack[] {
	    		SlimefunItem.getById("COCONUT").getItem(), null, null,
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