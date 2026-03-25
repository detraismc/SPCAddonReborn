package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Fertile_Soil extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Fertile_Soil() {
	    super(SPCItems.category_material, SPCItems.FERTILE_SOIL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.INDONESIAN_INGREDIENT_LOOTBAG, SlimefunItems.EARTH_RUNE, SPCItems.INDONESIAN_INGREDIENT_LOOTBAG,
	    		SlimefunItems.EARTH_RUNE, SPCItems.INDONESIAN_INGREDIENT_LOOTBAG, SlimefunItems.EARTH_RUNE,
	    		SPCItems.INDONESIAN_INGREDIENT_LOOTBAG, SlimefunItems.EARTH_RUNE, SPCItems.INDONESIAN_INGREDIENT_LOOTBAG
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}