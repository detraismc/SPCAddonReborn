package dark.detraismc.SPC_SF.implementation.artificial_plant;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;

public class Artificial_Crops_Pumpkin_2 extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Artificial_Crops_Pumpkin_2() {
	        super(SPCItems.category_plant, SPCItems.ARTIFICIAL_CROPS_PUMPKIN_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.NETHERITE_PLATE, SPCItems.PROFESSIONAL_CIRCUIT_BOARD,
	        		SPCItems.ENDERITE_INGOT, SPCItems.ARTIFICIAL_CROPS_PUMPKIN, SPCItems.ENDERITE_INGOT,
	        		SlimefunItems.POWER_CRYSTAL, SPCItems.CROPS_MOTOR, SlimefunItems.POWER_CRYSTAL
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(8, new ItemStack[]{new ItemStack(Material.BONE_MEAL, 2)}, new ItemStack[]{new ItemStack(Material.PUMPKIN, 1)});
	      this.registerRecipe(8, new ItemStack[]{new ItemStack(Material.PUMPKIN_SEEDS, 1)}, new ItemStack[]{new ItemStack(Material.PUMPKIN, 2)});
	      
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
	    	  this.registerRecipe(8, new ItemStack[]{itemlah}, new ItemStack[]{new ItemStack(Material.PUMPKIN, 1)});
	      }
	      
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(new ItemStack(Material.BONE_MEAL, 2));
	      this.recipeList.add(new ItemStack(Material.PUMPKIN, 1));
	      
	      this.recipeList.add(new ItemStack(Material.PUMPKIN_SEEDS));
	      this.recipeList.add(new ItemStack(Material.PUMPKIN, 2));
	      
	      for (ItemStack itemlah : fertilizer) {
	    	  this.recipeList.add(itemlah);
		      this.recipeList.add(new ItemStack(Material.PUMPKIN, 1));
		      }
	      
	      
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "ARTIFICIAL_CROPS_PUMPKIN_2";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 50;
	    }

	    @Override
	    public int getCapacity() {
	        return 1024;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.PUMPKIN);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&aArtificial Crops &e[Pumpkin] &7- &eII";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}
