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

public class Turtle_Scute_Printer extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;

	   public Turtle_Scute_Printer() {
	        super(SPCItems.category_machine, SPCItems.TURTLE_SCUTE_PRINTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SlimefunItems.STEEL_PLATE, SlimefunItems.STEEL_PLATE, SlimefunItems.STEEL_PLATE,
		    		SlimefunItems.STEEL_PLATE, new ItemStack(Material.SEAGRASS), SlimefunItems.STEEL_PLATE,
		    		SlimefunItems.VANILLA_AUTO_CRAFTER, SlimefunItems.VANILLA_AUTO_CRAFTER, SlimefunItems.VANILLA_AUTO_CRAFTER
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(10, new ItemStack[]{new ItemStack(Material.SEAGRASS, 16)}, new ItemStack[]{new ItemStack(Material.TURTLE_SCUTE)});
          this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(new ItemStack(Material.SEAGRASS, 16));
	      this.recipeList.add(new ItemStack(Material.TURTLE_SCUTE));
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "TURTLE_SCUTE_PRINTER";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 20;
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
	        return "&aTurtle Scute Printer";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}