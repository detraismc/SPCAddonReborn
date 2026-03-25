package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Healing_Ticket extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Healing_Ticket() {
	    super(SPCItems.category_material, SPCItems.HEALING_TICKET, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		null, SPCItems.HEALING_HERB, null,
	    		SPCItems.HEALING_HERB, SPCItems.HEALING_HERB, SPCItems.HEALING_HERB,
	    		null, SPCItems.HEALING_HERB, null
	    });
	  }

	  @Override
	  public ItemUseHandler getItemHandler() {
	    return e -> {
	      e.cancel();
	    };
	  }
	}