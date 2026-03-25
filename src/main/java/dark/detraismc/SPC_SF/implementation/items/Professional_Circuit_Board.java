package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Professional_Circuit_Board extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Professional_Circuit_Board() {
	    super(SPCItems.category_material, SPCItems.PROFESSIONAL_CIRCUIT_BOARD, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SlimefunItems.ADVANCED_CIRCUIT_BOARD, SPCItems.CORRUPTED_DIAMOND, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
	    		SlimefunItems.GOLD_24K, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.GOLD_24K,
	    		SlimefunItems.ADVANCED_CIRCUIT_BOARD, SPCItems.CORRUPTED_DIAMOND, SlimefunItems.ADVANCED_CIRCUIT_BOARD
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}