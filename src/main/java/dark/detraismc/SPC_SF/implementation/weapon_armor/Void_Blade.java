package dark.detraismc.SPC_SF.implementation.weapon_armor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.EvokerFangs;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.BlockIterator;

import dark.detraismc.SPC_SF.SPCAddon;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;

public class Void_Blade extends SlimefunItem {
	
	SPCAddon plugin = SPCAddon.getInstance();

	public Void_Blade() {
	    super(SPCItems.category_weapon, SPCItems.VOID_BLADE, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	    		null, SPCItems.VOID_INGOT, null,
	    		SPCItems.VOID_INGOT, SPCItems.VOID_INGOT, SPCItems.VOID_INGOT,
	    		null, SPCItems.CORRUPTED_BONE_2, null
	    });
	  }
	  
	  
	  @Override
	  public void preRegister() {
		  
		  ItemUseHandler itemUseHandler = this::onItemRightClick;
		  addItemHandler(itemUseHandler);
	  }
	  
	  
	  private void onItemRightClick(PlayerRightClickEvent e) {
		  e.cancel();
		  Player p = e.getPlayer();
		  
		  if (p.getInventory().getItemInOffHand().equals(SPCItems.VOID_BLADE)) {
			  p.sendMessage(ChatColor.RED + "Item ini tidak bisa dijadikan offhand");
			  return;
		  }
		  if (plugin.cooldown_map.containsKey(p.getName())) {
			  p.sendMessage(ChatColor.RED + "Item ini sedang cooldown");
			  return;
		  }
		  plugin.cooldown_map.put(p.getName(), "true");
		  
		  BlockIterator iter = new BlockIterator(p, 10);
		  Block lastBlock = iter.next();

		  while(iter.hasNext()) {
			  lastBlock = iter.next();
			  if (lastBlock.getType().isSolid()) {
				  break;
			  }
		  }
		  
		  Location l = lastBlock.getLocation();
		  l.setY(l.getY() + 1.0D);
		  l.setX(l.getX() + 0.5D);
		  l.setZ(l.getZ() + 0.5D);
		  EvokerFangs mob = (EvokerFangs) p.getLocation().getWorld().spawn(l, EvokerFangs.class);
		  mob.setCustomName("Void Blade");
		  
		  Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
	            @Override
	            public void run() {
	            	plugin.cooldown_map.remove(p.getName());
	            }
	        }, 20L);
	         
	  }
	  
	  
	  
	}
