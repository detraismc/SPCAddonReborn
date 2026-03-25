package dark.detraismc.SPC_SF.implementation.block;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.machines.Freezer;

public class Cirno_2 extends Freezer {

	  public Cirno_2() {
	    super(SPCItems.category_skin, SPCItems.CIRNO_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		new ItemStack(Material.SNOW_BLOCK), new ItemStack(Material.LILY_PAD), new ItemStack(Material.SNOW_BLOCK),
	    		new ItemStack(Material.LILY_PAD), SlimefunItems.FREEZER_2, new ItemStack(Material.LILY_PAD),
	    		new ItemStack(Material.SNOW_BLOCK), new ItemStack(Material.LILY_PAD), new ItemStack(Material.SNOW_BLOCK)
	    });
	  }

	}
