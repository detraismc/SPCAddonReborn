package dark.detraismc.SPC_SF.implementation.block;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Void_Altar_2 extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;

	   public Void_Altar_2() {
	        super(SPCItems.category_machine, SPCItems.VOID_ALTAR_2, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	        		SPCItems.ARTIFACT_CIRCUIT_BOARD, SPCItems.FUSION_ARTIFACT, SPCItems.ARTIFACT_CIRCUIT_BOARD,
	        		SPCItems.VOID_PLATE, SPCItems.VOID_ALTAR, SPCItems.VOID_PLATE,
		    		SPCItems.FUSION_ARTIFACT, SPCItems.FUSION_ARTIFACT, SPCItems.FUSION_ARTIFACT
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
	      return "VOID_ALTAR_2";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 3000;
	    }

	    @Override
	    public int getCapacity() {
	        return 96000;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.OBSIDIAN);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&5Void Altar &7- &eII";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}
