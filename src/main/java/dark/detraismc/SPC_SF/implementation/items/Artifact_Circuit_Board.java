package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Artifact_Circuit_Board extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Artifact_Circuit_Board() {
	    super(SPCItems.category_material, SPCItems.ARTIFACT_CIRCUIT_BOARD, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.BIFURCATING_COMPONENT, SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.BIFURCATING_COMPONENT,
	    		SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.BIFURCATING_COMPONENT, SPCItems.PROFESSIONAL_CIRCUIT_BOARD,
	    		SPCItems.BIFURCATING_COMPONENT, SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.BIFURCATING_COMPONENT
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}