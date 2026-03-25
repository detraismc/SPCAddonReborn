package dark.detraismc.SPC_SF.implementation.tools;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
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

public class Health_Potion_4 extends SlimefunItem {
	
	SPCAddon plugin = SPCAddon.getInstance();

	  public Health_Potion_4() {
	    super(SPCItems.category_consumable, SPCItems.HEALTH_POTION_4, SPCAddon_RecipeType.MINI_HOSPITAL, new ItemStack[] {
	    		SPCItems.HEALTH_POTION_3, SPCItems.HEALING_FRUIT, null,
	    		null, null, null,
	    		null, null, null
	    });
	  }
	  
	  @Override
	    public void preRegister() {

	        ItemUseHandler itemUseHandler = this::onItemRightClick;
	        addItemHandler(itemUseHandler);
	    }
	  
	  @SuppressWarnings("deprecation")
	private void onItemRightClick(PlayerRightClickEvent event) {
		  event.cancel();
		  Player p = event.getPlayer();
		  if (plugin.cooldownpot_map.containsKey(p.getName())) {
			  p.sendMessage(ChatColor.RED + "Item ini sedang cooldown.");
			  return;
		  }
		  if (p.getGameMode() != GameMode.CREATIVE) {
			  ItemUtils.consumeItem(event.getItem(), false); 
		  }
		  int heal = 60;
		  if (p.getHealth()+heal > p.getMaxHealth()) {
			  p.setHealth(p.getMaxHealth());
		  } else {
			  p.setHealth(p.getHealth() + heal);
		  }
		  
		  p.getWorld().playSound(p.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1, 1);
		  plugin.cooldownpot_map.put(p.getName(), "True");
		  
		  Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
	            @Override
	            public void run() {
	            	plugin.cooldownpot_map.remove(p.getName());
	            }
	        }, 120L);
		  
	    }
	}