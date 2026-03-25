package dark.detraismc.SPC_SF.implementation.indo_ingredient;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Coffee_Bean extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Coffee_Bean() {
	    super(SPCItems.category_ingredient, SPCItems.COFFEE_BEAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		new ItemStack(Material.MELON_SEEDS), new ItemStack(Material.COCOA_BEANS), new ItemStack(Material.MELON_SEEDS),
	    		new ItemStack(Material.COCOA_BEANS), SPCItems.INDONESIAN_INGREDIENT_LOOTBAG, new ItemStack(Material.COCOA_BEANS),
	    		new ItemStack(Material.MELON_SEEDS), new ItemStack(Material.COCOA_BEANS), new ItemStack(Material.MELON_SEEDS)
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}