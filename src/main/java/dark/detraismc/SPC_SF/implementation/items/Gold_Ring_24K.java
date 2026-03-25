package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Gold_Ring_24K extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Gold_Ring_24K() {
	    super(SPCItems.category_material, SPCItems.GOLD_RING_24K, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		null, SlimefunItems.GOLD_24K, null,
	    		SlimefunItems.GOLD_24K, null, SlimefunItems.GOLD_24K,
	    		null, SlimefunItems.GOLD_24K, null
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}
