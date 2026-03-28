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

public class Egg_Printer_2 extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;

	   public Egg_Printer_2() {
	        super(SPCItems.category_machine, SPCItems.EGG_PRINTER_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SlimefunItems.STEEL_PLATE, SlimefunItems.STEEL_PLATE, SlimefunItems.STEEL_PLATE,
		    		SlimefunItems.STEEL_PLATE, SPCItems.EGG_PRINTER, SlimefunItems.STEEL_PLATE,
                    SlimefunItems.VANILLA_AUTO_CRAFTER, SlimefunItems.VANILLA_AUTO_CRAFTER, SlimefunItems.VANILLA_AUTO_CRAFTER
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(10, new ItemStack[]{new ItemStack(Material.WHEAT_SEEDS, 5)}, new ItemStack[]{new ItemStack(Material.EGG, 16)});
           this.registerRecipe(10, new ItemStack[]{new ItemStack(Material.BEETROOT_SEEDS, 5)}, new ItemStack[]{new ItemStack(Material.EGG, 16)});
           this.registerRecipe(10, new ItemStack[]{new ItemStack(Material.MELON_SEEDS, 5)}, new ItemStack[]{new ItemStack(Material.BLUE_EGG, 16)});
           this.registerRecipe(10, new ItemStack[]{new ItemStack(Material.PUMPKIN_SEEDS, 5)}, new ItemStack[]{new ItemStack(Material.BROWN_EGG, 16)});
          this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(new ItemStack(Material.WHEAT_SEEDS, 5));
	      this.recipeList.add(new ItemStack(Material.EGG, 16));
           this.recipeList.add(new ItemStack(Material.BEETROOT_SEEDS, 5));
           this.recipeList.add(new ItemStack(Material.EGG, 16));
           this.recipeList.add(new ItemStack(Material.MELON_SEEDS, 5));
           this.recipeList.add(new ItemStack(Material.BLUE_EGG, 16));
           this.recipeList.add(new ItemStack(Material.PUMPKIN_SEEDS, 5));
           this.recipeList.add(new ItemStack(Material.BROWN_EGG, 16));
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "EGG_PRINTER_2";
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
	        return new ItemStack(Material.CRAFTING_TABLE, 1);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&aEgg Printer &7- &eII";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}