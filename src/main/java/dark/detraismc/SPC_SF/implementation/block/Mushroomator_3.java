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

public class Mushroomator_3 extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	   
	   public Mushroomator_3() {
	        super(SPCItems.category_machine, SPCItems.MUSHROOMATOR_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SlimefunItems.ESSENCE_OF_AFTERLIFE, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.ESSENCE_OF_AFTERLIFE,
	        		SlimefunItems.BLISTERING_INGOT_3, SPCItems.MUSHROOMATOR_2, SlimefunItems.BLISTERING_INGOT_3,
		    		SPCItems.NETHERITE_PLATE, SPCItems.ENDERITE_INGOT, SPCItems.NETHERITE_PLATE
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.DIRT, 8)}, new ItemStack[]{new ItemStack(Material.RED_MUSHROOM)});
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.SAND, 8)}, new ItemStack[]{new ItemStack(Material.BROWN_MUSHROOM)});
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.NETHERRACK, 8)}, new ItemStack[]{new ItemStack(Material.CRIMSON_FUNGUS)});
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.SOUL_SAND, 8)}, new ItemStack[]{new ItemStack(Material.WARPED_FUNGUS)});
	      this.registerRecipe(10, new ItemStack[]{new ItemStack(Material.BROWN_MUSHROOM, 32)}, new ItemStack[]{new ItemStack(Material.MYCELIUM)});
	      this.registerRecipe(10, new ItemStack[]{new ItemStack(Material.RED_MUSHROOM, 32)}, new ItemStack[]{new ItemStack(Material.MYCELIUM)});
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(new ItemStack(Material.DIRT, 8));
	      this.recipeList.add(new ItemStack(Material.RED_MUSHROOM));
	      this.recipeList.add(new ItemStack(Material.SAND, 8));
	      this.recipeList.add(new ItemStack(Material.BROWN_MUSHROOM));
	      this.recipeList.add(new ItemStack(Material.NETHERRACK, 8));
	      this.recipeList.add(new ItemStack(Material.CRIMSON_FUNGUS));
	      this.recipeList.add(new ItemStack(Material.SOUL_SAND, 8));
	      this.recipeList.add(new ItemStack(Material.WARPED_FUNGUS));
	      this.recipeList.add(new ItemStack(Material.BROWN_MUSHROOM, 32));
	      this.recipeList.add(new ItemStack(Material.MYCELIUM));
	      this.recipeList.add(new ItemStack(Material.RED_MUSHROOM, 32));
	      this.recipeList.add(new ItemStack(Material.MYCELIUM));
	      
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "MUSHROOMATOR_3";
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
	        return new ItemStack(Material.GOLDEN_SHOVEL);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&6Mushroomator &7- &eIII";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}