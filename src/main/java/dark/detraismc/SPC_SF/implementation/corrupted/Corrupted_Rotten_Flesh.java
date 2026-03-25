package dark.detraismc.SPC_SF.implementation.corrupted;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCAddon_RecipeType;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Corrupted_Rotten_Flesh extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Corrupted_Rotten_Flesh() {
	    super(SPCItems.category_material, SPCItems.CORRUPTED_ROTTEN_FLESH, SPCAddon_RecipeType.CORRUPTED_TABLE, new ItemStack[] {
	    		new ItemStack(Material.ROTTEN_FLESH, 64), null, null,
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
