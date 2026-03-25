package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Void_Gem extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Void_Gem() {
	    super(SPCItems.category_material, SPCItems.VOID_GEM, RecipeType.ANCIENT_ALTAR, new ItemStack[] {
	    		new ItemStack(Material.EMERALD_BLOCK), SPCItems.CORRUPTED_ENDER_EYE_2, new ItemStack(Material.EMERALD_BLOCK),
	    		SPCItems.CORRUPTED_ENDER_EYE_2, SPCItems.VOID_INGOT, SPCItems.CORRUPTED_ENDER_EYE_2,
	    		new ItemStack(Material.EMERALD_BLOCK), SPCItems.CORRUPTED_ENDER_EYE_2, new ItemStack(Material.EMERALD_BLOCK)
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}
