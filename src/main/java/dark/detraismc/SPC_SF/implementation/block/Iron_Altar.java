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

public class Iron_Altar extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;
	
	   public Iron_Altar() {
	        super(SPCItems.category_machine, SPCItems.IRON_ALTAR, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	        		SlimefunItems.GOLD_24K_BLOCK, SPCItems.CORRUPTED_IRON_INGOT_2, SlimefunItems.GOLD_24K_BLOCK,
	        		SPCItems.WEEB_PLATE, SlimefunItems.IRON_GOLEM_ASSEMBLER, SPCItems.SAPPHIRE_PLATE,
		    		SPCItems.NETHERITE_PLATE, SPCItems.CORRUPTED_ELITE_INGOT, SlimefunItems.REINFORCED_PLATE
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
	      return "IRON_ALTAR";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 400;
	    }

	    @Override
	    public int getCapacity() {
	        return 6000;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.ACTIVATOR_RAIL);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&fIron Altar";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}
