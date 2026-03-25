package dark.detraismc.SPC_SF.implementation.ingredient;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Fermented_Potato extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Fermented_Potato() {
	    super(SPCItems.category_ingredient, SPCItems.FERMENTED_POTATO, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		new ItemStack(Material.BROWN_MUSHROOM), new ItemStack(Material.POTATO), new ItemStack(Material.SUGAR),
	    		new ItemStack(Material.POTATO), new ItemStack(Material.POTATO), new ItemStack(Material.POTATO),
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