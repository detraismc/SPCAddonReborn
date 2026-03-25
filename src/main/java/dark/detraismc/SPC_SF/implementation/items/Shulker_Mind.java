package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Shulker_Mind extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Shulker_Mind() {
	    super(SPCItems.category_material, SPCItems.SHULKER_MIND, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SlimefunItems.ADVANCED_CIRCUIT_BOARD, SPCItems.REINFORCED_SHULKER_SHELL, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
	    		new ItemStack(Material.SHULKER_SHELL), new ItemStack(Material.BEACON), new ItemStack(Material.SHULKER_SHELL),
	    		SlimefunItems.ADVANCED_CIRCUIT_BOARD, SPCItems.REINFORCED_SHULKER_SHELL, SlimefunItems.ADVANCED_CIRCUIT_BOARD
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}