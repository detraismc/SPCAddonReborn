package dark.detraismc.SPC_SF.implementation.normalitems;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.VanillaItem;

public class Enchanted_Golden_Apple extends VanillaItem {

	  public Enchanted_Golden_Apple() {
	    super(SPCItems.category_consumable, new ItemStack(Material.ENCHANTED_GOLDEN_APPLE), "SIMPLE_ENCHANTED_GOLDEN_APPLE", RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SlimefunItems.GOLD_24K_BLOCK, SlimefunItems.GOLD_24K_BLOCK, SlimefunItems.GOLD_24K_BLOCK,
	    		SlimefunItems.GOLD_24K_BLOCK, new ItemStack(Material.GOLDEN_APPLE), SlimefunItems.GOLD_24K_BLOCK,
	    		SlimefunItems.GOLD_24K_BLOCK, SlimefunItems.GOLD_24K_BLOCK, SlimefunItems.GOLD_24K_BLOCK
	    });
	  }
	}