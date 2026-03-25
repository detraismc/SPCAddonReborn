package dark.detraismc.SPC_SF.implementation.corrupted;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCAddon_RecipeType;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Corrupted_Gold_Ingot extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Corrupted_Gold_Ingot() {
	    super(SPCItems.category_material, SPCItems.CORRUPTED_GOLD_INGOT, SPCAddon_RecipeType.CORRUPTED_TABLE, new ItemStack[] {
	    		new ItemStack(Material.GOLD_INGOT, 64), null, null,
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
