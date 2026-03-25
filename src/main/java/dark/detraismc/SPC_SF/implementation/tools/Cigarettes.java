package dark.detraismc.SPC_SF.implementation.tools;

import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;

public class Cigarettes extends SlimefunItem {

	  public Cigarettes() {
	    super(SPCItems.category_consumable, SPCItems.CIGARETTES, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		null, new ItemStack(Material.PAPER), null,
	    		null, SPCItems.TOBACCO, null,
	    		null, new ItemStack(Material.PAPER), null
	    });
	  }
	  
	  @Override
	    public void preRegister() {

	        ItemUseHandler itemUseHandler = this::onItemRightClick;
	        addItemHandler(itemUseHandler);
	    }
	  
	  private void onItemRightClick(PlayerRightClickEvent event) {
		  event.cancel();
		  Player p = event.getPlayer();
		  Vector v = p.getLocation().getDirection();
	      Location l = p.getEyeLocation();
	      Location f = l.add(v);
		  p.getWorld().playSound(p.getLocation(), Sound.BLOCK_SMOKER_SMOKE, 1, 1);
		  p.getWorld().playSound(p.getLocation(), Sound.BLOCK_FIRE_AMBIENT, 1, 1);
		  p.getWorld().playEffect(f, Effect.SMOKE, 10);
		  int woe = ((int) (Math.random()*(100 - 1))) + 1;
		  if (woe < 5) {
			  if (p.getGameMode() != GameMode.CREATIVE) {
				  ItemUtils.consumeItem(event.getItem(), false); 
				  }
		  }
	    }
	}