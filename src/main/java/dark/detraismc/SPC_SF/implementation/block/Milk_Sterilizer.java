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

public class Milk_Sterilizer extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;

	   public Milk_Sterilizer() {
	        super(SPCItems.category_machine, SPCItems.MILK_STERILIZER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SlimefunItems.REINFORCED_PLATE, SlimefunItems.FLUID_PUMP, SlimefunItems.REINFORCED_PLATE,
		    		SlimefunItems.REINFORCED_PLATE, SlimefunItems.ELECTRIC_FURNACE_3, SlimefunItems.REINFORCED_PLATE,
		    		SlimefunItems.CARBONADO_EDGED_FURNACE, SlimefunItems.VANILLA_AUTO_CRAFTER, SlimefunItems.CARBONADO_EDGED_FURNACE
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(3, new ItemStack[]{new ItemStack(Material.MILK_BUCKET, 1)}, new ItemStack[]{SPCItems.FRESH_MILK, new ItemStack(Material.BUCKET, 1)});
          this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(new ItemStack(Material.MILK_BUCKET, 1));
	      this.recipeList.add(SPCItems.FRESH_MILK);
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "MILK_STERILIZER";
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
	        return new ItemStack(Material.BLAZE_POWDER, 1);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&fMilk Sterilizer";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}