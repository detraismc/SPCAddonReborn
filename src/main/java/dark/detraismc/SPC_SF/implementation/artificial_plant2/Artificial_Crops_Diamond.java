package dark.detraismc.SPC_SF.implementation.artificial_plant2;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;

public class Artificial_Crops_Diamond extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Artificial_Crops_Diamond() {
	        super(SPCItems.category_plant, SPCItems.ARTIFICIAL_CROPS_DIAMOND, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SlimefunItem.getById("DIAMOND_PLANT").getItem(), SPCItems.ARTIFICIAL_HARVESTER, SlimefunItem.getById("DIAMOND_PLANT").getItem(),
	        		SPCItems.ARTIFICIAL_SOIL, SPCItems.ARTIFICIAL_SOIL, SPCItems.ARTIFICIAL_SOIL,
	        		SlimefunItems.BRONZE_INGOT, SlimefunItems.POWER_CRYSTAL, SlimefunItems.BRONZE_INGOT
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(12, new ItemStack[]{new ItemStack(Material.BONE_MEAL, 3)}, new ItemStack[]{SlimefunItem.getById("DIAMOND_ESSENCE").getItem()});
	      
	      List<ItemStack> fertilizer = new ArrayList<>();
	      fertilizer.add(SlimefunItems.WHEAT_FERTILIZER);
	      fertilizer.add(SlimefunItems.APPLE_FERTILIZER);
	      fertilizer.add(SlimefunItems.BEETROOT_FERTILIZER);
	      fertilizer.add(SlimefunItems.CARROT_FERTILIZER);
	      fertilizer.add(SlimefunItems.COCOA_FERTILIZER);
	      fertilizer.add(SlimefunItems.KELP_FERTILIZER);
	      fertilizer.add(SlimefunItems.MELON_FERTILIZER);
	      fertilizer.add(SlimefunItems.POTATO_FERTILIZER);
	      fertilizer.add(SlimefunItems.SEEDS_FERTILIZER);
	      fertilizer.add(SlimefunItems.SWEET_BERRIES_FERTILIZER);
	      
	      for (ItemStack itemlah : fertilizer) {
	    	  this.registerRecipe(12, new ItemStack[]{itemlah}, new ItemStack[]{SlimefunItem.getById("DIAMOND_ESSENCE").getItem()});
	      }
	      
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(new ItemStack(Material.BONE_MEAL, 3));
	      this.recipeList.add(SlimefunItem.getById("DIAMOND_ESSENCE").getItem());
	      
	      for (ItemStack itemlah : fertilizer) {
	    	  this.recipeList.add(itemlah);
		      this.recipeList.add(SlimefunItem.getById("DIAMOND_ESSENCE").getItem());
		      }
	      
	      
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "ARTIFICIAL_CROPS_DIAMOND";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 40;
	    }

	    @Override
	    public int getCapacity() {
	        return 1024;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.BLAZE_POWDER);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&aArtificial Crops &e[Diamond]";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}
