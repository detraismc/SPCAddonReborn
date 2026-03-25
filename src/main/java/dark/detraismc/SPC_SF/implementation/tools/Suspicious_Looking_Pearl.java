package dark.detraismc.SPC_SF.implementation.tools;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.entity.WitherSkeleton;
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
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;

public class Suspicious_Looking_Pearl extends SlimefunItem {
	
	SPCAddon plugin = SPCAddon.getInstance();

	  public Suspicious_Looking_Pearl() {
	    super(SPCItems.category_consumable, SPCItems.SUSPICIOUS_LOOKING_PEARL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		null, SPCItems.ENDER_DRAGON_SCALES, null,
	    		SPCItems.ENDER_DRAGON_SCALES, SPCItems.CORRUPTED_ENDER_EYE, SPCItems.ENDER_DRAGON_SCALES,
	    		null, SPCItems.ENDER_DRAGON_SCALES, null
	    });
	  }
	  
	  @Override
	  public void preRegister() {

	        ItemUseHandler itemUseHandler = this::onItemRightClick;
	        addItemHandler(itemUseHandler);
	    }
	  
	  @SuppressWarnings("deprecation")
	  private void onItemRightClick(PlayerRightClickEvent e) {
		  e.cancel();
		  Player p = e.getPlayer();
		  if (!p.getWorld().getName().equals("world_the_end")) {
			  p.sendMessage(ChatColor.RED + "Kau harus ada didalam world the end untuk menggunakan ini");
			  return;
		  }
		  p.getWorld().playSound(p.getLocation(), Sound.ENTITY_WITHER_SPAWN, 1, 1);
		  p.sendMessage(ChatColor.DARK_PURPLE + "Kau telah berhasil men summon " + ChatColor.DARK_RED + ChatColor.BOLD + "Ender King");
		  ItemUtils.consumeItem(e.getItem(), false);
		  WitherSkeleton mob = (WitherSkeleton) p.getLocation().getWorld().spawn(p.getLocation(), WitherSkeleton.class);
		  mob.setMaxHealth(1500);
		  mob.setHealth(1500);
		  mob.setCustomName(ChatColor.RED + "Ender King");
		  mob.getEquipment().setHelmet(SlimefunItems.GOLDEN_HELMET_12K);
		  mob.getEquipment().setChestplate(SlimefunItems.ENDER_CHESTPLATE);
		  mob.getEquipment().setLeggings(SlimefunItems.ENDER_LEGGINGS);
		  mob.getEquipment().setBoots(SlimefunItems.ENDER_BOOTS);
		  mob.getEquipment().setItemInMainHand(plugin.iutils.enchantIBuilder(Material.NETHERITE_SWORD, Enchantment.SHARPNESS, 10, ChatColor.DARK_BLUE + "Ender King Sword", "Ender King specialities"));
		  mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 3));
		  mob.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 999999, 1));
	  }
}
