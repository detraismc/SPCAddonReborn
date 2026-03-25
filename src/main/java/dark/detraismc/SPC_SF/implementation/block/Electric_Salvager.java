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

public class Electric_Salvager extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Electric_Salvager() {
	        super(SPCItems.category_machine, SPCItems.ELECTRIC_SALVAGER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SPCItems.CORRUPTED_REDSTONE_DUST_2, SlimefunItems.ELECTRIC_FURNACE_3, SPCItems.CORRUPTED_REDSTONE_DUST_2,
	        		SPCItems.NETHERITE_PLATE, new ItemStack(Material.BLAST_FURNACE), SPCItems.NETHERITE_PLATE,
		    		SlimefunItems.ELECTRIC_FURNACE_3, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.ELECTRIC_FURNACE_3
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(30, new ItemStack[]{SlimefunItems.STEEL_PLATE}, 
	    		  new ItemStack[]{new SlimefunItemStack(SlimefunItems.STEEL_INGOT, 8)});
	      
	      this.registerRecipe(30, new ItemStack[]{SlimefunItems.REINFORCED_PLATE}, 
	    		  new ItemStack[]{new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 8)});
	      
	      this.registerRecipe(30, new ItemStack[]{SPCItems.GOLDEN_PLATE}, 
	    		  new ItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_4K, 8)});
	      
	      this.registerRecipe(30, new ItemStack[]{SPCItems.DIAMOND_PLATE}, 
	    		  new ItemStack[]{new ItemStack(Material.DIAMOND, 8)});
	      
	      this.registerRecipe(30, new ItemStack[]{SPCItems.SAPPHIRE_PLATE}, 
	    		  new ItemStack[]{new SlimefunItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE, 32)});
	      
	      this.registerRecipe(30, new ItemStack[]{SPCItems.NETHERITE_PLATE}, 
	    		  new ItemStack[]{new ItemStack(Material.NETHERITE_INGOT, 8)});
	      
	      this.registerRecipe(30, new ItemStack[]{SPCItems.ENDERITE_PLATE}, 
	    		  new ItemStack[]{new SlimefunItemStack(SPCItems.ENDERITE_INGOT, 8)});
	      
	      this.registerRecipe(30, new ItemStack[]{SPCItems.FOLDED_STEEL_PLATE}, 
	    		  new ItemStack[]{new SlimefunItemStack(SlimefunItems.STEEL_PLATE, 9)});
	      
	      this.registerRecipe(30, new ItemStack[]{SPCItems.VOID_PLATE}, 
	    		  new ItemStack[]{new SlimefunItemStack(SPCItems.VOID_INGOT, 8)});
	      
	      this.registerRecipe(30, new ItemStack[]{SPCItems.WEEB_PLATE}, 
	    		  new ItemStack[]{new SlimefunItemStack(SPCItems.WEEB_INGOT, 8)});
	      
	      this.registerRecipe(30, new ItemStack[]{SPCItems.INFERNAL_ALLOY_PLATE}, 
	    		  new ItemStack[]{new SlimefunItemStack(SPCItems.INFERNAL_ALLOY_INGOT, 8)});
	      
	      
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(SlimefunItems.STEEL_PLATE);
	      this.recipeList.add(new SlimefunItemStack(SlimefunItems.STEEL_INGOT, 8));
	      
	      this.recipeList.add(SlimefunItems.REINFORCED_PLATE);
	      this.recipeList.add(new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 8));
	      
	      this.recipeList.add(SPCItems.GOLDEN_PLATE);
	      this.recipeList.add(new SlimefunItemStack(SlimefunItems.GOLD_4K, 8));
	      
	      this.recipeList.add(SPCItems.DIAMOND_PLATE);
	      this.recipeList.add(new ItemStack(Material.DIAMOND, 8));
	      
	      this.recipeList.add(SPCItems.SAPPHIRE_PLATE);
	      this.recipeList.add(new SlimefunItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE, 32));
	      
	      this.recipeList.add(SPCItems.NETHERITE_PLATE);
	      this.recipeList.add(new ItemStack(Material.NETHERITE_INGOT, 8));
	      
	      this.recipeList.add(SPCItems.ENDERITE_PLATE);
	      this.recipeList.add(new SlimefunItemStack(SPCItems.ENDERITE_INGOT, 8));
	      
	      this.recipeList.add(SPCItems.FOLDED_STEEL_PLATE);
	      this.recipeList.add(new SlimefunItemStack(SlimefunItems.STEEL_PLATE, 9));
	      
	      this.recipeList.add(SPCItems.VOID_PLATE);
	      this.recipeList.add(new SlimefunItemStack(SPCItems.VOID_INGOT, 8));
	      
	      this.recipeList.add(SPCItems.WEEB_PLATE);
	      this.recipeList.add(new SlimefunItemStack(SPCItems.WEEB_INGOT, 8));
	      
	      this.recipeList.add(SPCItems.INFERNAL_ALLOY_PLATE);
	      this.recipeList.add(new SlimefunItemStack(SPCItems.INFERNAL_ALLOY_INGOT, 8));
	      
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "ELECTRIC_SALVAGER";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 32;
	    }

	    @Override
	    public int getCapacity() {
	        return 1024;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.BLAST_FURNACE);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&eElectric Salvager";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}