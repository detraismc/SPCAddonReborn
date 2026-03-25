package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Healing_Herb extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Healing_Herb() {
	    super(SPCItems.category_material, SPCItems.HEALING_HERB, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		new ItemStack(Material.JUNGLE_LEAVES), new ItemStack(Material.NETHER_WART), new ItemStack(Material.DARK_OAK_LEAVES),
	    		new ItemStack(Material.JUNGLE_LEAVES), new ItemStack(Material.NETHER_WART), new ItemStack(Material.DARK_OAK_LEAVES),
	    		new ItemStack(Material.JUNGLE_LEAVES), new ItemStack(Material.NETHER_WART), new ItemStack(Material.DARK_OAK_LEAVES)
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}