package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Iron_Orb extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Iron_Orb() {
	    super(SPCItems.category_material, SPCItems.IRON_ORB, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.BEETROOT), new ItemStack(Material.IRON_BLOCK),
	    		new ItemStack(Material.BEETROOT), new ItemStack(Material.PUMPKIN), new ItemStack(Material.BEETROOT),
	    		new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.BEETROOT), new ItemStack(Material.IRON_BLOCK)
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}
