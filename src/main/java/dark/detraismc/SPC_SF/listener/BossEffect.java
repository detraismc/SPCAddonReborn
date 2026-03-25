package dark.detraismc.SPC_SF.listener;

import java.util.Iterator;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import dark.detraismc.SPC_SF.SPCAddon;

public class BossEffect implements Listener {

	SPCAddon plugin = SPCAddon.getInstance();
	
	@EventHandler
	public void bossHit(EntityDamageByEntityEvent e) 
	{
		if (e.getDamager().getName().contains(ChatColor.RED + "Ender King")) {
			
			Entity boss = e.getDamager();
			
			if (plugin.mtk.getChance(25, 100)) {
				
				int damage = 10;
				
				double radius = 5;
				double var17 = 12.0D + radius * 2.5D;
				
				LivingEntity victim = (LivingEntity) e.getEntity();
				victim.damage(damage);
				victim.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, 200, 1));
				
				@SuppressWarnings("rawtypes")
				Iterator var10 = boss.getNearbyEntities(radius, radius, radius).iterator();
				
				while(var10.hasNext()) {
			         Entity var11 = (Entity)var10.next();
			         if (var11 instanceof LivingEntity) {
			        	 LivingEntity ent = (LivingEntity)var11;
				         if (!ent.getName().contains(ChatColor.RED + "Ender King")) {
				        	 ent.damage(damage);
					         ent.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, 200, 1));
				         }
			         }
			      }
				
				
				for(double var18 = 0.0D; var18 < 6.283185307179586D; var18 += 3.141592653589793D / var17) {
			         Location var19 = boss.getLocation().clone();
			         var19.add(Math.cos(var18) * radius, 0.75D, Math.sin(var18) * radius);
			         var19.getWorld().spawnParticle(Particle.DRAGON_BREATH, var19, 0);
			      }
				boss.getWorld().spawnParticle(Particle.LARGE_SMOKE, boss.getLocation().add(0.0D, 1.0D, 0.0D), 0);
				boss.getWorld().playSound(boss.getLocation(), Sound.ENTITY_ENDERMAN_DEATH, 1.0F, 0.5F);
				return;
			}
			
		}
	}
	
	@EventHandler
	public void bossHitted(EntityDamageByEntityEvent e) 
	{
		if (e.getEntity().getName().contains(ChatColor.RED + "Ender King")) {
			
			Entity boss = e.getEntity();
			
			Material m = boss.getLocation().getBlock().getType();
			
			if (m == Material.WATER) {
				
				e.getEntity().teleport(e.getDamager());
				e.getEntity().getWorld().playSound(e.getEntity().getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0F, 0.5F);
				
				int damage = 10;
				
				double radius = 5;
				double var17 = 12.0D + radius * 2.5D;
				
				LivingEntity victim = (LivingEntity) e.getEntity();
				victim.damage(damage);
				victim.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, 200, 1));
				
				@SuppressWarnings("rawtypes")
				Iterator var10 = boss.getNearbyEntities(radius, radius, radius).iterator();
				
				while(var10.hasNext()) {
			         Entity var11 = (Entity)var10.next();
			         if (var11 instanceof LivingEntity) {
			        	 LivingEntity ent = (LivingEntity)var11;
				         if (!ent.getName().contains(ChatColor.RED + "Ender King")) {
				        	 ent.damage(damage);
					         ent.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, 200, 1));
				         }
			         }
			      }
				
				
				for(double var18 = 0.0D; var18 < 6.283185307179586D; var18 += 3.141592653589793D / var17) {
			         Location var19 = boss.getLocation().clone();
			         var19.add(Math.cos(var18) * radius, 0.75D, Math.sin(var18) * radius);
			         var19.getWorld().spawnParticle(Particle.DRAGON_BREATH, var19, 0);
			      }
				boss.getWorld().spawnParticle(Particle.LARGE_SMOKE, boss.getLocation().add(0.0D, 1.0D, 0.0D), 0);
				boss.getWorld().playSound(boss.getLocation(), Sound.ENTITY_ENDERMAN_DEATH, 1.0F, 0.5F);
				return;
			}
			if (plugin.mtk.getChance(10, 100)) {
				e.getEntity().teleport(e.getDamager());
				e.getEntity().getWorld().playSound(e.getEntity().getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0F, 0.5F);
			}
			
		}
	}
	
}
