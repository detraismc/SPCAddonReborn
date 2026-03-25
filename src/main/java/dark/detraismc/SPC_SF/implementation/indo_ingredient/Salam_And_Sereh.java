package dark.detraismc.SPC_SF.implementation.indo_ingredient;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Salam_And_Sereh extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Salam_And_Sereh() {
	    super(SPCItems.category_ingredient, SPCItems.SALAM_AND_SEREH, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		new ItemStack(Material.SHORT_GRASS), new ItemStack(Material.KELP), new ItemStack(Material.SHORT_GRASS),
	    		new ItemStack(Material.KELP), SPCItems.INDONESIAN_INGREDIENT_LOOTBAG, new ItemStack(Material.KELP),
	    		new ItemStack(Material.SHORT_GRASS), new ItemStack(Material.KELP), new ItemStack(Material.SHORT_GRASS)
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}