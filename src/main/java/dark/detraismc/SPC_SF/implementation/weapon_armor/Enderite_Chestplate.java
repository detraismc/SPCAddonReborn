package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class Enderite_Chestplate extends SlimefunItem {

	  public Enderite_Chestplate() {
	    super(SPCItems.category_armor, SPCItems.ENDERITE_CHESTPLATE, RecipeType.ARMOR_FORGE, new ItemStack[] {
	    		SPCItems.ENDERITE_INGOT, null, SPCItems.ENDERITE_INGOT,
	    		SPCItems.ENDERITE_INGOT, SPCItems.ENDERITE_INGOT, SPCItems.ENDERITE_INGOT,
	    		SPCItems.ENDERITE_INGOT, SPCItems.ENDERITE_INGOT, SPCItems.ENDERITE_INGOT
	    });
	  }
	}