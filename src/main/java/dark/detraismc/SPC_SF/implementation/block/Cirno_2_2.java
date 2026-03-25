package dark.detraismc.SPC_SF.implementation.block;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.machines.Freezer;

public class Cirno_2_2 extends Freezer {

	  public Cirno_2_2() {
	    super(SPCItems.category_skin, SPCItems.CIRNO_2_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		null, SlimefunItems.SILVER_INGOT, null,
	    		SlimefunItems.ELECTRO_MAGNET, SPCItems.CIRNO, SlimefunItems.ELECTRO_MAGNET,
	    		SlimefunItems.COOLING_UNIT, SlimefunItems.ALUMINUM_BRASS_INGOT, SlimefunItems.COOLING_UNIT
	    });
	  }

	}