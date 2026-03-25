package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Obsidian_Gem extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Obsidian_Gem() {
	    super(SPCItems.category_material, SPCItems.OBSIDIAN_GEM, RecipeType.ANCIENT_ALTAR, new ItemStack[] {
	    		new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN),
	    		new ItemStack(Material.OBSIDIAN), new ItemStack(Material.EMERALD), new ItemStack(Material.OBSIDIAN),
	    		new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN)
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}
