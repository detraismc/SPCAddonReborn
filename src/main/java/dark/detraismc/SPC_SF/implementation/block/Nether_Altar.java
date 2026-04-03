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

public class Nether_Altar extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Nether_Altar() {
	        super(SPCItems.category_machine, SPCItems.NETHER_ALTAR, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	        		SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.CORRUPTED_COAL_2, SPCItems.PROFESSIONAL_CIRCUIT_BOARD,
	        		SPCItems.CORRUPTED_COAL_2, SlimefunItems.WITHER_ASSEMBLER, SPCItems.CORRUPTED_COAL_2,
		    		SPCItems.NETHERITE_PLATE, SlimefunItems.AUTO_ENCHANTER_2, SPCItems.NETHERITE_PLATE
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(30, new ItemStack[]{SPCItems.NETHER_ORB}, new ItemStack[]{new ItemStack(Material.NETHER_STAR)});
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(SPCItems.NETHER_ORB);
	      this.recipeList.add(new ItemStack(Material.NETHER_STAR));
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "NETHER_ALTAR";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 800;
	    }

	    @Override
	    public int getCapacity() {
	        return 12000;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.NETHER_STAR);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&6Nether Altar";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}