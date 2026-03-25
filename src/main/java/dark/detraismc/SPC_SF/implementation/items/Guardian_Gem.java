package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Guardian_Gem extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Guardian_Gem() {
	    super(SPCItems.category_material, SPCItems.GUARDIAN_GEM, RecipeType.ANCIENT_ALTAR, new ItemStack[] {
	    		SPCItems.CORRUPTED_IRON_INGOT, SPCItems.CORRUPTED_GOLD_INGOT, SPCItems.CORRUPTED_IRON_INGOT,
	    		SPCItems.CORRUPTED_GOLD_INGOT, SPCItems.CORRUPTED_DIAMOND, SPCItems.CORRUPTED_GOLD_INGOT,
	    		SPCItems.CORRUPTED_IRON_INGOT, SPCItems.CORRUPTED_GOLD_INGOT, SPCItems.CORRUPTED_IRON_INGOT
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}
