package dark.detraismc.SPC_SF.listener;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import dark.detraismc.SPC_SF.SPCAddon;

public class RingEffect implements Listener {
	
	SPCAddon plugin = SPCAddon.getInstance();
	
	@EventHandler
	public void ringHit(EntityDamageByEntityEvent e) 
	{
		if (e.getDamager() instanceof Player) {
	         Player p = (Player)e.getDamager();
	         if (p.getInventory().getItemInOffHand() == null) {
	        	 return;
	         }
	         if (!p.getInventory().getItemInOffHand().hasItemMeta()) {
	        	 return;
	         }
	         if (!p.getInventory().getItemInOffHand().getItemMeta().hasLore()) {
	        	 return;
	         }
	         if (!p.getInventory().getItemInOffHand().getItemMeta().getLore().toString().contains("When in Off Hand:")) {
	        	 return;
	         }
	         if (!(e.getEntity() instanceof LivingEntity)) {
	        	 return;
	         }
	         if (p.getInventory().getItemInOffHand().getItemMeta().getDisplayName().contains("Nether Ring")) {
	        	 LivingEntity ent = (LivingEntity) e.getEntity();
	        	 ent.setFireTicks(60);
	        	 return;
	         }
	         if (p.getInventory().getItemInOffHand().getItemMeta().getDisplayName().contains("Void Ring")) {
	        	 LivingEntity ent = (LivingEntity) e.getEntity();
	        	 ent.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 40, 1));
	        	 ent.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 1));
	        	 return;
	         }
	         if (p.getInventory().getItemInOffHand().getItemMeta().getDisplayName().contains("Vampire Ring")) {
	        	 p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 2));
	        	 return;
	         }
	         if (p.getInventory().getItemInOffHand().getItemMeta().getDisplayName().contains("Frost Ring")) {
	        	 LivingEntity ent = (LivingEntity) e.getEntity();
	        	 ent.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 60, 1));
	        	 ent.addPotionEffect(new PotionEffect(PotionEffectType.MINING_FATIGUE, 60, 1));
	        	 return;
	        	 
	         }
	         
		}

	}
	
	public void ringHitted(EntityDamageByEntityEvent e) 
	{
		if (e.getEntity() instanceof Player) {
			Player p = (Player)e.getEntity();
			if (p.getInventory().getItemInOffHand() == null) {
	        	 return;
	         }
			if (!p.getInventory().getItemInOffHand().hasItemMeta()) {
	        	 return;
	         }
			if (!p.getInventory().getItemInOffHand().getItemMeta().hasLore()) {
	        	 return;
	         }
			if (!p.getInventory().getItemInOffHand().getItemMeta().getLore().toString().contains("When in Off Hand:")) {
	        	 return;
	         }
			if (p.getInventory().getItemInOffHand().getItemMeta().getDisplayName().contains("Frost Ring")) {
	        	 p.removePotionEffect(PotionEffectType.SLOWNESS);
	        	 p.removePotionEffect(PotionEffectType.MINING_FATIGUE);
	        	 return;
	         }
		}
	}
	
}
