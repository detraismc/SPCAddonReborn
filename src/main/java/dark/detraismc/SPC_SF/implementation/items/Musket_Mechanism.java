package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Musket_Mechanism extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Musket_Mechanism() {
	    super(SPCItems.category_material, SPCItems.MUSKET_MECHANISM, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		new ItemStack(Material.PISTON), SlimefunItems.STEEL_PLATE, new ItemStack(Material.PISTON),
	    		SlimefunItems.STEEL_PLATE, new ItemStack(Material.DISPENSER), SlimefunItems.STEEL_PLATE,
	    		new ItemStack(Material.PISTON), SlimefunItems.STEEL_PLATE, new ItemStack(Material.PISTON)
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}