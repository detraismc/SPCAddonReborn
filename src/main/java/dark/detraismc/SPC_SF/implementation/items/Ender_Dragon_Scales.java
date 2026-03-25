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

public class Ender_Dragon_Scales extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Ender_Dragon_Scales() {
	    super(SPCItems.category_material, SPCItems.ENDER_DRAGON_SCALES, SPCAddon_RecipeType.DRAGON_DROP, new ItemStack[] {
	    		null, null, null,
	    		null, SPCAddon.getInstance().iutils.simpleIBuilder(Material.DRAGON_HEAD, ChatColor.RED + "Ender Dragon"), null,
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