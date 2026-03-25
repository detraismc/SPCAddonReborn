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

public class Alloy_Press_2 extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Alloy_Press_2() {
	        super(SPCItems.category_machine, SPCItems.ALLOY_PRESS_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SPCItems.ELITE_INGOT, SPCItems.INFERNAL_ALLOY_INGOT, SPCItems.ELITE_INGOT,
	        		SPCItems.ENDERITE_INGOT, SPCItems.ALLOY_PRESS, SPCItems.ENDERITE_INGOT,
	        		SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SlimefunItems.ENERGIZED_CAPACITOR, SPCItems.PROFESSIONAL_CIRCUIT_BOARD
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(18, new ItemStack[]{new SlimefunItemStack(SlimefunItems.STEEL_INGOT, 8)},
	    		  new ItemStack[]{SlimefunItems.STEEL_PLATE});
	      
	      this.registerRecipe(18, new ItemStack[]{new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 8)}, 
	    		  new ItemStack[]{SlimefunItems.REINFORCED_PLATE});
	      
	      this.registerRecipe(18, new ItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_4K, 8)}, 
	    		  new ItemStack[]{SPCItems.GOLDEN_PLATE});
	      
	      this.registerRecipe(18, new ItemStack[]{new ItemStack(Material.DIAMOND, 8)}, 
	    		  new ItemStack[]{SPCItems.DIAMOND_PLATE});
	      
	      this.registerRecipe(18, new ItemStack[]{new SlimefunItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE, 32)}, 
	    		  new ItemStack[]{SPCItems.SAPPHIRE_PLATE});
	      
	      this.registerRecipe(18, new ItemStack[]{new ItemStack(Material.NETHERITE_INGOT, 8)}, 
	    		  new ItemStack[]{SPCItems.NETHERITE_PLATE});
	      
	      this.registerRecipe(18, new ItemStack[]{new SlimefunItemStack(SPCItems.ENDERITE_INGOT, 8)}, 
	    		  new ItemStack[]{SPCItems.ENDERITE_PLATE});
	      
	      this.registerRecipe(18, new ItemStack[]{new SlimefunItemStack(SlimefunItems.STEEL_PLATE, 9)}, 
	    		  new ItemStack[]{SPCItems.FOLDED_STEEL_PLATE});
	      
	      this.registerRecipe(18, new ItemStack[]{new SlimefunItemStack(SPCItems.VOID_INGOT, 8)}, 
	    		  new ItemStack[]{SPCItems.VOID_PLATE});
	      
	      this.registerRecipe(18, new ItemStack[]{new SlimefunItemStack(SPCItems.WEEB_INGOT, 8)}, 
	    		  new ItemStack[]{SPCItems.WEEB_PLATE});
	      
	      this.registerRecipe(18, new ItemStack[]{new SlimefunItemStack(SPCItems.INFERNAL_ALLOY_INGOT, 8)}, 
	    		  new ItemStack[]{SPCItems.INFERNAL_ALLOY_PLATE});
	      
	      
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(new SlimefunItemStack(SlimefunItems.STEEL_INGOT, 8));
	      this.recipeList.add(SlimefunItems.STEEL_PLATE);
	      
	      this.recipeList.add(new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 8));
	      this.recipeList.add(SlimefunItems.REINFORCED_PLATE);
	      
	      this.recipeList.add(new SlimefunItemStack(SlimefunItems.GOLD_4K, 8));
	      this.recipeList.add(SPCItems.GOLDEN_PLATE);
	      
	      this.recipeList.add(new ItemStack(Material.DIAMOND, 8));
	      this.recipeList.add(SPCItems.DIAMOND_PLATE);
	      
	      this.recipeList.add(new SlimefunItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE, 32));
	      this.recipeList.add(SPCItems.SAPPHIRE_PLATE);
	      
	      this.recipeList.add(new ItemStack(Material.NETHERITE_INGOT, 8));
	      this.recipeList.add(SPCItems.NETHERITE_PLATE);
	      
	      this.recipeList.add(new SlimefunItemStack(SPCItems.ENDERITE_INGOT, 8));
	      this.recipeList.add(SPCItems.ENDERITE_PLATE);
	      
	      this.recipeList.add(new SlimefunItemStack(SlimefunItems.STEEL_PLATE, 9));
	      this.recipeList.add(SPCItems.FOLDED_STEEL_PLATE);
	      
	      this.recipeList.add(new SlimefunItemStack(SPCItems.VOID_INGOT, 8));
	      this.recipeList.add(SPCItems.VOID_PLATE);
	      
	      this.recipeList.add(new SlimefunItemStack(SPCItems.WEEB_INGOT, 8));
	      this.recipeList.add(SPCItems.WEEB_PLATE);
	      
	      this.recipeList.add(new SlimefunItemStack(SPCItems.INFERNAL_ALLOY_INGOT, 8));
	      this.recipeList.add(SPCItems.INFERNAL_ALLOY_PLATE);
	      
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "ALLOY_PRESS_2";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 16;
	    }

	    @Override
	    public int getCapacity() {
	        return 1024;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.PISTON);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&eAlloy Press &7- &eII";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}