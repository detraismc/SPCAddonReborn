package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Artificial_Soil extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Artificial_Soil() {
	    super(SPCItems.category_material, SPCItems.ARTIFICIAL_SOIL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.FERTILE_SOIL, SlimefunItems.ALUMINUM_BRASS_INGOT, SPCItems.FERTILE_SOIL,
	    		SlimefunItems.ALUMINUM_BRASS_INGOT, new ItemStack(Material.PODZOL), SlimefunItems.ALUMINUM_BRASS_INGOT,
	    		SPCItems.FERTILE_SOIL, SlimefunItems.ALUMINUM_BRASS_INGOT, SPCItems.FERTILE_SOIL
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}