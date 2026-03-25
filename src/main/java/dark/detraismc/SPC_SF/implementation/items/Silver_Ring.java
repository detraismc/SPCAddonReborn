package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Silver_Ring extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Silver_Ring() {
	    super(SPCItems.category_material, SPCItems.SILVER_RING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		null, SlimefunItems.SILVER_INGOT, null,
	    		SlimefunItems.SILVER_INGOT, null, SlimefunItems.SILVER_INGOT,
	    		null, SlimefunItems.SILVER_INGOT, null
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}
