package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Ultimate_Core extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Ultimate_Core() {
	    super(SPCItems.category_material, SPCItems.ULTIMATE_CORE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.REINFORCED_SHULKER_SHELL, SPCItems.PROFESSIONAL_CIRCUIT_BOARD,
	    		SPCItems.CORRUPTED_ELITE_INGOT, SlimefunItems.POWER_CRYSTAL, SPCItems.CORRUPTED_ELITE_INGOT,
	    		SPCItems.REINFORCED_SHULKER_SHELL, SlimefunItems.BLISTERING_INGOT_3, SPCItems.REINFORCED_SHULKER_SHELL
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}