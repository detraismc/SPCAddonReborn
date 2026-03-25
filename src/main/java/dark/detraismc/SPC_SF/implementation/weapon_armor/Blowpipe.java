package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import dark.detraismc.SPC_SF.SPCAddon;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Blowpipe extends SlimefunItem {

	SPCAddon plugin = SPCAddon.getInstance();
	
	public Blowpipe() {
		super(SPCItems.category_weapon, SPCItems.BLOWPIPE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.ARTIFACT_CIRCUIT_BOARD, SlimefunItems.EARTH_RUNE, SPCItems.ARTIFACT_CIRCUIT_BOARD,
	    		SPCItems.NATURE_ARTIFACT, new ItemStack(Material.BAMBOO), SPCItems.NATURE_ARTIFACT,
	    		SPCItems.ARTIFACT_CIRCUIT_BOARD, SlimefunItems.EARTH_RUNE, SPCItems.ARTIFACT_CIRCUIT_BOARD
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
		  if (p.getInventory().getItemInOffHand().equals(SPCItems.BLOWPIPE)) {
			  p.sendMessage(ChatColor.RED + "Item ini tidak bisa dijadikan offhand");
			  return;
		  }
		  if (plugin.cooldown_map.containsKey(p.getName())) {
			  p.sendMessage(ChatColor.RED + "Item ini sedang cooldown");
			  return;
		  }
		  if (!p.getInventory().containsAtLeast(new ItemStack(Material.ARROW), 1)) {
			  if (p.getGameMode() != GameMode.CREATIVE) {
				  p.sendMessage(ChatColor.RED + "Anda harus mempunyai 1 arrow untuk menembak");
				  return;
			  }
		  }
		  if (p.getGameMode() != GameMode.CREATIVE) {
			  p.getInventory().removeItem(new ItemStack(Material.ARROW));
		  }
		  plugin.cooldown_map.put(p.getName(), "true");
		  
		  Vector playerDirection = p.getLocation().getDirection();
		  Arrow ball = p.launchProjectile(Arrow.class, playerDirection);
		  ball.setVelocity(ball.getVelocity().multiply(5));
		  ball.setCustomName("Blowpipe");
		  p.getWorld().playSound(p.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1, 1);
		  
		  Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
	            @Override
	            public void run() {
	            	p.getWorld().playSound(p.getLocation(), Sound.BLOCK_STONE_BUTTON_CLICK_ON, 1, 1);
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
