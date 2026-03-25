package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCAddon_RecipeType;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Basic_Artifact extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Basic_Artifact() {
	    super(SPCItems.category_material, SPCItems.BASIC_ARTIFACT, SPCAddon_RecipeType.ARTIFACT_SCAN, new ItemStack[] {
	    		null, null, null,
	    		null, SPCItems.UNIDENTIFIED_ARTIFACT, null,
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