package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Drill_Head extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Drill_Head() {
	    super(SPCItems.category_material, SPCItems.DRILL_HEAD, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		null, SlimefunItems.REINFORCED_PLATE, null,
	    		SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.IRON_BLOCK), SlimefunItems.REINFORCED_PLATE,
	    		new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK)
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}