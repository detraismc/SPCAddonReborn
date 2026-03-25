package dark.detraismc.SPC_SF.implementation.block;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;

public class Ender_Altar_2 extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Ender_Altar_2() {
	        super(SPCItems.category_machine, SPCItems.ENDER_ALTAR_2, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	        		SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.PROFESSIONAL_CIRCUIT_BOARD,
	        		SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.ENDER_ALTAR, SPCItems.PROFESSIONAL_CIRCUIT_BOARD,
		    		SPCItems.ENDERITE_PLATE, SPCItems.CORRUPTED_DIAMOND_2, SPCItems.ENDERITE_PLATE
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(30, new ItemStack[]{SPCItems.ENDER_ORB}, new ItemStack[] {SPCItems.ENDER_DRAGON_SCALES});
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(SPCItems.ENDER_ORB);
	      this.recipeList.add(SPCItems.ENDER_DRAGON_SCALES);
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "ENDER_ALTAR_2";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 800;
	    }

	    @Override
	    public int getCapacity() {
	        return 128000;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.PURPLE_DYE);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&5Ender Altar &7- &eII";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}
