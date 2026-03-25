package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Rope extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Rope() {
	    super(SPCItems.category_material, SPCItems.ROPE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		null, new ItemStack(Material.STRING), null,
	    		null, new ItemStack(Material.STRING), null,
	    		null, new ItemStack(Material.STRING), null
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}