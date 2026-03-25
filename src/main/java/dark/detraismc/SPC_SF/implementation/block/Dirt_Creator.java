package dark.detraismc.SPC_SF.implementation.block;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;

public class Dirt_Creator extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Dirt_Creator() {
	        super(SPCItems.category_machine, SPCItems.DIRT_CREATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SlimefunItems.STEEL_PLATE, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.STEEL_PLATE,
		    		SlimefunItems.REDSTONE_ALLOY, new ItemStack(Material.COMPOSTER), SlimefunItems.REDSTONE_ALLOY,
		    		SlimefunItems.STEEL_PLATE, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.STEEL_PLATE
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.COBBLESTONE, 1)}, new ItemStack[]{new ItemStack(Material.DIRT, 2)});
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.DIORITE, 1)}, new ItemStack[]{new ItemStack(Material.DIRT, 2)});
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.ANDESITE, 1)}, new ItemStack[]{new ItemStack(Material.DIRT, 2)});
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.GRANITE, 1)}, new ItemStack[]{new ItemStack(Material.DIRT, 2)});
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.OAK_PLANKS, 1)}, new ItemStack[]{new ItemStack(Material.DIRT, 2)});
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.BIRCH_PLANKS, 1)}, new ItemStack[]{new ItemStack(Material.DIRT, 2)});
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.SPRUCE_PLANKS, 1)}, new ItemStack[]{new ItemStack(Material.DIRT, 2)});
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.JUNGLE_PLANKS, 1)}, new ItemStack[]{new ItemStack(Material.DIRT, 2)});
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.ACACIA_PLANKS, 1)}, new ItemStack[]{new ItemStack(Material.DIRT, 2)});
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.DARK_OAK_PLANKS, 1)}, new ItemStack[]{new ItemStack(Material.DIRT, 2)});
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(new ItemStack(Material.COBBLESTONE));
	      this.recipeList.add(new ItemStack(Material.DIRT, 2));
	      this.recipeList.add(new ItemStack(Material.DIORITE));
	      this.recipeList.add(new ItemStack(Material.DIRT, 2));
	      this.recipeList.add(new ItemStack(Material.ANDESITE));
	      this.recipeList.add(new ItemStack(Material.DIRT, 2));
	      this.recipeList.add(new ItemStack(Material.GRANITE));
	      this.recipeList.add(new ItemStack(Material.DIRT, 2));
	      this.recipeList.add(new ItemStack(Material.OAK_PLANKS));
	      this.recipeList.add(new ItemStack(Material.DIRT, 2));
	      this.recipeList.add(new ItemStack(Material.BIRCH_PLANKS));
	      this.recipeList.add(new ItemStack(Material.DIRT, 2));
	      this.recipeList.add(new ItemStack(Material.SPRUCE_PLANKS));
	      this.recipeList.add(new ItemStack(Material.DIRT, 2));
	      this.recipeList.add(new ItemStack(Material.JUNGLE_PLANKS));
	      this.recipeList.add(new ItemStack(Material.DIRT, 2));
	      this.recipeList.add(new ItemStack(Material.ACACIA_PLANKS));
	      this.recipeList.add(new ItemStack(Material.DIRT, 2));
	      this.recipeList.add(new ItemStack(Material.DARK_OAK_PLANKS));
	      this.recipeList.add(new ItemStack(Material.DIRT, 2));
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "DIRT_CREATOR";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 5;
	    }

	    @Override
	    public int getCapacity() {
	        return 1024;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.STONE_SHOVEL);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&6Dirt Creator";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}