package dark.detraismc.SPC_SF.implementation.tools;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import dark.detraismc.SPC_SF.SPCAddon;
import dark.detraismc.SPC_SF.SPCAddon_RecipeType;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;

public class Cure_All extends SlimefunItem {
	
	SPCAddon plugin = SPCAddon.getInstance();

	  public Cure_All() {
	    super(SPCItems.category_consumable, SPCItems.CURE_ALL, SPCAddon_RecipeType.MINI_HOSPITAL, new ItemStack[] {
	    		new ItemStack(Material.MILK_BUCKET), SPCItems.CORRUPTED_EMERALD, null,
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
		  
		  List<PotionEffectType> curedEffects = new ArrayList<>();
		  curedEffects.add(PotionEffectType.POISON);
		  curedEffects.add(PotionEffectType.WITHER);
		  curedEffects.add(PotionEffectType.SLOWNESS);
		  curedEffects.add(PotionEffectType.MINING_FATIGUE);
		  curedEffects.add(PotionEffectType.WEAKNESS);
		  curedEffects.add(PotionEffectType.NAUSEA);
		  curedEffects.add(PotionEffectType.BLINDNESS);
		  curedEffects.add(PotionEffectType.BAD_OMEN);
		  
		  for (PotionEffectType effect : curedEffects) {
			  if (p.hasPotionEffect(effect)) {
				  p.removePotionEffect(effect);
			  }
		  }
		  
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