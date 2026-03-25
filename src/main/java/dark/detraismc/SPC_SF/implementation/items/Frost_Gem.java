package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Frost_Gem extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Frost_Gem() {
	    super(SPCItems.category_material, SPCItems.FROST_GEM, RecipeType.ANCIENT_ALTAR, new ItemStack[] {
	    		SlimefunItems.COOLING_UNIT, SPCItems.CORRUPTED_BONE_2, SlimefunItems.COOLING_UNIT,
	    		SPCItems.CORRUPTED_BONE_2, SPCItems.CORRUPTED_IRON_INGOT, SPCItems.CORRUPTED_BONE_2,
	    		SlimefunItems.COOLING_UNIT, SPCItems.CORRUPTED_BONE_2, SlimefunItems.COOLING_UNIT
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}
