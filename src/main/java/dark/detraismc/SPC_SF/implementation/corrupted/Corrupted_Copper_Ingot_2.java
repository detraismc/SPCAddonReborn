package dark.detraismc.SPC_SF.implementation.corrupted;

import dark.detraismc.SPC_SF.SPCAddon_RecipeType;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import org.bukkit.inventory.ItemStack;

public class Corrupted_Copper_Ingot_2 extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Corrupted_Copper_Ingot_2() {
	    super(SPCItems.category_material, SPCItems.CORRUPTED_COPPER_INGOT_2, SPCAddon_RecipeType.CORRUPTED_TABLE, new ItemStack[] {
                new SlimefunItemStack(SPCItems.CORRUPTED_COPPER_INGOT, 64), null, null,
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
