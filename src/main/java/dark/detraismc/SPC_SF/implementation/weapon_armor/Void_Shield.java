package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class Void_Shield extends SlimefunItem {

	  public Void_Shield() {
	    super(SPCItems.category_weapon, SPCItems.VOID_SHIELD, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		null, SPCItems.VOID_INGOT, null,
	    		SPCItems.VOID_INGOT, new ItemStack(Material.SHIELD), SPCItems.VOID_INGOT,
	    		null, SPCItems.VOID_INGOT, null
	    });
	  }
	}
