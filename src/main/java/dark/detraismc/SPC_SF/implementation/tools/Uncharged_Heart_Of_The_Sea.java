package dark.detraismc.SPC_SF.implementation.tools;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;
import net.md_5.bungee.api.ChatColor;

public class Uncharged_Heart_Of_The_Sea extends SlimefunItem {

	public Uncharged_Heart_Of_The_Sea() {
	    super(SPCItems.category_consumable, SPCItems.UNCHARGED_HEART_OF_THE_SEA, RecipeType.ANCIENT_ALTAR, new ItemStack[] {
	    		SPCItems.ATLANTIC_INGOT, SPCItems.ATLANTIC_INGOT, SPCItems.ATLANTIC_INGOT,
	    		SPCItems.ATLANTIC_INGOT, new ItemStack(Material.NETHER_STAR), SPCItems.ATLANTIC_INGOT,
	    		SPCItems.ATLANTIC_INGOT, SPCItems.ATLANTIC_INGOT, SPCItems.ATLANTIC_INGOT
	    });
	  }
	  
	  @Override
	    public void preRegister() {

	        ItemUseHandler itemUseHandler = this::onItemRightClick;
	        addItemHandler(itemUseHandler);
	    }
	  
	  private void onItemRightClick(PlayerRightClickEvent event) {
		  event.cancel();
		  Player p = event.getPlayer();
		  ItemUtils.consumeItem(event.getItem(), false);
		  p.getInventory().addItem(new ItemStack(Material.HEART_OF_THE_SEA));
		  p.sendMessage(ChatColor.GREEN + "Berhasil charge");
	    }
}
