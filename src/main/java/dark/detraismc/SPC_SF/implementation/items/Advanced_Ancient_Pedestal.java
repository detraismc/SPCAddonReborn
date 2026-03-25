package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Advanced_Ancient_Pedestal extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Advanced_Ancient_Pedestal() {
	    super(SPCItems.category_material, SPCItems.ADVANCED_ANCIENT_PEDESTAL, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		SlimefunItems.ANCIENT_PEDESTAL, SlimefunItems.ANCIENT_PEDESTAL, SlimefunItems.ANCIENT_PEDESTAL,
	    		SlimefunItems.ANCIENT_PEDESTAL, SlimefunItems.ESSENCE_OF_AFTERLIFE, SlimefunItems.ANCIENT_PEDESTAL,
	    		SlimefunItems.ANCIENT_PEDESTAL, SlimefunItems.ANCIENT_PEDESTAL, SlimefunItems.ANCIENT_PEDESTAL
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}