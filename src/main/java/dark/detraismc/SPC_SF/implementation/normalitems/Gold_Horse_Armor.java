package dark.detraismc.SPC_SF.implementation.normalitems;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.VanillaItem;

public class Gold_Horse_Armor extends VanillaItem {

	  public Gold_Horse_Armor() {
	    super(SPCItems.category_tools, new ItemStack(Material.GOLDEN_HORSE_ARMOR), "SIMPLE_GOLD_HORSE_ARMOR", RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.REINFORCED_LEATHER, new ItemStack(Material.GOLD_INGOT), SPCItems.REINFORCED_LEATHER,
	    		new ItemStack(Material.GOLD_INGOT) , new ItemStack(Material.LEATHER_HORSE_ARMOR), new ItemStack(Material.GOLD_INGOT),
	    		SPCItems.REINFORCED_LEATHER, new ItemStack(Material.GOLD_INGOT), SPCItems.REINFORCED_LEATHER
	    });
	  }
	  
	}