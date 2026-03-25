package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Magnesium_Artificial_Seeds extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Magnesium_Artificial_Seeds() {
	    super(SPCItems.category_material, SPCItems.MAGNESIUM_ARTIFICIAL_SEEDS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		new ItemStack(Material.WHEAT_SEEDS), SlimefunItems.MAGNESIUM_DUST, new ItemStack(Material.WHEAT_SEEDS),
	    		SlimefunItems.MAGNESIUM_DUST, SlimefunItem.getById("IRON_PLANT").getItem(), SlimefunItems.MAGNESIUM_DUST,
	    		new ItemStack(Material.WHEAT_SEEDS), SlimefunItems.MAGNESIUM_DUST, new ItemStack(Material.WHEAT_SEEDS)
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}