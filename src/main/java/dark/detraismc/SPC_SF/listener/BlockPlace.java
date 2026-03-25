package dark.detraismc.SPC_SF.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import dark.detraismc.SPC_SF.SPCAddon;
import net.md_5.bungee.api.ChatColor;

public class BlockPlace implements Listener {
	
	SPCAddon plugin = SPCAddon.getInstance();
	
	@EventHandler
	public void blockPlace(BlockPlaceEvent e) 
	{
		Player p = e.getPlayer();
		if (!e.getItemInHand().hasItemMeta()) {
			return;
		}
		if (!e.getItemInHand().getItemMeta().hasLore()) {
			return;
		}
		if (!e.getItemInHand().getItemMeta().getLore().toString().contains("<Type>")) {
			return;
		}
		p.sendMessage(ChatColor.RED + "Spawnermu terkena bug, harap refund ke discord");
		e.setCancelled(true);
		
	}
	
}
