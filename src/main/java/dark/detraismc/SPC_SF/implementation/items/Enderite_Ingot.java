package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Enderite_Ingot extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Enderite_Ingot() {
	    super(SPCItems.category_material, SPCItems.ENDERITE_INGOT, RecipeType.SMELTERY, new ItemStack[] {
	    		SPCItems.ENDERITE_DUST, SlimefunItems.BOOSTED_URANIUM, new ItemStack(Material.NETHERITE_INGOT),
	    		null, null, null,
	    		null, null, null
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}