package dark.detraismc.SPC_SF.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import dark.detraismc.SPC_SF.SPCAddon;
import net.md_5.bungee.api.ChatColor;

public class WeaponEffect implements Listener {
	
	SPCAddon plugin = SPCAddon.getInstance();
	
	@EventHandler
	public void weaponHit(EntityDamageByEntityEvent e) 
	{
		
	}
	
	@EventHandler
	public void bowHit(EntityDamageByEntityEvent e) 
	{
		if (e.getDamager() instanceof Arrow) {
			Projectile projectile = (Projectile)e.getDamager();
			if (!(projectile.getShooter() instanceof Player)) {
				return;
			}
			Player p = (Player) projectile.getShooter();
			if (p.getInventory().getItemInMainHand() == null) {
	        	 return;
	         }
	         if (!p.getInventory().getItemInMainHand().hasItemMeta()) {
	        	 return;
	         }
	         if (!p.getInventory().getItemInMainHand().getItemMeta().hasLore()) {
	        	 return;
	         }
	         if (!p.getInventory().getItemInMainHand().getItemMeta().getLore().toString().contains("death mark")) {
	        	 return;
	         }
	         LivingEntity n = (LivingEntity) e.getEntity();
	         if (plugin.cooldown_map2.containsKey(p.getName())) {
	        	 return;
	         }
	         plugin.cooldown_map2.put(p.getName(), "true");
	         (new BukkitRunnable() {
	             double ti = 0.0D;

	             public void run() {
	                ++this.ti;
	                if (this.ti <= 60 && n != null && !n.isDead()) {
	                   if (this.ti % 20.0D == 0.0D) {
	                	   n.getWorld().playSound(n.getLocation(), Sound.ENTITY_ENDERMAN_DEATH, 1.0F, 2.0F);
	                	   n.damage(20, p);
	                	   n.getWorld().spawnParticle(Particle.DRAGON_BREATH, n.getLocation(), 16, 0.2D, 0.2D, 0.2D, 0.2D);
	                   }

	                } else {
	                   this.cancel();
	                }
	             }
	          }).runTaskTimer(plugin, 0L, 1L);
	         
	         Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
		            @Override
		            public void run() {
		            	plugin.cooldown_map2.remove(p.getName());
		            }
		        }, 160L);
			
		}
	}
	
	@EventHandler
	public void naturaHit(EntityDamageByEntityEvent e) 
	{
		if (e.getDamager() instanceof Arrow) {
			return;
		}
		if (e.getDamager() instanceof Snowball) {
			return;
		}
		if (e.getDamager() instanceof Player) {
			Player p = (Player) e.getDamager();
			if (plugin.natur_map.containsKey(p.getName())) {
				e.setDamage(e.getDamage()*2);
				plugin.natur_map.remove(p.getName());
				p.sendMessage(ChatColor.GREEN + "Natura Slash!");
			}
		}
	}
	
	@EventHandler
	public void weaponHitted(EntityDamageByEntityEvent e) 
	{
		if (e.getEntity() instanceof Player) {
			Player p = (Player) e.getEntity();
			if (!(e.getDamager() instanceof Creeper)) {
				return;
			}
			int set = 0;
			if (p.getInventory().getHelmet() == null) {
	        	 return;
	         }
	         if (!p.getInventory().getHelmet().hasItemMeta()) {
	        	 return;
	         }
	         if (!p.getInventory().getHelmet().getItemMeta().hasLore()) {
	        	 return;
	         }
	         if (p.getInventory().getChestplate() == null) {
	        	 return;
	         }
	         if (!p.getInventory().getChestplate().hasItemMeta()) {
	        	 return;
	         }
	         if (!p.getInventory().getChestplate().getItemMeta().hasLore()) {
	        	 return;
	         }
	         if (p.getInventory().getLeggings() == null) {
	        	 return;
	         }
	         if (!p.getInventory().getLeggings().hasItemMeta()) {
	        	 return;
	         }
	         if (!p.getInventory().getLeggings().getItemMeta().hasLore()) {
	        	 return;
	         }
	         if (p.getInventory().getBoots() == null) {
	        	 return;
	         }
	         if (!p.getInventory().getBoots().hasItemMeta()) {
	        	 return;
	         }
	         if (!p.getInventory().getBoots().getItemMeta().hasLore()) {
	        	 return;
	         }
	         if (p.getInventory().getHelmet().getItemMeta().getLore().toString().contains("Creeper Explosion Immunity")) {
	        	 set = set + 1;
	         }
	         if (p.getInventory().getChestplate().getItemMeta().getLore().toString().contains("Creeper Explosion Immunity")) {
	        	 set = set + 1;
	         }
	         if (p.getInventory().getLeggings().getItemMeta().getLore().toString().contains("Creeper Explosion Immunity")) {
	        	 set = set + 1;
	         }
	         if (p.getInventory().getBoots().getItemMeta().getLore().toString().contains("Creeper Explosion Immunity")) {
	        	 set = set + 1;
	         }
	         if (set == 4) {
	        	 e.setCancelled(true);
	         }
		}
	}
	
	@EventHandler
	public void weaponHitted2(EntityDamageEvent e) 
	{
		if (e.getEntity() instanceof Player) {
			Player p = (Player) e.getEntity();
			int yah = 0;
			if (e.getCause() == DamageCause.BLOCK_EXPLOSION) {
				yah = 1; 
			}
			if (e.getCause() == DamageCause.FIRE) {
				yah = 1;
			}
			if (e.getCause() == DamageCause.FIRE_TICK) {
				yah = 1;
			}
			if (e.getCause() == DamageCause.LAVA) {
				yah = 1;
			}
			if (yah == 0) {
				return;
			}
			int set = 0;
			if (p.getInventory().getHelmet() == null) {
	        	 return;
	         }
	         if (!p.getInventory().getHelmet().hasItemMeta()) {
	        	 return;
	         }
	         if (!p.getInventory().getHelmet().getItemMeta().hasLore()) {
	        	 return;
	         }
	         if (p.getInventory().getChestplate() == null) {
	        	 return;
	         }
	         if (!p.getInventory().getChestplate().hasItemMeta()) {
	        	 return;
	         }
	         if (!p.getInventory().getChestplate().getItemMeta().hasLore()) {
	        	 return;
	         }
	         if (p.getInventory().getLeggings() == null) {
	        	 return;
	         }
	         if (!p.getInventory().getLeggings().hasItemMeta()) {
	        	 return;
	         }
	         if (!p.getInventory().getLeggings().getItemMeta().hasLore()) {
	        	 return;
	         }
	         if (p.getInventory().getBoots() == null) {
	        	 return;
	         }
	         if (!p.getInventory().getBoots().hasItemMeta()) {
	        	 return;
	         }
	         if (!p.getInventory().getBoots().getItemMeta().hasLore()) {
	        	 return;
	         }
	         if (p.getInventory().getHelmet().getItemMeta().getLore().toString().contains("Creeper Explosion Immunity")) {
	        	 set = set + 1;
	         }
	         if (p.getInventory().getChestplate().getItemMeta().getLore().toString().contains("Creeper Explosion Immunity")) {
	        	 set = set + 1;
	         }
	         if (p.getInventory().getLeggings().getItemMeta().getLore().toString().contains("Creeper Explosion Immunity")) {
	        	 set = set + 1;
	         }
	         if (p.getInventory().getBoots().getItemMeta().getLore().toString().contains("Creeper Explosion Immunity")) {
	        	 set = set + 1;
	         }
	         if (set == 4) {
	        	 e.setCancelled(true);
	         }
		}
	}
	
	@EventHandler
	public void weaponLeftClick(PlayerInteractEvent e) 
	{
		Player p = e.getPlayer();
		if (e.getAction() == Action.LEFT_CLICK_AIR) {
			if (p.getInventory().getItemInMainHand() == null) {
	        	 return;
	         }
	         if (!p.getInventory().getItemInMainHand().hasItemMeta()) {
	        	 return;
	         }
	         if (!p.getInventory().getItemInMainHand().getItemMeta().hasLore()) {
	        	 return;
	         }
	         if (!p.getInventory().getItemInMainHand().getItemMeta().getLore().toString().contains("Right click to shoot")) {
	        	 return;
	         }
			if (!p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Sniper Rifle")) {
				return;
			}
			if (plugin.snipe_map.containsKey(p.getName())) {
				p.removePotionEffect(PotionEffectType.SLOWNESS);
				p.getWorld().playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 1, 1);
				plugin.snipe_map.remove(p.getName());
			} else {
				p.removePotionEffect(PotionEffectType.SLOWNESS);
				p.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 99999, 20));
				p.getWorld().playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 1, 1);
				plugin.snipe_map.put(p.getName(), "true");
			}
		}
	}
	
	@EventHandler
	public void weaponChange(PlayerItemHeldEvent e) 
	{
		Player p = e.getPlayer();
		if (plugin.snipe_map.containsKey(p.getName())) {
			p.removePotionEffect(PotionEffectType.SLOWNESS);
			p.getWorld().playSound(p.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON, 1, 1);
			plugin.snipe_map.remove(p.getName());
		}
	}
	
	@EventHandler
	public void weaponLogout(PlayerQuitEvent e) 
	{
		Player p = e.getPlayer();
		if (plugin.snipe_map.containsKey(p.getName())) {
			p.removePotionEffect(PotionEffectType.SLOWNESS);
			plugin.snipe_map.remove(p.getName());
		}
		if (plugin.natur_map.containsKey(p.getName())) {
			plugin.natur_map.remove(p.getName());
		}
		if (plugin.cooldown_map.containsKey(p.getName())) {
			plugin.cooldown_map.remove(p.getName());
		}
		if (plugin.cooldown_map2.containsKey(p.getName())) {
			plugin.cooldown_map2.remove(p.getName());
		}
		if (plugin.cooldown_map3.containsKey(p.getName())) {
			plugin.cooldown_map3.remove(p.getName());
		}
	}
	
	@EventHandler
	public void weaponLogin(PlayerLoginEvent e) 
	{
		Player p = e.getPlayer();
		p.removePotionEffect(PotionEffectType.SLOWNESS);
		if (plugin.natur_map.containsKey(p.getName())) {
			plugin.natur_map.remove(p.getName());
		}
		if (plugin.cooldown_map.containsKey(p.getName())) {
			plugin.cooldown_map.remove(p.getName());
		}
		if (plugin.cooldown_map2.containsKey(p.getName())) {
			plugin.cooldown_map2.remove(p.getName());
		}
		if (plugin.cooldown_map3.containsKey(p.getName())) {
			plugin.cooldown_map3.remove(p.getName());
		}
	}
	
	@EventHandler
	public void weaponKill(EntityDeathEvent e) 
	{
		if (e.getEntity().getKiller() == null) {
			return;
		}
		if (!(e.getEntity().getKiller() instanceof Player)) {
			return;
		}
		Player p = (Player) e.getEntity().getKiller();
		if (p.getInventory().getItemInMainHand() == null) {
       	 return;
        }
        if (!p.getInventory().getItemInMainHand().hasItemMeta()) {
       	 return;
        }
        if (!p.getInventory().getItemInMainHand().getItemMeta().hasLore()) {
       	 return;
        }
        if (!p.getInventory().getItemInMainHand().getItemMeta().getLore().toString().contains("Drop gold ingot when defeating enemy")) {
       	 return;
        }
        int amount = plugin.mtk.getRandomNumber(1, 3);
		e.getDrops().add(new ItemStack(Material.GOLD_INGOT, amount));
	}
	
}
