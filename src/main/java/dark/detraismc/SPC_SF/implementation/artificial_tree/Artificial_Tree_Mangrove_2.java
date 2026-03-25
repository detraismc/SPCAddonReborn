package dark.detraismc.SPC_SF.implementation.artificial_tree;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Artificial_Tree_Mangrove_2 extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Artificial_Tree_Mangrove_2() {
	        super(SPCItems.category_plant, SPCItems.ARTIFICIAL_TREE_MANGROVE_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.NETHERITE_PLATE, SPCItems.PROFESSIONAL_CIRCUIT_BOARD,
	        		SPCItems.ENDERITE_INGOT, SPCItems.ARTIFICIAL_TREE_MANGROVE, SPCItems.ENDERITE_INGOT,
	        		SlimefunItems.POWER_CRYSTAL, SlimefunItems.TREE_GROWTH_ACCELERATOR, SlimefunItems.POWER_CRYSTAL
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.BONE_MEAL, 3)}, new ItemStack[]{new ItemStack(Material.MANGROVE_LOG, 3), new ItemStack(Material.MANGROVE_LEAVES, 4)});
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.MANGROVE_PROPAGULE, 1)}, new ItemStack[]{new ItemStack(Material.MANGROVE_LOG, 7), new ItemStack(Material.MANGROVE_LEAVES, 10)});
	      
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
	    	  this.registerRecipe(5, new ItemStack[]{itemlah}, new ItemStack[]{new ItemStack(Material.MANGROVE_LOG, 5), new ItemStack(Material.MANGROVE_LEAVES, 7)});
	      }
	      
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(new ItemStack(Material.BONE_MEAL, 3));
	      this.recipeList.add(new ItemStack(Material.MANGROVE_LOG, 3));
	      this.recipeList.add(new ItemStack(Material.BONE_MEAL));
	      this.recipeList.add(new ItemStack(Material.MANGROVE_LEAVES, 4));
	      
	      this.recipeList.add(new ItemStack(Material.MANGROVE_PROPAGULE));
	      this.recipeList.add(new ItemStack(Material.MANGROVE_LOG, 7));
	      this.recipeList.add(new ItemStack(Material.MANGROVE_PROPAGULE));
	      this.recipeList.add(new ItemStack(Material.MANGROVE_LEAVES, 10));
	      
	      for (ItemStack itemlah : fertilizer) {
	    	  this.recipeList.add(itemlah);
		      this.recipeList.add(new ItemStack(Material.MANGROVE_LOG, 5));
		      this.recipeList.add(itemlah);
		      this.recipeList.add(new ItemStack(Material.MANGROVE_LEAVES, 7));
		      }
	      
	      
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "ARTIFICIAL_TREE_MANGROVE_2";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 60;
	    }

	    @Override
	    public int getCapacity() {
	        return 1024;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.MANGROVE_PROPAGULE);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&aArtificial Tree &e[Mangrove] &7- &eII";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}
