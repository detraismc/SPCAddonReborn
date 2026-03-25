package dark.detraismc.SPC_SF.implementation.block;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;

public class Dirt_Creator_3 extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Dirt_Creator_3() {
	        super(SPCItems.category_machine, SPCItems.DIRT_CREATOR_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SPCItems.NETHERITE_PLATE, SPCItems.VOID_INGOT, SPCItems.NETHERITE_PLATE,
	        		SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.DIRT_CREATOR_2, SPCItems.PROFESSIONAL_CIRCUIT_BOARD,
		    		SPCItems.NETHERITE_PLATE, SPCItems.ENDERITE_INGOT, SPCItems.NETHERITE_PLATE
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
	      
	      this.registerRecipe(30, new ItemStack[]{new ItemStack(Material.NETHERRACK, 1), new ItemStack(Material.NETHER_WART_BLOCK, 3)}, new ItemStack[]{new ItemStack(Material.CRIMSON_NYLIUM, 1)});
	      this.registerRecipe(30, new ItemStack[]{new ItemStack(Material.NETHERRACK, 1), new ItemStack(Material.WARPED_WART_BLOCK, 3)}, new ItemStack[]{new ItemStack(Material.WARPED_NYLIUM, 1)});
	      
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
	      
	      this.recipeList.add(new ItemStack(Material.NETHERRACK, 1));
	      this.recipeList.add(new ItemStack(Material.CRIMSON_NYLIUM, 1));
	      this.recipeList.add(new ItemStack(Material.NETHER_WART_BLOCK, 3));
	      this.recipeList.add(new ItemStack(Material.CRIMSON_NYLIUM, 1));
	      
	      this.recipeList.add(new ItemStack(Material.NETHERRACK, 1));
	      this.recipeList.add(new ItemStack(Material.WARPED_NYLIUM, 1));
	      this.recipeList.add(new ItemStack(Material.WARPED_WART_BLOCK, 3));
	      this.recipeList.add(new ItemStack(Material.WARPED_NYLIUM, 1));
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "DIRT_CREATOR_3";
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
	        return "&6Dirt Creator &7- &eIII";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}
