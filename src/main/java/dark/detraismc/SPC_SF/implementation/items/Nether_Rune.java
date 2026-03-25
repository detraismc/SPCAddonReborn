package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Nether_Rune extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Nether_Rune() {
	    super(SPCItems.category_material, SPCItems.NETHER_RUNE, RecipeType.ANCIENT_ALTAR, new ItemStack[] {
	    		SlimefunItems.SULFATE, SlimefunItems.FIRE_RUNE, new ItemStack(Material.LAVA_BUCKET),
	    		SlimefunItems.FIRE_RUNE, SlimefunItems.BLANK_RUNE, SlimefunItems.FIRE_RUNE,
	    		new ItemStack(Material.LAVA_BUCKET), SlimefunItems.FIRE_RUNE, SlimefunItems.SULFATE
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}