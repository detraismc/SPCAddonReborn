package dark.detraismc.SPC_SF.listener;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public class DragonDrop implements Listener {
	
	@EventHandler
	public void enderdragonDrop(EntityDeathEvent e) 
	{
		if (e.getEntityType()==EntityType.ENDER_DRAGON) {
				e.getDrops().add(new SlimefunItemStack(SPCItems.ENDER_DRAGON_SCALES, 1));
		}
	}
}