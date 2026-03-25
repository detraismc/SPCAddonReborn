package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Nether_Orb extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Nether_Orb() {
	    super(SPCItems.category_material, SPCItems.NETHER_ORB, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		new ItemStack(Material.SOUL_SAND), new ItemStack(Material.SOUL_SAND), new ItemStack(Material.SOUL_SAND),
	    		new ItemStack(Material.WITHER_SKELETON_SKULL), new ItemStack(Material.SOUL_SAND), new ItemStack(Material.WITHER_SKELETON_SKULL),
	    		new ItemStack(Material.SOUL_SAND), new ItemStack(Material.SOUL_SAND), new ItemStack(Material.SOUL_SAND)
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}