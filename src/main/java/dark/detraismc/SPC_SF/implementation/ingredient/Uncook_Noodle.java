package dark.detraismc.SPC_SF.implementation.ingredient;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Uncook_Noodle extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Uncook_Noodle() {
	    super(SPCItems.category_ingredient, SPCItems.UNCOOK_NOODLE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		new ItemStack(Material.WATER_BUCKET), SlimefunItems.WHEAT_FLOUR, new ItemStack(Material.EGG),
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