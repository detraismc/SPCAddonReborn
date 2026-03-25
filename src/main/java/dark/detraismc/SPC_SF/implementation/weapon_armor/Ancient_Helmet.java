package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class Ancient_Helmet extends SlimefunItem {

	  public Ancient_Helmet() {
	    super(SPCItems.category_armor, SPCItems.ANCIENT_HELMET, RecipeType.ARMOR_FORGE, new ItemStack[] {
	    		SPCItems.ANCIENT_COMPONENT, SPCItems.ANCIENT_COMPONENT, SPCItems.ANCIENT_COMPONENT,
	    		SPCItems.ANCIENT_COMPONENT, SPCItems.ARTIFACT_POWER_CORE, SPCItems.ANCIENT_COMPONENT,
	    		null, SPCItems.VOID_INGOT, null
	    });
	  }
	}