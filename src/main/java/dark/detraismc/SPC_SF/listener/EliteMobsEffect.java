package dark.detraismc.SPC_SF.listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import dark.detraismc.SPC_SF.SPCAddon;

public class EliteMobsEffect implements Listener {

	SPCAddon plugin = SPCAddon.getInstance();
	
	@EventHandler
	public void eliteHit(EntityDamageByEntityEvent e) 
	{
		if (e.getDamager().getName().contains(ChatColor.RED + "Plague Bringer")) {
			LivingEntity ent = (LivingEntity) e.getEntity();
			ent.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20, 1));
		}
	}
}
