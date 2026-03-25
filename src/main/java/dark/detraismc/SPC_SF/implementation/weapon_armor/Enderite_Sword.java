package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class Enderite_Sword extends SlimefunItem {

	  public Enderite_Sword() {
	    super(SPCItems.category_weapon, SPCItems.ENDERITE_SWORD, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		null, SPCItems.ENDERITE_INGOT, null,
	    		null, SPCItems.ENDERITE_INGOT, null,
	    		null, new ItemStack(Material.END_ROD), null
	    });
	  }
	}