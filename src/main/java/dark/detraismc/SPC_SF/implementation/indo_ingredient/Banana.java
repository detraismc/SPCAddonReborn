package dark.detraismc.SPC_SF.implementation.indo_ingredient;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;

public class Banana extends CustomFood {

	  public Banana() {
	    super(SPCItems.category_ingredient, SPCItems.BANANA, new ItemStack[] {
	    		new ItemStack(Material.JUNGLE_LEAVES), new ItemStack(Material.KELP), new ItemStack(Material.JUNGLE_LEAVES),
	    		new ItemStack(Material.KELP), SPCItems.INDONESIAN_INGREDIENT_LOOTBAG, new ItemStack(Material.KELP),
	    		new ItemStack(Material.JUNGLE_LEAVES), new ItemStack(Material.KELP), new ItemStack(Material.JUNGLE_LEAVES)
	    },1);
	  }

	}