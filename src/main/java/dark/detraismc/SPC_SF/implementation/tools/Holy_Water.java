package dark.detraismc.SPC_SF.implementation.tools;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCAddon;
import dark.detraismc.SPC_SF.SPCAddon_RecipeType;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;

public class Holy_Water extends SlimefunItem {
	
	SPCAddon plugin = SPCAddon.getInstance();

	  public Holy_Water() {
	    super(SPCItems.category_consumable, SPCItems.HOLY_WATER, SPCAddon_RecipeType.MINI_HOSPITAL, new ItemStack[] {
	    		new ItemStack(Material.WATER_BUCKET), SPCItems.CORRUPTED_GOLD_INGOT, null,
	    		null, null, null,
	    		null, null, null
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
		  if (plugin.cooldownpot_map2.containsKey(p.getName())) {
			  p.sendMessage(ChatColor.RED + "Item ini sedang cooldown.");
			  return;
		  }
		  if (p.getGameMode() != GameMode.CREATIVE) {
			  ItemUtils.consumeItem(event.getItem(), false); 
		  }
		  p.setFireTicks(0);
		  
		  p.getWorld().playSound(p.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1, 1);
		  plugin.cooldownpot_map2.put(p.getName(), "True");
		  
		  Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
	            @Override
	            public void run() {
	            	plugin.cooldownpot_map2.remove(p.getName());
	            }
	        }, 100L);
		  
	    }
	}