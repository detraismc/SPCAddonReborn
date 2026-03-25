package dark.detraismc.SPC_SF.implementation.normalitems;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.VanillaItem;

public class Iron_Horse_Armor extends VanillaItem {

	  public Iron_Horse_Armor() {
	    super(SPCItems.category_tools, new ItemStack(Material.IRON_HORSE_ARMOR), "SIMPLE_IRON_HORSE_ARMOR", RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.REINFORCED_LEATHER, new ItemStack(Material.IRON_INGOT), SPCItems.REINFORCED_LEATHER,
	    		new ItemStack(Material.IRON_INGOT) , new ItemStack(Material.LEATHER_HORSE_ARMOR), new ItemStack(Material.IRON_INGOT),
	    		SPCItems.REINFORCED_LEATHER, new ItemStack(Material.IRON_INGOT), SPCItems.REINFORCED_LEATHER
	    });
	  }
	  
	}