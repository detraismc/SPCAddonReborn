package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Crops_Motor extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Crops_Motor() {
	    super(SPCItems.category_material, SPCItems.CROPS_MOTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SlimefunItems.TIN_INGOT, SlimefunItems.CARBONADO, SlimefunItems.TIN_INGOT,
	    		SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.DIAMOND_HOE), SlimefunItems.ELECTRIC_MOTOR,
	    		SlimefunItems.MAGNESIUM_SALT, SlimefunItems.BIG_CAPACITOR, SlimefunItems.MAGNESIUM_SALT
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}