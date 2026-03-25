package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Ender_Heart extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Ender_Heart() {
	    super(SPCItems.category_material, SPCItems.ENDER_HEART, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		SlimefunItems.ENDER_LUMP_3, new ItemStack(Material.PURPUR_BLOCK), SlimefunItems.ENDER_LUMP_3,
	    		new ItemStack(Material.PURPUR_BLOCK), new ItemStack(Material.ENDER_PEARL), new ItemStack(Material.PURPUR_BLOCK),
	    		SlimefunItems.ENDER_LUMP_3, new ItemStack(Material.PURPUR_BLOCK), SlimefunItems.ENDER_LUMP_3
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}