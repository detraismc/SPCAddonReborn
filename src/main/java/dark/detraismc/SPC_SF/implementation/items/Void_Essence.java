package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCAddon;
import dark.detraismc.SPC_SF.SPCAddon_RecipeType;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import net.md_5.bungee.api.ChatColor;

public class Void_Essence extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Void_Essence() {
	    super(SPCItems.category_material, SPCItems.VOID_ESSENCE, SPCAddon_RecipeType.ENDER_KING_DROP, new ItemStack[] {
	    		null, null, null,
	    		null, SPCAddon.getInstance().iutils.simpleIBuilder(Material.WITHER_SKELETON_SKULL, ChatColor.RED + "Ender King"), null,
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