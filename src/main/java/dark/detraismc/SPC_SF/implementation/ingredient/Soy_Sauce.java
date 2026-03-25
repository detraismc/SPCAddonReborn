package dark.detraismc.SPC_SF.implementation.ingredient;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Soy_Sauce extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Soy_Sauce() {
	    super(SPCItems.category_ingredient, SPCItems.SOY_SAUCE, RecipeType.SMELTERY, new ItemStack[] {
	    		SPCItems.SOYBEAN, new ItemStack(Material.WATER_BUCKET), SlimefunItems.SALT,
	    		new ItemStack(Material.WHEAT), null, null,
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