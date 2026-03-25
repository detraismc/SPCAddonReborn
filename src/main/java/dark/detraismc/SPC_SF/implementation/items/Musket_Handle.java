package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Musket_Handle extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Musket_Handle() {
	    super(SPCItems.category_material, SPCItems.MUSKET_HANDLE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		null, null, null,
	    		SPCItems.WOOD_RESIN, SPCItems.WOOD_RESIN, SPCItems.WOOD_RESIN,
	    		null, null, SPCItems.WOOD_RESIN
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}