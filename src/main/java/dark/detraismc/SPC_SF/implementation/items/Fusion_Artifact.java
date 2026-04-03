package dark.detraismc.SPC_SF.implementation.items;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import org.bukkit.inventory.ItemStack;

public class Fusion_Artifact extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Fusion_Artifact() {
	    super(SPCItems.category_material, SPCItems.FUSION_ARTIFACT, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		null, null, null,
                SPCItems.CORRUPTED_NATURE_ARTIFACT, SPCItems.CORRUPTED_TECH_ARTIFACT, SPCItems.CORRUPTED_ANCIENT_ARTIFACT,
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