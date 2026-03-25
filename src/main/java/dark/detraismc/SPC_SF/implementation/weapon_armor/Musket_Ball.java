package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Musket_Ball extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Musket_Ball() {
	    super(SPCItems.category_weapon, SPCItems.MUSKET_BALL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                null, new ItemStack(Material.IRON_NUGGET), null,
	    		new ItemStack(Material.IRON_NUGGET), new ItemStack(Material.GUNPOWDER), new ItemStack(Material.IRON_NUGGET),
                null, new ItemStack(Material.IRON_NUGGET), null
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}
