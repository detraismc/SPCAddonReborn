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

public class Iron_Altar_2 extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Iron_Altar_2() {
	        super(SPCItems.category_machine, SPCItems.IRON_ALTAR_2, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	        		SPCItems.VOID_INGOT, SPCItems.INFERNAL_ALLOY_INGOT, SPCItems.ENDERITE_INGOT,
	        		SPCItems.CORRUPTED_JUNGLE_LOG_2, SPCItems.IRON_ALTAR, SPCItems.CORRUPTED_JUNGLE_LOG_2,
		    		SPCItems.ENDERITE_INGOT, SPCItems.INFERNAL_ALLOY_INGOT, SPCItems.VOID_INGOT
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(30, new ItemStack[]{SPCItems.IRON_ORB}, new ItemStack[] {SlimefunItems.BASIC_CIRCUIT_BOARD});
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(SPCItems.IRON_ORB);
	      this.recipeList.add(SlimefunItems.BASIC_CIRCUIT_BOARD);
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "IRON_ALTAR_2";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 400;
	    }

	    @Override
	    public int getCapacity() {
	        return 16000;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.ACTIVATOR_RAIL);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&fIron Altar &7- &eII";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}
