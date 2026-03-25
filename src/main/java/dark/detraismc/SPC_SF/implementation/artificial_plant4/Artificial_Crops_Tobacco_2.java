package dark.detraismc.SPC_SF.implementation.artificial_plant4;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;

public class Artificial_Crops_Tobacco_2 extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Artificial_Crops_Tobacco_2() {
	        super(SPCItems.category_plant, SPCItems.ARTIFICIAL_CROPS_TOBACCO_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.NETHERITE_PLATE, SPCItems.PROFESSIONAL_CIRCUIT_BOARD,
	        		SPCItems.ENDERITE_INGOT, SPCItems.ARTIFICIAL_CROPS_TOBACCO, SPCItems.ENDERITE_INGOT,
	        		SlimefunItems.POWER_CRYSTAL, SPCItems.CROPS_MOTOR, SlimefunItems.POWER_CRYSTAL
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(12, new ItemStack[]{new ItemStack(Material.BONE_MEAL, 3)}, new ItemStack[]{SPCItems.TOBACCO});
	      
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
	    	  this.registerRecipe(12, new ItemStack[]{itemlah}, new ItemStack[]{SPCItems.TOBACCO});
	      }
	      
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(new ItemStack(Material.BONE_MEAL, 3));
	      this.recipeList.add(SPCItems.TOBACCO);
	      
	      for (ItemStack itemlah : fertilizer) {
	    	  this.recipeList.add(itemlah);
		      this.recipeList.add(SPCItems.TOBACCO);
		      }
	      
	      
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "ARTIFICIAL_CROPS_TOBACCO_2";
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
	        return SPCItems.TOBACCO;
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&aArtificial Crops &e[Tobacco] &7- &eII";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}
