package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Artifact_Power_Core extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Artifact_Power_Core() {
	    super(SPCItems.category_material, SPCItems.ARTIFACT_POWER_CORE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.ARTIFACT_CIRCUIT_BOARD, SPCItems.CORRUPTED_CRIMSON_STEM_2, SPCItems.ARTIFACT_CIRCUIT_BOARD,
	    		SPCItems.CORRUPTED_GOLD_INGOT_2, SlimefunItems.POWER_CRYSTAL, SPCItems.CORRUPTED_GOLD_INGOT_2,
	    		SPCItems.ARTIFACT_CIRCUIT_BOARD, SPCItems.CORRUPTED_WARPED_STEM_2, SPCItems.ARTIFACT_CIRCUIT_BOARD
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}