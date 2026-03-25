package dark.detraismc.SPC_SF.implementation.block;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;

public class Mini_Hospital extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Mini_Hospital() {
	        super(SPCItems.category_machine, SPCItems.MINI_HOSPITAL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SlimefunItems.DURALUMIN_INGOT, new ItemStack(Material.RED_DYE), SlimefunItems.DURALUMIN_INGOT,
	        		new ItemStack(Material.RED_DYE), new ItemStack(Material.GOLDEN_APPLE), new ItemStack(Material.RED_DYE),
	        		SlimefunItems.DURALUMIN_INGOT, new ItemStack(Material.RED_DYE), SlimefunItems.DURALUMIN_INGOT
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(20, new ItemStack[]{new ItemStack(Material.GLASS_BOTTLE, 1), SPCItems.HEALING_HERB}
	      , new ItemStack[]{SPCItems.HEALTH_POTION});
	      this.registerRecipe(40, new ItemStack[]{new ItemStack(Material.GLASS_BOTTLE, 1), SPCItems.HEALING_TICKET}
	      , new ItemStack[]{SPCItems.HEALTH_POTION_2});
	      this.registerRecipe(60, new ItemStack[]{new ItemStack(Material.GLASS_BOTTLE, 1), SPCItems.HEALING_CORE}
	      , new ItemStack[]{SPCItems.HEALTH_POTION_3});
	      this.registerRecipe(80, new ItemStack[]{new ItemStack(Material.GLASS_BOTTLE, 1), SPCItems.HEALING_FRUIT}
	      , new ItemStack[]{SPCItems.HEALTH_POTION_4});
	      this.registerRecipe(80, new ItemStack[]{new ItemStack(Material.WATER_BUCKET, 1), SPCItems.CORRUPTED_GOLD_INGOT}
	      , new ItemStack[]{new SlimefunItemStack(SPCItems.HOLY_WATER, 4)});
	      this.registerRecipe(80, new ItemStack[]{new ItemStack(Material.MILK_BUCKET, 1), SPCItems.CORRUPTED_EMERALD}
	      , new ItemStack[]{new SlimefunItemStack(SPCItems.CURE_ALL, 4)});
	      
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(new ItemStack(Material.GLASS_BOTTLE, 1));
	      this.recipeList.add(SPCItems.HEALTH_POTION);
	      this.recipeList.add(SPCItems.HEALING_HERB);
	      this.recipeList.add(SPCItems.HEALTH_POTION);
	      
	      this.recipeList.add(new ItemStack(Material.GLASS_BOTTLE, 1));
	      this.recipeList.add(SPCItems.HEALTH_POTION_2);
	      this.recipeList.add(SPCItems.HEALING_TICKET);
	      this.recipeList.add(SPCItems.HEALTH_POTION_2);
	      
	      this.recipeList.add(new ItemStack(Material.GLASS_BOTTLE, 1));
	      this.recipeList.add(SPCItems.HEALTH_POTION_3);
	      this.recipeList.add(SPCItems.HEALING_CORE);
	      this.recipeList.add(SPCItems.HEALTH_POTION_3);
	      
	      this.recipeList.add(new ItemStack(Material.GLASS_BOTTLE, 1));
	      this.recipeList.add(SPCItems.HEALTH_POTION_4);
	      this.recipeList.add(SPCItems.HEALING_FRUIT);
	      this.recipeList.add(SPCItems.HEALTH_POTION_4);
	      
	      this.recipeList.add(new ItemStack(Material.WATER_BUCKET, 1));
	      this.recipeList.add(new SlimefunItemStack(SPCItems.HOLY_WATER, 4));
	      this.recipeList.add(SPCItems.CORRUPTED_GOLD_INGOT);
	      this.recipeList.add(new SlimefunItemStack(SPCItems.HOLY_WATER, 4));
	      
	      this.recipeList.add(new ItemStack(Material.MILK_BUCKET, 1));
	      this.recipeList.add(new SlimefunItemStack(SPCItems.CURE_ALL, 4));
	      this.recipeList.add(SPCItems.CORRUPTED_EMERALD);
	      this.recipeList.add(new SlimefunItemStack(SPCItems.CURE_ALL, 4));
	      
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "MINI_HOSPITAL";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 4;
	    }

	    @Override
	    public int getCapacity() {
	        return 1024;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.GOLDEN_APPLE);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&dMini Hospital";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}