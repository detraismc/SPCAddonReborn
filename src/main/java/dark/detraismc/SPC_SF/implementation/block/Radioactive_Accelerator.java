package dark.detraismc.SPC_SF.implementation.block;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Radioactive_Accelerator extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;

	   public Radioactive_Accelerator() {
	        super(SPCItems.category_machine, SPCItems.RADIOACTIVE_ACCELERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                    SlimefunItems.CARGO_INPUT_NODE, SlimefunItems.REACTOR_ACCESS_PORT, SlimefunItems.CARGO_OUTPUT_NODE,
                    SlimefunItems.FREEZER_2, SlimefunItems.NUCLEAR_REACTOR, SlimefunItems.FREEZER_2,
                    SlimefunItems.NUCLEAR_REACTOR, SlimefunItems.TREE_GROWTH_ACCELERATOR, SlimefunItems.NUCLEAR_REACTOR
		    });
	    }

    @Override
    protected void registerDefaultRecipes() {
        this.registerRecipe(120, new ItemStack[]{SlimefunItems.URANIUM}, new ItemStack[] {SlimefunItems.PLUTONIUM});
        this.recipeList = new ArrayList<ItemStack>();
        this.recipeList.add(SlimefunItems.URANIUM);
        this.recipeList.add(SlimefunItems.PLUTONIUM);
    }

	   @Override
	   public String getMachineIdentifier() {
	      return "RADIOACTIVE_ACCELERATOR";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 25;
	    }

	    @Override
	    public int getCapacity() {
	        return 1024;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new SlimefunItemStack(SlimefunItems.PLUTONIUM, 1);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&2Uranium Extractor";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}