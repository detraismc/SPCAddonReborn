package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Enderite_Plate extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	public Enderite_Plate() {
		super(SPCItems.category_material, SPCItems.ENDERITE_PLATE, RecipeType.COMPRESSOR, new ItemStack[] {
	    		new SlimefunItemStack(SPCItems.ENDERITE_INGOT, 8), null, null,
	    		null, null, null,
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
