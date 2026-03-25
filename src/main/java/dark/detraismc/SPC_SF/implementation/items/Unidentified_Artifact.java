package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCAddon_RecipeType;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Unidentified_Artifact extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Unidentified_Artifact() {
	    super(SPCItems.category_material, SPCItems.UNIDENTIFIED_ARTIFACT, SPCAddon_RecipeType.ARTIFACT, new ItemStack[] {
	    		null, null, null,
	    		null, new ItemStack(Material.IRON_SWORD), null,
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