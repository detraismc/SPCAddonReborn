package dark.detraismc.SPC_SF.implementation.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import dark.detraismc.SPC_SF.SPCAddon;
import dark.detraismc.SPC_SF.SPCAddon_RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import net.md_5.bungee.api.ChatColor;

public class Elite_Coin extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

	  public Elite_Coin() {
	    super(SPCItems.category_material, SPCItems.ELITE_COIN, SPCAddon_RecipeType.ELITE_MOBS_DROP, new ItemStack[] {
	    		null, null, null,
	    		null, SPCAddon.getInstance().iutils.simpleIBuilder(Material.ZOMBIE_HEAD, ChatColor.RED + "Elite Mobs"), null,
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