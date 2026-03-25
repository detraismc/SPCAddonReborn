package dark.detraismc.SPC_SF.implementation.tools;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class Indonesian_Ingredient_LootBag extends SlimefunItem {

	  public Indonesian_Ingredient_LootBag() {
	    super(SPCItems.category_consumable, SPCItems.INDONESIAN_INGREDIENT_LOOTBAG, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	    		null, new ItemStack(Material.CARROT), new ItemStack(Material.POTATO),
	    		new ItemStack(Material.GRASS_BLOCK), new ItemStack(Material.LEATHER), new ItemStack(Material.WHEAT),
	    		new ItemStack(Material.GRASS_BLOCK), new ItemStack(Material.GRASS_BLOCK), null
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
		  int woe = ((int) (Math.random()*(12 - 1))) + 1;
		  ItemStack drop;
		  switch (woe){
		  case 1:
			  drop = SPCItems.BANANA;
			  break;
		  case 2:
			  drop = SPCItems.CASSAVA;
			  break;
		  case 3:
			  drop = SPCItems.CHILI;
			  break;
		  case 4:
			  drop = SPCItems.COFFEE_BEAN;
			  break;
		  case 5:
			  drop = SPCItems.DURIAN;
			  break;
		  case 6:
			  drop = SPCItems.MANGO;
			  break;
		  case 7:
			  drop = SPCItems.MSG;
			  break;
		  case 8:
			  drop = SPCItems.PEANUT;
			  break;
		  case 9:
			  drop = SPCItems.RICE;
			  break;
		  case 10:
			  drop = SPCItems.SALAM_AND_SEREH;
			  break;
		  case 11:
			  drop = SPCItems.SOYBEAN;
			  break;
		  case 12:
			  drop = SPCItems.TOBACCO;
			  break;
		  default:
			  drop = SPCItems.BANANA;
			  break;
		  }
		  p.getInventory().addItem(drop);
		  if (p.getGameMode() != GameMode.CREATIVE) {
			  ItemUtils.consumeItem(event.getItem(), false); 
			  }
		  p.getWorld().playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1, 1);
	    }

	}