package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Atlantic_Dust extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Atlantic_Dust() {
	    super(SPCItems.category_material, SPCItems.ATLANTIC_DUST, RecipeType.ANCIENT_ALTAR, new ItemStack[] {
	    		new ItemStack(Material.PRISMARINE_BRICKS), SlimefunItems.WATER_RUNE, new ItemStack(Material.PRISMARINE_BRICKS),
	    		SlimefunItems.WATER_RUNE, new ItemStack(Material.DIAMOND_BLOCK), SlimefunItems.WATER_RUNE,
	    		new ItemStack(Material.PRISMARINE_BRICKS), SlimefunItems.WATER_RUNE, new ItemStack(Material.PRISMARINE_BRICKS)
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}