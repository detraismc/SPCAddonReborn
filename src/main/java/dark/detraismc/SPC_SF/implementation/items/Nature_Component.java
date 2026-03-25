package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Nature_Component extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Nature_Component() {
	    super(SPCItems.category_material, SPCItems.NATURE_COMPONENT, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.NATURE_ARTIFACT, SPCItems.CORRUPTED_OAK_LOG_2, SPCItems.NATURE_ARTIFACT,
	    		SlimefunItems.CARGO_INPUT_NODE, SPCItems.NATURE_ARTIFACT, SlimefunItems.CARGO_OUTPUT_NODE,
	    		SPCItems.NATURE_ARTIFACT, SPCItems.CORRUPTED_DARK_OAK_LOG_2, SPCItems.NATURE_ARTIFACT
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}