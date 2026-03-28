package dark.detraismc.SPC_SF.implementation.block;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Ore_Polisher extends AContainer implements RecipeDisplayItem {
	private List<ItemStack> recipeList;

	   public Ore_Polisher() {
	        super(SPCItems.category_machine, SPCItems.ORE_POLISHER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                    SPCItems.CORRUPTED_DIAMOND, SPCItems.CORRUPTED_ELITE_INGOT, SPCItems.CORRUPTED_EMERALD,
                    SPCItems.CORRUPTED_ELITE_INGOT, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SPCItems.CORRUPTED_ELITE_INGOT,
		    		SlimefunItems.STEEL_PLATE, SlimefunItems.CARBONADO_EDGED_FURNACE, SlimefunItems.STEEL_PLATE
		    });
	    }

	   protected void registerDefaultRecipes() {
	      this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.DEEPSLATE_COAL_ORE, 1)}, new ItemStack[]{new ItemStack(Material.COAL_ORE)});
           this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.DEEPSLATE_COPPER_ORE, 1)}, new ItemStack[]{new ItemStack(Material.COPPER_ORE)});
           this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.DEEPSLATE_IRON_ORE, 1)}, new ItemStack[]{new ItemStack(Material.IRON_ORE)});
           this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.DEEPSLATE_GOLD_ORE, 1)}, new ItemStack[]{new ItemStack(Material.GOLD_ORE)});
           this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.DEEPSLATE_REDSTONE_ORE, 1)}, new ItemStack[]{new ItemStack(Material.REDSTONE_ORE)});
           this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.DEEPSLATE_LAPIS_ORE, 1)}, new ItemStack[]{new ItemStack(Material.LAPIS_ORE)});
           this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.DEEPSLATE_EMERALD_ORE, 1)}, new ItemStack[]{new ItemStack(Material.EMERALD_ORE)});
           this.registerRecipe(5, new ItemStack[]{new ItemStack(Material.DEEPSLATE_DIAMOND_ORE, 1)}, new ItemStack[]{new ItemStack(Material.DIAMOND_ORE)});
	      this.recipeList = new ArrayList<ItemStack>();
	      this.recipeList.add(new ItemStack(Material.DEEPSLATE_COAL_ORE, 1));
	      this.recipeList.add(new ItemStack(Material.COAL_ORE));
	      this.recipeList.add(new ItemStack(Material.DEEPSLATE_COPPER_ORE, 1));
	      this.recipeList.add(new ItemStack(Material.COPPER_ORE));
	      this.recipeList.add(new ItemStack(Material.DEEPSLATE_IRON_ORE, 1));
	      this.recipeList.add(new ItemStack(Material.IRON_ORE));
	      this.recipeList.add(new ItemStack(Material.DEEPSLATE_GOLD_ORE, 1));
	      this.recipeList.add(new ItemStack(Material.GOLD_ORE));
	      this.recipeList.add(new ItemStack(Material.DEEPSLATE_REDSTONE_ORE, 1));
	      this.recipeList.add(new ItemStack(Material.REDSTONE_ORE));
	      this.recipeList.add(new ItemStack(Material.DEEPSLATE_LAPIS_ORE, 1));
	      this.recipeList.add(new ItemStack(Material.LAPIS_ORE));
           this.recipeList.add(new ItemStack(Material.DEEPSLATE_EMERALD_ORE, 1));
           this.recipeList.add(new ItemStack(Material.EMERALD_ORE));
           this.recipeList.add(new ItemStack(Material.DEEPSLATE_DIAMOND_ORE, 1));
           this.recipeList.add(new ItemStack(Material.DIAMOND_ORE));
	   }

	   @Override
	   public String getMachineIdentifier() {
	      return "ORE_POLISHER";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 32;
	    }

	    @Override
	    public int getCapacity() {
	        return 1024;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.IRON_PICKAXE);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&bOre Polisher";
	    }
	    
	    public List<ItemStack> getDisplayRecipes() {
	        return this.recipeList;
	     }
	}