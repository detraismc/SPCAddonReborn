package dark.detraismc.SPC_SF.implementation.food;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import dark.detraismc.SPC_SF.SPCAddon_RecipeType;
import dark.detraismc.SPC_SF.SPC_Food;

public class Sprite extends SPC_Food {

	  public Sprite() {
	    super(SPCItems.category_masak, SPCItems.SPRITE, SPCAddon_RecipeType.VENDING_MACHINE, new ItemStack[] {
	    		new ItemStack(Material.EMERALD), null, null,
	    		null, null, null,
	    		null, null, null
	    }, 6);
	  }

	}