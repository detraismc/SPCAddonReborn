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

public class Ender_Altar extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Ender_Altar() {
	        super(SPCItems.category_machine, SPCItems.ENDER_ALTAR, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	        		SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.CORRUPTED_ENDER_EYE_2, SPCItems.PROFESSIONAL_CIRCUIT_BOARD,
	        		SlimefunItems.ENDER_LUMP_3, SlimefunItems.ANCIENT_ALTAR, SlimefunItems.ENDER_LUMP_3,
		    		SPCItems.NETHERITE_PLATE, new ItemStack(Material.DRAGON_EGG), SPCItems.NETHERITE_PLATE
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
	      return "ENDER_ALTAR";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 800;
	    }

	    @Override
	    public int getCapacity() {
	        return 48000;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.PURPLE_DYE);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&5Ender Altar";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}
