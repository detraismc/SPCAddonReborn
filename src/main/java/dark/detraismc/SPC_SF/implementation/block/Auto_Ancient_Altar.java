package dark.detraismc.SPC_SF.implementation.block;


import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.autocrafters.SlimefunAutoCrafter;

public class Auto_Ancient_Altar extends SlimefunAutoCrafter {
	
	   public Auto_Ancient_Altar() {
		   super(SPCItems.category_machine, SPCItems.AUTO_ANCIENT_ALTAR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
		       		SPCItems.ADVANCED_ANCIENT_PEDESTAL, SPCItems.VOID_PLATE, SPCItems.ADVANCED_ANCIENT_PEDESTAL,
		       		SlimefunItems.ENHANCED_AUTO_CRAFTER, SPCItems.ENDER_ALTAR_2, SlimefunItems.ENHANCED_AUTO_CRAFTER,
			    	SPCItems.ADVANCED_ANCIENT_PEDESTAL, SPCItems.VOID_PLATE, SPCItems.ADVANCED_ANCIENT_PEDESTAL
			    }, RecipeType.ANCIENT_ALTAR);
	   }
	}
