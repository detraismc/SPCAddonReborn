package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Ender_Orb extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Ender_Orb() {
	    super(SPCItems.category_material, SPCItems.ENDER_ORB, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		new ItemStack(Material.ENDER_EYE), new ItemStack(Material.END_CRYSTAL), new ItemStack(Material.ENDER_EYE),
	    		new ItemStack(Material.END_CRYSTAL), new ItemStack(Material.CHORUS_FRUIT), new ItemStack(Material.END_CRYSTAL),
	    		new ItemStack(Material.ENDER_EYE), new ItemStack(Material.END_CRYSTAL), new ItemStack(Material.ENDER_EYE)
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}
