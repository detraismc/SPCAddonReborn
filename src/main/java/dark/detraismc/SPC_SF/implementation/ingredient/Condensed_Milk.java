package dark.detraismc.SPC_SF.implementation.ingredient;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Condensed_Milk extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Condensed_Milk() {
	    super(SPCItems.category_ingredient, SPCItems.CONDENSED_MILK, RecipeType.SMELTERY, new ItemStack[] {
	    		SPCItems.FRESH_MILK, SPCItems.FRESH_MILK, null,
	    		new ItemStack(Material.SUGAR), new ItemStack(Material.SUGAR), null,
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