package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Void_Dust extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Void_Dust() {
	    super(SPCItems.category_material, SPCItems.VOID_DUST, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		SPCItems.CORRUPTED_DIAMOND, SPCItems.ENDERITE_INGOT, SPCItems.CORRUPTED_DIAMOND,
	    		SPCItems.VOID_ESSENCE, SPCItems.VOID_ESSENCE, SPCItems.VOID_ESSENCE,
	    		SPCItems.CORRUPTED_DIAMOND, SPCItems.ENDERITE_INGOT, SPCItems.CORRUPTED_DIAMOND
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}
