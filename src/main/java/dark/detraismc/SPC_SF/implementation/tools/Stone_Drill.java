package dark.detraismc.SPC_SF.implementation.tools;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ToolUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import net.md_5.bungee.api.ChatColor;

public class Stone_Drill extends SimpleSlimefunItem<ToolUseHandler> {

	  public Stone_Drill() {
	    super(SPCItems.category_tools, SPCItems.STONE_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		null, SPCItems.DRILL_HEAD, null,
	    		SPCItems.ENDERITE_INGOT, SlimefunItems.POWER_CRYSTAL, SPCItems.ENDERITE_INGOT,
	    		SlimefunItems.REINFORCED_PLATE, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.REINFORCED_PLATE
	    });
	  }
	  
	  @Override
	    public ToolUseHandler getItemHandler() {
	        return (e, tool, fortune, drops) -> {
	            Block b = e.getBlock();

	            Boolean trukah;
	            
	            if (b.getType() == Material.STONE) {
	            	trukah = true;
	            } else if (b.getType() == Material.DIORITE) {
	            	trukah = true;
	            } else if (b.getType() == Material.GRANITE) {
	            	trukah = true;
	            } else if (b.getType() == Material.ANDESITE) {
	            	trukah = true;
	            } else if (b.getType() == Material.NETHERRACK) {
	            	trukah = true;
	            } else if (b.getType() == Material.END_STONE) {
	            	trukah = true;
	            } else if (b.getType() == Material.BLACKSTONE) {
	            	trukah = true;
	            } else {
	            	trukah = false;
	            }
	            
	            if (!trukah) {
	            	e.setCancelled(true);
	                e.getPlayer().sendMessage(ChatColor.RED + "Equip ini hanya bisa mine stone, diorite, andesite, granite, netherrack, endstone, blackstone");
	                e.getPlayer().getWorld().playSound(e.getPlayer().getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);
	            }
	        };
	    }
	}