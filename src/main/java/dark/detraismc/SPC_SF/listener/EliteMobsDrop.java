package dark.detraismc.SPC_SF.listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCAddon;
import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public class EliteMobsDrop implements Listener {
	
	String e_name = ChatColor.GRAY + "[" + ChatColor.YELLOW + "Elite Mobs" + ChatColor.GRAY + "]" + ChatColor.RESET + " ";
	SPCAddon plugin = SPCAddon.getInstance();
	
	@EventHandler
	public void eliteDrop(EntityDeathEvent e) 
	{
		if (e.getEntity().getName().contains(e_name)) {
			if (e.getEntityType()==EntityType.WITHER) {
				e.getDrops().clear();
				e.getDrops().add(new SlimefunItemStack(SPCItems.ELITE_COIN, 5));
				e.getDrops().add(new ItemStack(Material.NETHER_STAR, 3));
			} else if (e.getEntityType()==EntityType.ENDER_DRAGON) {
				e.getDrops().add(new SlimefunItemStack(SPCItems.ELITE_COIN, 15));
				e.getDrops().add(new ItemStack(Material.DRAGON_HEAD));
				e.getDrops().add(new ItemStack(Material.DRAGON_EGG));
				e.getDrops().add(new ItemStack(Material.ELYTRA));
			} else {
				e.getDrops().clear();
				e.getDrops().add(SPCItems.ELITE_COIN);
			}
		}
	}
	
	@EventHandler
	public void artifactDrop(EntityDeathEvent e) 
	{
		if (e.getEntity().getName().contains(ChatColor.RED + "Artifact Guardian")) {
			e.getDrops().clear();
			e.getDrops().add(SPCItems.UNIDENTIFIED_ARTIFACT);
		}
		if (e.getEntity().getName().contains(ChatColor.RED + "Artifact Hunter")) {
			e.getDrops().clear();
			e.getDrops().add(SPCItems.UNIDENTIFIED_ARTIFACT);
		}
		if (e.getEntity().getName().contains(ChatColor.RED + "Artifact Bomber")) {
			e.getDrops().clear();
			e.getDrops().add(SPCItems.UNIDENTIFIED_ARTIFACT);
		}
	}
}