package dark.detraismc.SPC_SF.implementation.items;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import org.bukkit.inventory.ItemStack;

public class Ice_King_Coolant_Cell extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	public Ice_King_Coolant_Cell() {
		super(SPCItems.category_material, SPCItems.ICE_KING_COOLANT_CELL, RecipeType.COMPRESSOR, new ItemStack[] {
	    		new SlimefunItemStack(SPCItems.CORRUPTED_REACTOR_COOLANT_CELL_2, 32), null, null,
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
