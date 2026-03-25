package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCAddon;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;

public class Natur_Al_Salastus extends SlimefunItem {

	SPCAddon plugin = SPCAddon.getInstance();
	
	public Natur_Al_Salastus() {
		super(SPCItems.category_weapon, SPCItems.NATUR_AL_SALASTUS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.NATURE_COMPONENT, SPCItems.VOID_PLATE, SPCItems.NATURE_COMPONENT,
	    		SPCItems.NATURE_COMPONENT, SPCItems.ENDERITE_SWORD, SPCItems.NATURE_COMPONENT,
	    		SPCItems.ARTIFACT_POWER_CORE, SPCItems.CORRUPTED_NETHER_STAR, SPCItems.ARTIFACT_POWER_CORE
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
		  p.getWorld().playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
		  plugin.natur_map.put(p.getName(), "true");
		  p.sendMessage(ChatColor.GREEN + "Natur Al'Salastus Buff Activated!");
		  Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
	            @Override
	            public void run() {
	            	plugin.cooldown_map3.remove(p.getName());
	            }
	        }, 100L);
		  
	    }
	}
