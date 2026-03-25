package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Weeb_Ingot extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Weeb_Ingot() {
	    super(SPCItems.category_material, SPCItems.WEEB_INGOT, RecipeType.SMELTERY, new ItemStack[] {
	    		SPCItems.FOLDED_STEEL_PLATE, SPCItems.FOLDED_STEEL_PLATE, SlimefunItems.REDSTONE_ALLOY,
	    		SlimefunItems.ALUMINUM_BRONZE_INGOT, null, null,
	    		null, null, null
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}
