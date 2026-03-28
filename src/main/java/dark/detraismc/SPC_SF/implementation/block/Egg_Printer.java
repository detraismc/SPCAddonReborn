package dark.detraismc.SPC_SF.implementation.block;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Egg_Printer extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;

	   public Egg_Printer() {
	        super(SPCItems.category_machine, SPCItems.EGG_PRINTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT,
		    		SlimefunItems.STEEL_INGOT, new ItemStack(Material.EGG), SlimefunItems.STEEL_INGOT,
		    		SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.VANILLA_AUTO_CRAFTER, SlimefunItems.ELECTRIC_MOTOR
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(10, new ItemStack[]{new ItemStack(Material.WHEAT_SEEDS, 5)}, new ItemStack[]{new ItemStack(Material.EGG, 5)});
           this.registerRecipe(10, new ItemStack[]{new ItemStack(Material.BEETROOT_SEEDS, 5)}, new ItemStack[]{new ItemStack(Material.EGG, 5)});
           this.registerRecipe(10, new ItemStack[]{new ItemStack(Material.MELON_SEEDS, 5)}, new ItemStack[]{new ItemStack(Material.BLUE_EGG, 5)});
           this.registerRecipe(10, new ItemStack[]{new ItemStack(Material.PUMPKIN_SEEDS, 5)}, new ItemStack[]{new ItemStack(Material.BROWN_EGG, 5)});
          this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(new ItemStack(Material.WHEAT_SEEDS, 5));
	      this.recipeList.add(new ItemStack(Material.EGG, 5));
           this.recipeList.add(new ItemStack(Material.BEETROOT_SEEDS, 5));
           this.recipeList.add(new ItemStack(Material.EGG, 5));
           this.recipeList.add(new ItemStack(Material.MELON_SEEDS, 5));
           this.recipeList.add(new ItemStack(Material.BLUE_EGG, 5));
           this.recipeList.add(new ItemStack(Material.PUMPKIN_SEEDS, 5));
           this.recipeList.add(new ItemStack(Material.BROWN_EGG, 5));
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "EGG_PRINTER";
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
	        return new ItemStack(Material.CRAFTING_TABLE, 1);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&aEgg Printer";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}