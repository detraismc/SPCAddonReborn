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

public class Void_Obsidian_Drill extends SimpleSlimefunItem<ToolUseHandler> {

	  public Void_Obsidian_Drill() {
	    super(SPCItems.category_tools, SPCItems.VOID_OBSIDIAN_DRILL, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		null, SPCItems.VOID_INGOT, null,
	    		SPCItems.VOID_INGOT, SPCItems.OBSIDIAN_DRILL, SPCItems.VOID_INGOT,
	    		null, SPCItems.VOID_INGOT, null
	    });
	  }
	  
	  @Override
	    public ToolUseHandler getItemHandler() {
	        return (e, tool, fortune, drops) -> {
	            Block b = e.getBlock();

	            if (b.getType() != Material.OBSIDIAN) {
	                e.setCancelled(true);
	                e.getPlayer().sendMessage(ChatColor.RED + "Equip ini hanya bisa mine obsidian");
	                e.getPlayer().getWorld().playSound(e.getPlayer().getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);
	            }
	        };
	    }
	}
