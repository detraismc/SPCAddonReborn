package dark.detraismc.SPC_SF.implementation.artificial_tree;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;

public class Artificial_Tree_Acacia extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Artificial_Tree_Acacia() {
	        super(SPCItems.category_plant, SPCItems.ARTIFICIAL_TREE_ACACIA, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		new ItemStack(Material.ACACIA_SAPLING), SPCItems.ARTIFICIAL_HARVESTER, new ItemStack(Material.ACACIA_SAPLING),
	        		SPCItems.ARTIFICIAL_SOIL, SPCItems.ARTIFICIAL_SOIL, SPCItems.ARTIFICIAL_SOIL,
	        		SlimefunItems.BRONZE_INGOT, SlimefunItems.POWER_CRYSTAL, SlimefunItems.BRONZE_INGOT
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.BONE_MEAL, 3)}, new ItemStack[]{new ItemStack(Material.ACACIA_LOG, 2), new ItemStack(Material.ACACIA_LEAVES, 3)});
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.ACACIA_SAPLING, 1)}, new ItemStack[]{new ItemStack(Material.ACACIA_LOG, 6), new ItemStack(Material.ACACIA_LEAVES, 9)});
	      
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
	    	  this.registerRecipe(5, new ItemStack[]{itemlah}, new ItemStack[]{new ItemStack(Material.ACACIA_LOG, 4), new ItemStack(Material.ACACIA_LEAVES, 6)});
	      }
	      
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(new ItemStack(Material.BONE_MEAL, 3));
	      this.recipeList.add(new ItemStack(Material.ACACIA_LOG, 2));
	      this.recipeList.add(new ItemStack(Material.BONE_MEAL));
	      this.recipeList.add(new ItemStack(Material.ACACIA_LEAVES, 3));
	      
	      this.recipeList.add(new ItemStack(Material.ACACIA_SAPLING));
	      this.recipeList.add(new ItemStack(Material.ACACIA_LOG, 6));
	      this.recipeList.add(new ItemStack(Material.ACACIA_SAPLING));
	      this.recipeList.add(new ItemStack(Material.ACACIA_LEAVES, 9));
	      
	      for (ItemStack itemlah : fertilizer) {
	    	  this.recipeList.add(itemlah);
		      this.recipeList.add(new ItemStack(Material.ACACIA_LOG, 4));
		      this.recipeList.add(itemlah);
		      this.recipeList.add(new ItemStack(Material.ACACIA_LEAVES, 6));
		      }
	      
	      
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "ARTIFICIAL_TREE_ACACIA";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 30;
	    }

	    @Override
	    public int getCapacity() {
	        return 1024;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.ACACIA_SAPLING);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&aArtificial Tree &e[Acacia]";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}
