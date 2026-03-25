package dark.detraismc.SPC_SF.implementation.normalitems;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.VanillaItem;

public class Nametag extends VanillaItem {

	  public Nametag() {
	    super(SPCItems.category_tools, new ItemStack(Material.NAME_TAG), "SIMPLE_NAMETAG", RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		null, null, new ItemStack(Material.IRON_CHAIN),
	    		new ItemStack(Material.INK_SAC), SlimefunItems.SILVER_INGOT, null,
	    		SlimefunItems.SILVER_INGOT, null, null
	    });
	  }
	  
	}