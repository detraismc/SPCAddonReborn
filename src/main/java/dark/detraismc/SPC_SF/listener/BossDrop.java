package dark.detraismc.SPC_SF.listener;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import dark.detraismc.SPC_SF.SPCAddon;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public class BossDrop implements Listener {
	
	SPCAddon plugin = SPCAddon.getInstance();
	
	@EventHandler
	public void eliteDrop(EntityDeathEvent e) 
	{
		if (e.getEntity().getName().contains(ChatColor.RED + "Ender King")) {
			e.getDrops().clear();
			e.getDrops().add(new SlimefunItemStack(SPCItems.VOID_ESSENCE, 1));
		}
	}
}
