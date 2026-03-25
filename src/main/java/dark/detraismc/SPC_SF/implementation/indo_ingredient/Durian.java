package dark.detraismc.SPC_SF.implementation.indo_ingredient;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Durian extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Durian() {
	    super(SPCItems.category_ingredient, SPCItems.DURIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		new ItemStack(Material.OAK_SAPLING), new ItemStack(Material.CACTUS), new ItemStack(Material.OAK_SAPLING),
	    		new ItemStack(Material.CACTUS), SPCItems.INDONESIAN_INGREDIENT_LOOTBAG, new ItemStack(Material.CACTUS),
	    		new ItemStack(Material.OAK_SAPLING), new ItemStack(Material.CACTUS), new ItemStack(Material.OAK_SAPLING)
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}