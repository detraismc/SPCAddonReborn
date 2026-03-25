package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import dark.detraismc.SPC_SF.SPCAddon;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class Blade_Of_Grass extends SlimefunItem {

	SPCAddon plugin = SPCAddon.getInstance();
	
	public Blade_Of_Grass() {
		super(SPCItems.category_weapon, SPCItems.BLADE_OF_GRASS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.ARTIFACT_CIRCUIT_BOARD, SPCItems.NATURE_ARTIFACT, SPCItems.ARTIFACT_CIRCUIT_BOARD,
	    		SPCItems.NATURE_COMPONENT, SlimefunItems.GRANDPAS_WALKING_STICK, SPCItems.NATURE_COMPONENT,
	    		SPCItems.ARTIFACT_CIRCUIT_BOARD, SPCItems.NATURE_ARTIFACT, SPCItems.ARTIFACT_CIRCUIT_BOARD
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
		  if (p.getInventory().getItemInOffHand().equals(SPCItems.BLADE_OF_GRASS)) {
			  p.sendMessage(ChatColor.RED + "Item ini tidak bisa dijadikan offhand");
			  return;
		  }
		  if (plugin.cooldown_map3.containsKey(p.getName())) {
			  p.sendMessage(ChatColor.RED + "Item ini sedang cooldown");
			  return;
		  }
		  plugin.cooldown_map3.put(p.getName(), "true");
		  p.getWorld().playSound(p.getLocation(), Sound.ENTITY_HORSE_BREATHE, 1, 1);
		  p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 2));
		  Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
	            @Override
	            public void run() {
	            	plugin.cooldown_map3.remove(p.getName());
	            }
	        }, 60L);
		  
	    }
	}
