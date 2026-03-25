package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class Katana extends SlimefunItem {

	  public Katana() {
	    super(SPCItems.category_weapon, SPCItems.KATANA, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		null, SPCItems.WEEB_INGOT, null,
	    		null, SPCItems.WEEB_INGOT, null,
	    		null, new ItemStack(Material.STICK), null
	    });
	  }
	}
