package dark.detraismc.SPC_SF.implementation.indo_ingredient;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Soybean extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Soybean() {
	    super(SPCItems.category_ingredient, SPCItems.SOYBEAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		new ItemStack(Material.COCOA_BEANS), new ItemStack(Material.MELON_SEEDS), new ItemStack(Material.COCOA_BEANS),
	    		new ItemStack(Material.MELON_SEEDS), SPCItems.INDONESIAN_INGREDIENT_LOOTBAG, new ItemStack(Material.MELON_SEEDS),
	    		new ItemStack(Material.COCOA_BEANS), new ItemStack(Material.MELON_SEEDS), new ItemStack(Material.COCOA_BEANS)
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}