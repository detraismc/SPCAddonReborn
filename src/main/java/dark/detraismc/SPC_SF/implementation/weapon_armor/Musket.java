package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import dark.detraismc.SPC_SF.SPCAddon;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;

public class Musket extends SlimefunItem {

	SPCAddon plugin = SPCAddon.getInstance();
	
	public Musket() {
		super(SPCItems.category_weapon, SPCItems.MUSKET, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		null, null, null,
	    		SPCItems.STEEL_CYLINDER, SPCItems.MUSKET_MECHANISM, SPCItems.MUSKET_HANDLE,
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
		  if (p.getInventory().getItemInOffHand().equals(SPCItems.MUSKET)) {
			  p.sendMessage(ChatColor.RED + "Item ini tidak bisa dijadikan offhand");
			  return;
		  }
		  if (plugin.cooldown_map.containsKey(p.getName())) {
			  p.sendMessage(ChatColor.RED + "Item ini sedang cooldown");
			  return;
		  }
		  if (!p.getInventory().containsAtLeast(SPCItems.MUSKET_BALL, 1)) {
			  if (p.getGameMode() != GameMode.CREATIVE) {
				  p.sendMessage(ChatColor.RED + "Anda harus mempunyai musket ball untuk menembak");
				  return;
			  }
		  }
		  if (p.getGameMode() != GameMode.CREATIVE) {
			  p.getInventory().removeItem(SPCItems.MUSKET_BALL);
		  }
		  plugin.cooldown_map.put(p.getName(), "true");
		  
		  Vector playerDirection = p.getLocation().getDirection();
		  Snowball ball = p.launchProjectile(Snowball.class, playerDirection);
		  ball.setVelocity(ball.getVelocity().multiply(5));
		  ball.setCustomName("Musket");
		  p.getWorld().playSound(p.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 1, 1);
		  
		  Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
	            @Override
	            public void run() {
	            	p.getWorld().playSound(p.getLocation(), Sound.BLOCK_STONE_BUTTON_CLICK_ON, 1, 1);
	            }
	        }, 10L);
		  
		  Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
	            @Override
	            public void run() {
	            	p.getWorld().playSound(p.getLocation(), Sound.BLOCK_PISTON_EXTEND, 1, 1);
	            }
	        }, 20L);
		  
		  Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
	            @Override
	            public void run() {
	            	p.getWorld().playSound(p.getLocation(), Sound.BLOCK_PISTON_CONTRACT, 1, 1);
	            }
	        }, 30L);
		  
		  Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
	            @Override
	            public void run() {
	            	plugin.cooldown_map.remove(p.getName());
	            }
	        }, 40L);
		  
	    }
	}
