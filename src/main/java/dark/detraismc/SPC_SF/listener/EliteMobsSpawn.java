package dark.detraismc.SPC_SF.listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Wither;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import dark.detraismc.SPC_SF.SPCAddon;

public class EliteMobsSpawn implements Listener {

	SPCAddon plugin = SPCAddon.getInstance();
	String e_name = ChatColor.GRAY + "[" + ChatColor.YELLOW + "Elite Mobs" + ChatColor.GRAY + "]" + ChatColor.RESET + " ";
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void eliteSpawn(CreatureSpawnEvent e) 
	{
		if (e.getSpawnReason() != SpawnReason.SPAWNER) {
			if (e.getEntityType() == EntityType.ZOMBIE) {
				if (plugin.mtk.getChance(5, 100)) {
					e.setCancelled(true);
					Zombie mob = (Zombie) e.getLocation().getWorld().spawn(e.getLocation(), Zombie.class);
					mob.setMaxHealth(50);
					mob.setHealth(50);
					mob.setCustomName(e_name + ChatColor.RED + "Zombie Knight");
					mob.getEquipment().setHelmet(plugin.iutils.simpleIBuilder(Material.IRON_HELMET, "Helmet Of Iron", "Zombie Knight specialities"));
					mob.getEquipment().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
					mob.getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
					mob.getEquipment().setBoots(new ItemStack(Material.IRON_BOOTS));
					mob.getEquipment().setItemInMainHand(plugin.iutils.enchantIBuilder(Material.IRON_SWORD, Enchantment.SHARPNESS, 5, "Demonic Sword", "Zombie Knight specialities"));
					mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 1));
				}
			} else if (e.getEntityType() == EntityType.SKELETON) {
				if (plugin.mtk.getChance(5, 100)) {
					e.setCancelled(true);
					Skeleton mob = (Skeleton) e.getLocation().getWorld().spawn(e.getLocation(), Skeleton.class);
					mob.setMaxHealth(60);
					mob.setHealth(60);
					mob.setCustomName(e_name + ChatColor.RED + "Plague Bringer");
					mob.getEquipment().setHelmet(new ItemStack(Material.SKELETON_SKULL));
					mob.getEquipment().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
					mob.getEquipment().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
					mob.getEquipment().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
					mob.getEquipment().setItemInMainHand(plugin.iutils.enchantIBuilder(Material.IRON_HOE, Enchantment.SHARPNESS, 9, "Plague Scythe", "Plague Bringer specialities"));
				}
			} else if (e.getEntityType() == EntityType.SPIDER) {
				if (plugin.mtk.getChance(5, 100)) {
					e.setCancelled(true);
					Spider mob = (Spider) e.getLocation().getWorld().spawn(e.getLocation(), Spider.class);
					mob.setMaxHealth(100);
					mob.setHealth(100);
					mob.setCustomName(e_name + ChatColor.RED + "Mutant Spider");
					mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 3));
					mob.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 999999, 3));
				}
			} else if (e.getEntityType() == EntityType.CREEPER) {
				if (plugin.mtk.getChance(5, 100)) {
					e.setCancelled(true);
					Creeper mob = (Creeper) e.getLocation().getWorld().spawn(e.getLocation(), Creeper.class);
					mob.setMaxHealth(60);
					mob.setHealth(60);
					mob.setCustomName(e_name + ChatColor.RED + "Radioactive Creeper");
					mob.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 999999, 1));
					mob.setPowered(true);
				}
			} else if (e.getEntityType() == EntityType.WITHER) {
				if (plugin.mtk.getChance(5, 100)) {
					e.setCancelled(true);
					Wither mob = (Wither) e.getLocation().getWorld().spawn(e.getLocation(), Wither.class);
					mob.setMaxHealth(1000);
					mob.setHealth(1000);
					mob.setCustomName(e_name + ChatColor.RED + "Hydra");
				}
			} else if (e.getEntityType() == EntityType.ENDER_DRAGON) {
				if (plugin.mtk.getChance(25, 1000)) {
					e.setCancelled(true);
					EnderDragon mob = (EnderDragon) e.getLocation().getWorld().spawn(e.getLocation(), EnderDragon.class);
					mob.setMaxHealth(1000);
					mob.setHealth(1000);
					mob.setCustomName(e_name + ChatColor.RED + "Void Dragon");
				}
			} else if (e.getEntityType() == EntityType.DROWNED) {
				if (plugin.mtk.getChance(5, 100)) {
					e.setCancelled(true);
					Drowned mob = (Drowned) e.getLocation().getWorld().spawn(e.getLocation(), Drowned.class);
					mob.setMaxHealth(40);
					mob.setHealth(40);
					mob.setCustomName(e_name + ChatColor.RED + "Neptune");
					mob.getEquipment().setHelmet(new ItemStack(Material.PLAYER_HEAD));
					mob.getEquipment().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
					mob.getEquipment().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
					mob.getEquipment().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
					mob.getEquipment().setItemInMainHand(new ItemStack(Material.TRIDENT));
				}
			} else if (e.getEntityType() == EntityType.PIGLIN) {
				if (plugin.mtk.getChance(5, 100)) {
					e.setCancelled(true);
					Piglin mob = (Piglin) e.getLocation().getWorld().spawn(e.getLocation(), Piglin.class);
					mob.setMaxHealth(80);
					mob.setHealth(80);
					mob.setCustomName(e_name + ChatColor.RED + "King Pig");
					mob.getEquipment().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
					mob.getEquipment().setChestplate(new ItemStack(Material.GOLDEN_CHESTPLATE));
					mob.getEquipment().setLeggings(new ItemStack(Material.GOLDEN_LEGGINGS));
					mob.getEquipment().setBoots(new ItemStack(Material.GOLDEN_BOOTS));
					mob.getEquipment().setItemInMainHand(plugin.iutils.enchantIBuilder(Material.GOLDEN_AXE, Enchantment.SHARPNESS, 7, "King Axe", ""));
				}
			}
		}
	}
	
	
}
