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

public class Electrified_Nether_Composter_2 extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Electrified_Nether_Composter_2() {
	        super(SPCItems.category_machine, SPCItems.ELECTRIFIED_NETHER_COMPOSTER_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
	        		SPCItems.WEEB_PLATE, SPCItems.ENDERITE_PLATE, SPCItems.WEEB_PLATE,
	        		SlimefunItems.HEATING_COIL, SPCItems.ELECTRIFIED_NETHER_COMPOSTER, SlimefunItems.HEATING_COIL,
	        		SlimefunItems.GILDED_IRON, SPCItems.DIRT_CREATOR_2, SlimefunItems.GILDED_IRON
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
	      return "ELECTRIFIED_NETHER_COMPOSTER_2";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 80;
	    }

	    @Override
	    public int getCapacity() {
	        return 2048;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.COMPOSTER);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&cElectrified Nether Composter &7- &eII";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}