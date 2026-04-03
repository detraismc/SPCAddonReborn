package dark.detraismc.SPC_SF.implementation.block;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Void_Altar extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;

	   public Void_Altar() {
	        super(SPCItems.category_machine, SPCItems.VOID_ALTAR, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	        		SPCItems.ARTIFACT_CIRCUIT_BOARD, SPCItems.CORRUPTED_ROTTEN_FLESH_2, SPCItems.ARTIFACT_CIRCUIT_BOARD,
	        		SPCItems.CORRUPTED_ROTTEN_FLESH_2, SPCItems.ENDER_ALTAR, SPCItems.CORRUPTED_ROTTEN_FLESH_2,
		    		SPCItems.ENDERITE_PLATE, SlimefunItems.AUTO_DISENCHANTER_2, SPCItems.ENDERITE_PLATE
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(30, new ItemStack[]{SPCItems.SUSPICIOUS_LOOKING_PEARL}, new ItemStack[] {SPCItems.VOID_ESSENCE});
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(SPCItems.SUSPICIOUS_LOOKING_PEARL);
	      this.recipeList.add(SPCItems.VOID_ESSENCE);
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "VOID_ALTAR";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 3000;
	    }

	    @Override
	    public int getCapacity() {
	        return 36000;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.OBSIDIAN);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&5Void Altar";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}
