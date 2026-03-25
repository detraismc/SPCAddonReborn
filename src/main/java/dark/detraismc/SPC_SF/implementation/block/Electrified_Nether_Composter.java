package dark.detraismc.SPC_SF.implementation.block;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;

public class Electrified_Nether_Composter extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Electrified_Nether_Composter() {
	        super(SPCItems.category_machine, SPCItems.ELECTRIFIED_NETHER_COMPOSTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.NETHERITE_PLATE, SPCItems.PROFESSIONAL_CIRCUIT_BOARD,
	        		SPCItems.NETHERITE_PLATE, SPCItems.ARTIFICIAL_CROPS_NETHER_WARTS_2, SPCItems.NETHERITE_PLATE,
		    		new ItemStack(Material.NETHER_STAR), SPCItems.DIRT_CREATOR, new ItemStack(Material.NETHER_STAR)
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(25, new ItemStack[]{new ItemStack(Material.STONE, 4)}, 
	    		  new ItemStack[]{new ItemStack(Material.NETHERRACK)});
	      this.registerRecipe(30, new ItemStack[]{new ItemStack(Material.SAND, 2)}, 
	    		  new ItemStack[]{new ItemStack(Material.SOUL_SAND)});
	      this.registerRecipe(35, new ItemStack[]{new ItemStack(Material.WHEAT, 4)}, 
	    		  new ItemStack[]{new ItemStack(Material.NETHER_WART)});
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(new ItemStack(Material.STONE, 4));
	      this.recipeList.add(new ItemStack(Material.NETHERRACK));
	      
	      this.recipeList.add(new ItemStack(Material.SAND, 2));
	      this.recipeList.add(new ItemStack(Material.SOUL_SAND));
	      
	      this.recipeList.add(new ItemStack(Material.WHEAT, 4));
	      this.recipeList.add(new ItemStack(Material.NETHER_WART));
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "ELECTRIFIED_NETHER_COMPOSTER";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 48;
	    }

	    @Override
	    public int getCapacity() {
	        return 1024;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.COMPOSTER);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&cElectrified Nether Composter";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}