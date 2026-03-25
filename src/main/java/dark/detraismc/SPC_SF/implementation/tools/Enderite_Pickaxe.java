package dark.detraismc.SPC_SF.implementation.tools;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class Enderite_Pickaxe extends SlimefunItem {

	  public Enderite_Pickaxe() {
	    super(SPCItems.category_tools, SPCItems.ENDERITE_PICKAXE, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		SPCItems.ENDERITE_INGOT, SPCItems.ENDERITE_INGOT, SPCItems.ENDERITE_INGOT,
	    		null, SPCItems.NETHERITE_PLATE, null,
	    		null, new ItemStack(Material.END_ROD), null
	    });
	  }
	}