package dark.detraismc.SPC_SF.implementation.tools;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import dark.detraismc.SPC_SF.SPCAddon;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ToolUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class Artifact_Pickaxe extends SimpleSlimefunItem<ToolUseHandler> {
	
	SPCAddon plugin = SPCAddon.getInstance();

	  public Artifact_Pickaxe() {
	    super(SPCItems.category_tools, SPCItems.ARTIFACT_PICKAXE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		SPCItems.ENDERITE_PLATE, SPCItems.VOID_PLATE, SPCItems.ENDERITE_PLATE,
	    		SPCItems.CORRUPTED_LAPIS_LAZULI_2, SPCItems.VOID_INGOT, SPCItems.CORRUPTED_LAPIS_LAZULI_2,
	    		SPCItems.CORRUPTED_LAPIS_LAZULI_2, SPCItems.VOID_INGOT, SPCItems.CORRUPTED_LAPIS_LAZULI_2
	    });
	  }
	  
	  @SuppressWarnings("deprecation")
	@Override
	    public ToolUseHandler getItemHandler() {
	        return (e, tool, fortune, drops) -> {
	            Block b = e.getBlock();

	            if (b.getType() == Material.END_STONE) {
	            	if (!e.isCancelled()) {
	            		drops.clear();
	            		if (plugin.mtk.getChance(20, 100)) {
	            			if (plugin.mtk.getChance(30, 100)) {
	            				Skeleton mob = (Skeleton) e.getPlayer().getLocation().getWorld().spawn(e.getPlayer().getLocation(), Skeleton.class);
	        					mob.setMaxHealth(1000);
	        					mob.setHealth(1000);
	        					mob.setCustomName(ChatColor.RED + "Artifact Guardian");
	        					mob.getEquipment().setHelmet(plugin.iutils.simpleIBuilder(Material.GOLDEN_HELMET, "Helmet Of Iron", "Artifact Guardian specialities"));
	        					mob.getEquipment().setChestplate(new ItemStack(Material.GOLDEN_CHESTPLATE));
	        					mob.getEquipment().setLeggings(new ItemStack(Material.GOLDEN_CHESTPLATE));
	        					mob.getEquipment().setBoots(new ItemStack(Material.GOLDEN_CHESTPLATE));
	        					mob.getEquipment().setItemInMainHand(plugin.iutils.enchantIBuilder(Material.GOLDEN_SWORD, Enchantment.SHARPNESS, 5, "Artifact Sword", "Artifact Guardian specialities"));
	        					mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 4));
	        					mob.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 999999, 5));
		            		} else if (plugin.mtk.getChance(40, 100)) {
		            			Spider mob = (Spider) e.getPlayer().getLocation().getWorld().spawn(e.getPlayer().getLocation(), Spider.class);
	        					mob.setMaxHealth(1000);
	        					mob.setHealth(1000);
	        					mob.setCustomName(ChatColor.RED + "Artifact Hunter");
	        					mob.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 6));
	        					mob.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 999999, 15));
		            		} else {
		            			Creeper mob = (Creeper) e.getPlayer().getLocation().getWorld().spawn(e.getPlayer().getLocation(), Creeper.class);
	        					mob.setMaxHealth(1000);
	        					mob.setHealth(1000);
	        					mob.setCustomName(ChatColor.RED + "Artifact Bomber");
	        					mob.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 999999, 10));
	        					mob.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 999999, 10));
	        					mob.setPowered(true);
		            		}
	            		} else {
	            			drops.add(SlimefunItems.STONE_CHUNK);
	            		}
	            	}
	            }
	        };
	    }
	}