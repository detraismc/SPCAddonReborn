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

public class Dirt_Creator_2 extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Dirt_Creator_2() {
	        super(SPCItems.category_machine, SPCItems.DIRT_CREATOR_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SlimefunItems.REINFORCED_PLATE, SlimefunItems.COAL_GENERATOR_2, SlimefunItems.REINFORCED_PLATE,
		    		SlimefunItems.CARBONADO, SPCItems.DIRT_CREATOR, SlimefunItems.CARBONADO,
		    		SlimefunItems.REINFORCED_PLATE, SlimefunItems.LAVA_GENERATOR_2, SlimefunItems.REINFORCED_PLATE
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
	      
	      this.registerRecipe(20, new ItemStack[]{new ItemStack(Material.DIRT, 1), new ItemStack(Material.OAK_LEAVES, 3)}, new ItemStack[]{new ItemStack(Material.GRASS_BLOCK, 1)});
	      this.registerRecipe(20, new ItemStack[]{new ItemStack(Material.DIRT, 1), new ItemStack(Material.BIRCH_LEAVES, 3)}, new ItemStack[]{new ItemStack(Material.GRASS_BLOCK, 1)});
	      this.registerRecipe(20, new ItemStack[]{new ItemStack(Material.DIRT, 1), new ItemStack(Material.SPRUCE_LEAVES, 3)}, new ItemStack[]{new ItemStack(Material.PODZOL, 1)});
	      this.registerRecipe(20, new ItemStack[]{new ItemStack(Material.DIRT, 1), new ItemStack(Material.JUNGLE_LEAVES, 3)}, new ItemStack[]{new ItemStack(Material.GRASS_BLOCK, 1)});
	      this.registerRecipe(20, new ItemStack[]{new ItemStack(Material.DIRT, 1), new ItemStack(Material.ACACIA_LEAVES, 3)}, new ItemStack[]{new ItemStack(Material.GRASS_BLOCK, 1)});
	      this.registerRecipe(20, new ItemStack[]{new ItemStack(Material.DIRT, 1), new ItemStack(Material.DARK_OAK_LEAVES, 3)}, new ItemStack[]{new ItemStack(Material.GRASS_BLOCK, 1)});
	      
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
	      
	      this.recipeList.add(new ItemStack(Material.BARRIER, 1));
	      this.recipeList.add(new ItemStack(Material.BARRIER, 1));
	      
	      this.recipeList.add(new ItemStack(Material.DIRT, 1));
	      this.recipeList.add(new ItemStack(Material.GRASS_BLOCK, 1));
	      this.recipeList.add(new ItemStack(Material.OAK_LEAVES, 3));
	      this.recipeList.add(new ItemStack(Material.GRASS_BLOCK, 1));
	      
	      this.recipeList.add(new ItemStack(Material.DIRT, 1));
	      this.recipeList.add(new ItemStack(Material.GRASS_BLOCK, 1));
	      this.recipeList.add(new ItemStack(Material.BIRCH_LEAVES, 3));
	      this.recipeList.add(new ItemStack(Material.GRASS_BLOCK, 1));
	      
	      this.recipeList.add(new ItemStack(Material.DIRT, 1));
	      this.recipeList.add(new ItemStack(Material.PODZOL, 1));
	      this.recipeList.add(new ItemStack(Material.SPRUCE_LEAVES, 3));
	      this.recipeList.add(new ItemStack(Material.PODZOL, 1));
	      
	      this.recipeList.add(new ItemStack(Material.DIRT, 1));
	      this.recipeList.add(new ItemStack(Material.GRASS_BLOCK, 1));
	      this.recipeList.add(new ItemStack(Material.JUNGLE_LEAVES, 3));
	      this.recipeList.add(new ItemStack(Material.GRASS_BLOCK, 1));
	      
	      this.recipeList.add(new ItemStack(Material.DIRT, 1));
	      this.recipeList.add(new ItemStack(Material.GRASS_BLOCK, 1));
	      this.recipeList.add(new ItemStack(Material.ACACIA_LEAVES, 3));
	      this.recipeList.add(new ItemStack(Material.GRASS_BLOCK, 1));
	      
	      this.recipeList.add(new ItemStack(Material.DIRT, 1));
	      this.recipeList.add(new ItemStack(Material.GRASS_BLOCK, 1));
	      this.recipeList.add(new ItemStack(Material.DARK_OAK_LEAVES, 3));
	      this.recipeList.add(new ItemStack(Material.GRASS_BLOCK, 1));
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "DIRT_CREATOR_2";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 12;
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
	        return "&6Dirt Creator &7- &eII";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}