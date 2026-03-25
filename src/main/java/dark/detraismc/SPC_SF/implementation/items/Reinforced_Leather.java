package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Reinforced_Leather extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Reinforced_Leather() {
	    super(SPCItems.category_material, SPCItems.REINFORCED_LEATHER, RecipeType.COMPRESSOR, new ItemStack[] {
	    		new ItemStack(Material.LEATHER, 8), null, null,
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