package dark.detraismc.SPC_SF.implementation.tools;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ToolUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import net.md_5.bungee.api.ChatColor;

public class Void_Stone_Drill extends SimpleSlimefunItem<ToolUseHandler> {

	  public Void_Stone_Drill() {
		    super(SPCItems.category_tools, SPCItems.VOID_STONE_DRILL, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
		    		null, SPCItems.VOID_INGOT, null,
		    		SPCItems.VOID_INGOT, SPCItems.STONE_DRILL, SPCItems.VOID_INGOT,
		    		null, SPCItems.VOID_INGOT, null
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
