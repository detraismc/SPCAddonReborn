package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Ender_Debris extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Ender_Debris() {
	    super(SPCItems.category_material, SPCItems.ENDER_DEBRIS, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		SPCItems.ENDER_HEART, SPCItems.ENDER_DRAGON_SCALES, SPCItems.ENDER_HEART,
	    		SPCItems.ENDER_DRAGON_SCALES, new ItemStack(Material.DIAMOND_ORE), SPCItems.ENDER_DRAGON_SCALES,
	    		SPCItems.ENDER_HEART, SPCItems.ENDER_DRAGON_SCALES, SPCItems.ENDER_HEART
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}