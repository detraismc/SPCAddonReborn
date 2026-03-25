package dark.detraismc.SPC_SF.listener;

import org.bukkit.Effect;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EvokerFangs;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import dark.detraismc.SPC_SF.SPCAddon;

public class SnowballGun implements Listener {

	SPCAddon plugin = SPCAddon.getInstance();
	
	@EventHandler
	public void snowballHit(EntityDamageByEntityEvent e) 
	{
		if (e.getDamager() instanceof Snowball) {
			Projectile projectile = (Projectile)e.getDamager();
			if (projectile.getCustomName() == null) {
				return;
			}
			if (projectile.getCustomName().equals("Musket")) {
				e.setDamage(e.getDamage() + 20);
				e.getEntity().getWorld().playEffect(e.getEntity().getLocation(), Effect.STEP_SOUND, 80, 1);
			} else if (projectile.getCustomName().equals("Taser")) {
				LivingEntity livinge = (LivingEntity) e.getEntity();
				e.setDamage(5);
				e.getEntity().getWorld().playEffect(e.getEntity().getLocation(), Effect.STEP_SOUND, 80, 1);
				livinge.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 200, 4));
			} else if (projectile.getCustomName().equals("Sniper Rifle")) {
				e.setDamage(e.getDamage() + 60);
				e.getEntity().getWorld().playEffect(e.getEntity().getLocation(), Effect.STEP_SOUND, 80, 1);
			} else if (projectile.getCustomName().equals("Assault Rifle")) {
				e.setDamage(e.getDamage() + 27);
				e.getEntity().getWorld().playEffect(e.getEntity().getLocation(), Effect.STEP_SOUND, 80, 1);
			}
		}
		if (e.getDamager() instanceof EvokerFangs) {
			if (e.getDamager().getCustomName() == null) {
				return;
			}
			if (e.getDamager().getCustomName().equals("Void Blade")) {
				e.setDamage(e.getDamage() + 5);
			}
		}
		if (e.getDamager() instanceof Arrow) {
			Projectile projectile = (Projectile)e.getDamager();
			if (projectile.getCustomName() == null) {
				return;
			}
			if (projectile.getCustomName().equals("Blowpipe")) {
				LivingEntity livinge = (LivingEntity) e.getEntity();
				e.setDamage(5);
				livinge.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 600, 1));
				e.getEntity().getWorld().playEffect(e.getEntity().getLocation(), Effect.STEP_SOUND, 80, 1);
			}
		}
	}
	

	
}
