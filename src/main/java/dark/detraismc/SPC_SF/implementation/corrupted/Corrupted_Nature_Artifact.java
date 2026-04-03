package dark.detraismc.SPC_SF.implementation.corrupted;

import dark.detraismc.SPC_SF.SPCAddon_RecipeType;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import org.bukkit.inventory.ItemStack;

public class Corrupted_Nature_Artifact extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Corrupted_Nature_Artifact() {
	    super(SPCItems.category_material, SPCItems.CORRUPTED_NATURE_ARTIFACT, SPCAddon_RecipeType.CORRUPTED_TABLE, new ItemStack[] {
                new SlimefunItemStack(SPCItems.NATURE_ARTIFACT, 64), null, null,
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
