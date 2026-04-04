package dark.detraismc.SPC_SF.implementation.block;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;

public class Uncorrupted_Table extends AContainer implements RecipeDisplayItem {
	
	private List<ItemStack> recipeList;
	private List<ItemStack> recipess;
	
	   public Uncorrupted_Table() {
	        super(SPCItems.category_machine, SPCItems.UNCORRUPTED_TABLE, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	        		new ItemStack(Material.NETHER_STAR), SlimefunItems.BLISTERING_INGOT_3, new ItemStack(Material.NETHER_STAR),
		    		SlimefunItems.BLISTERING_INGOT_3, new ItemStack(Material.GRINDSTONE), SlimefunItems.BLISTERING_INGOT_3,
		    		new ItemStack(Material.NETHER_STAR), SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.NETHER_STAR)
		    });
	    }
	   
	   protected void registerDefaultRecipes() {
	        recipeList = new ArrayList<>();
	        recipess = new ArrayList<>();
	        recipeList.add(new ItemStack(Material.COAL, 64));
	        recipeList.add(SPCItems.CORRUPTED_COAL);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_COAL, 64));
	        recipeList.add(SPCItems.CORRUPTED_COAL_2);
	        
	        recipeList.add(new ItemStack(Material.DIAMOND, 64));
	        recipeList.add(SPCItems.CORRUPTED_DIAMOND);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_DIAMOND, 64));
	        recipeList.add(SPCItems.CORRUPTED_DIAMOND_2);
	        
	        recipeList.add(new ItemStack(Material.EMERALD, 64));
	        recipeList.add(SPCItems.CORRUPTED_EMERALD);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_EMERALD, 64));
	        recipeList.add(SPCItems.CORRUPTED_EMERALD_2);
	        
	        recipeList.add(new ItemStack(Material.IRON_INGOT, 64));
	        recipeList.add(SPCItems.CORRUPTED_IRON_INGOT);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_IRON_INGOT, 64));
	        recipeList.add(SPCItems.CORRUPTED_IRON_INGOT_2);
	        
	        recipeList.add(new ItemStack(Material.GOLD_INGOT, 64));
	        recipeList.add(SPCItems.CORRUPTED_GOLD_INGOT);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_GOLD_INGOT, 64));
	        recipeList.add(SPCItems.CORRUPTED_GOLD_INGOT_2);
	        
	        recipeList.add(new ItemStack(Material.REDSTONE, 64));
	        recipeList.add(SPCItems.CORRUPTED_REDSTONE_DUST);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_REDSTONE_DUST, 64));
	        recipeList.add(SPCItems.CORRUPTED_REDSTONE_DUST_2);
	        
	        recipeList.add(new ItemStack(Material.LAPIS_LAZULI, 64));
	        recipeList.add(SPCItems.CORRUPTED_LAPIS_LAZULI);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_LAPIS_LAZULI, 64));
	        recipeList.add(SPCItems.CORRUPTED_LAPIS_LAZULI_2);
	        
	        recipeList.add(new ItemStack(Material.NETHERITE_INGOT, 64));
	        recipeList.add(SPCItems.CORRUPTED_NETHERITE_INGOT);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_NETHERITE_INGOT, 64));
	        recipeList.add(SPCItems.CORRUPTED_NETHERITE_INGOT_2);
	        
	        recipeList.add(new SlimefunItemStack(SPCItems.ENDERITE_INGOT, 64));
	        recipeList.add(SPCItems.CORRUPTED_ENDERITE_INGOT);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_ENDERITE_INGOT, 64));
	        recipeList.add(SPCItems.CORRUPTED_ENDERITE_INGOT_2);
	        
	        recipeList.add(new ItemStack(Material.ROTTEN_FLESH, 64));
	        recipeList.add(SPCItems.CORRUPTED_ROTTEN_FLESH);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_ROTTEN_FLESH, 64));
	        recipeList.add(SPCItems.CORRUPTED_ROTTEN_FLESH_2);
	        
	        recipeList.add(new ItemStack(Material.BONE, 64));
	        recipeList.add(SPCItems.CORRUPTED_BONE);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_BONE, 64));
	        recipeList.add(SPCItems.CORRUPTED_BONE_2);
	        
	        recipeList.add(new ItemStack(Material.SPIDER_EYE, 64));
	        recipeList.add(SPCItems.CORRUPTED_SPIDER_EYE);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_SPIDER_EYE, 64));
	        recipeList.add(SPCItems.CORRUPTED_SPIDER_EYE_2);
	        
	        recipeList.add(new ItemStack(Material.GUNPOWDER, 64));
	        recipeList.add(SPCItems.CORRUPTED_GUNPOWDER);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_GUNPOWDER, 64));
	        recipeList.add(SPCItems.CORRUPTED_GUNPOWDER_2);
	        
	        recipeList.add(new ItemStack(Material.MAGMA_CREAM, 64));
	        recipeList.add(SPCItems.CORRUPTED_MAGMA_CREAM);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_MAGMA_CREAM, 64));
	        recipeList.add(SPCItems.CORRUPTED_MAGMA_CREAM_2);
	        
	        recipeList.add(new ItemStack(Material.ENDER_EYE, 64));
	        recipeList.add(SPCItems.CORRUPTED_ENDER_EYE);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_ENDER_EYE, 64));
	        recipeList.add(SPCItems.CORRUPTED_ENDER_EYE_2);
	        
	        recipeList.add(new SlimefunItemStack(SPCItems.ELITE_INGOT, 64));
	        recipeList.add(SPCItems.CORRUPTED_ELITE_INGOT);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_ELITE_INGOT, 64));
	        recipeList.add(SPCItems.CORRUPTED_ELITE_INGOT_2);

           recipeList.add(new SlimefunItemStack(SlimefunItems.REACTOR_COOLANT_CELL, 64));
           recipeList.add(SPCItems.CORRUPTED_REACTOR_COOLANT_CELL);
           recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_REACTOR_COOLANT_CELL, 64));
           recipeList.add(SPCItems.CORRUPTED_REACTOR_COOLANT_CELL_2);

           recipeList.add(new SlimefunItemStack(SPCItems.NATURE_ARTIFACT, 64));
           recipeList.add(SPCItems.CORRUPTED_NATURE_ARTIFACT);
           recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_NATURE_ARTIFACT, 64));
           recipeList.add(SPCItems.CORRUPTED_NATURE_ARTIFACT_2);

           recipeList.add(new SlimefunItemStack(SPCItems.TECH_ARTIFACT, 64));
           recipeList.add(SPCItems.CORRUPTED_TECH_ARTIFACT);
           recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_TECH_ARTIFACT, 64));
           recipeList.add(SPCItems.CORRUPTED_TECH_ARTIFACT_2);

           recipeList.add(new SlimefunItemStack(SPCItems.ANCIENT_ARTIFACT, 64));
           recipeList.add(SPCItems.CORRUPTED_ANCIENT_ARTIFACT);
           recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_ANCIENT_ARTIFACT, 64));
           recipeList.add(SPCItems.CORRUPTED_ANCIENT_ARTIFACT_2);

           // Copper
           recipeList.add(new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 64));
           recipeList.add(SPCItems.CORRUPTED_COPPER_INGOT);
           recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_COPPER_INGOT, 64));
           recipeList.add(SPCItems.CORRUPTED_COPPER_INGOT_2);

           // Tin
           recipeList.add(new SlimefunItemStack(SlimefunItems.TIN_INGOT, 64));
           recipeList.add(SPCItems.CORRUPTED_TIN_INGOT);
           recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_TIN_INGOT, 64));
           recipeList.add(SPCItems.CORRUPTED_TIN_INGOT_2);

           // Zinc
           recipeList.add(new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 64));
           recipeList.add(SPCItems.CORRUPTED_ZINC_INGOT);
           recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_ZINC_INGOT, 64));
           recipeList.add(SPCItems.CORRUPTED_ZINC_INGOT_2);

           // Lead
           recipeList.add(new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 64));
           recipeList.add(SPCItems.CORRUPTED_LEAD_INGOT);
           recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_LEAD_INGOT, 64));
           recipeList.add(SPCItems.CORRUPTED_LEAD_INGOT_2);

           // Aluminum
           recipeList.add(new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 64));
           recipeList.add(SPCItems.CORRUPTED_ALUMINUM_INGOT);
           recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_ALUMINUM_INGOT, 64));
           recipeList.add(SPCItems.CORRUPTED_ALUMINUM_INGOT_2);

           // Magnesium
           recipeList.add(new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 64));
           recipeList.add(SPCItems.CORRUPTED_MAGNESIUM_INGOT);
           recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_MAGNESIUM_INGOT, 64));
           recipeList.add(SPCItems.CORRUPTED_MAGNESIUM_INGOT_2);

           // Silver
           recipeList.add(new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 64));
           recipeList.add(SPCItems.CORRUPTED_SILVER_INGOT);
           recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_SILVER_INGOT, 64));
           recipeList.add(SPCItems.CORRUPTED_SILVER_INGOT_2);
	        
	        recipeList.add(new ItemStack(Material.NETHER_STAR, 64));
	        recipeList.add(SPCItems.CORRUPTED_NETHER_STAR);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_NETHER_STAR, 64));
	        recipeList.add(SPCItems.CORRUPTED_NETHER_STAR_2);
	        
	        recipeList.add(new ItemStack(Material.OAK_LOG, 64));
	        recipeList.add(SPCItems.CORRUPTED_OAK_LOG);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_OAK_LOG, 64));
	        recipeList.add(SPCItems.CORRUPTED_OAK_LOG_2);
	        
	        recipeList.add(new ItemStack(Material.BIRCH_LOG, 64));
	        recipeList.add(SPCItems.CORRUPTED_BIRCH_LOG);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_BIRCH_LOG, 64));
	        recipeList.add(SPCItems.CORRUPTED_BIRCH_LOG_2);
	        
	        recipeList.add(new ItemStack(Material.SPRUCE_LOG, 64));
	        recipeList.add(SPCItems.CORRUPTED_SPRUCE_LOG);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_SPRUCE_LOG, 64));
	        recipeList.add(SPCItems.CORRUPTED_SPRUCE_LOG_2);
	        
	        recipeList.add(new ItemStack(Material.JUNGLE_LOG, 64));
	        recipeList.add(SPCItems.CORRUPTED_JUNGLE_LOG);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_JUNGLE_LOG, 64));
	        recipeList.add(SPCItems.CORRUPTED_JUNGLE_LOG_2);
	        
	        recipeList.add(new ItemStack(Material.ACACIA_LOG, 64));
	        recipeList.add(SPCItems.CORRUPTED_ACACIA_LOG);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_ACACIA_LOG, 64));
	        recipeList.add(SPCItems.CORRUPTED_ACACIA_LOG_2);
	        
	        recipeList.add(new ItemStack(Material.DARK_OAK_LOG, 64));
	        recipeList.add(SPCItems.CORRUPTED_DARK_OAK_LOG);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_DARK_OAK_LOG, 64));
	        recipeList.add(SPCItems.CORRUPTED_DARK_OAK_LOG_2);
	        
	        recipeList.add(new ItemStack(Material.CRIMSON_STEM, 64));
	        recipeList.add(SPCItems.CORRUPTED_CRIMSON_STEM);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_CRIMSON_STEM, 64));
	        recipeList.add(SPCItems.CORRUPTED_CRIMSON_STEM_2);
	        
	        recipeList.add(new ItemStack(Material.WARPED_STEM, 64));
	        recipeList.add(SPCItems.CORRUPTED_WARPED_STEM);
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_WARPED_STEM, 64));
	        recipeList.add(SPCItems.CORRUPTED_WARPED_STEM_2);

	        // Now convert them to machine recipes
	        for (int i = 0; i < recipeList.size(); i += 2) {
	            registerRecipe(10, recipeList.get(i + 1), recipeList.get(i));
	        }
	        
	        recipess = recipeList;
	        recipeList = new ArrayList<>();
	        
	        for (int i = 0; i < recipeList.size(); i += 2) {
	        	recipeList.add(recipess.get(i + 1));
	        	recipeList.add(recipess.get(i));
	        }
	        
		   }

	   @Override
	   public String getMachineIdentifier() {
	      return "UNCORRUPTED_TABLE";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 250;
	    }

	    @Override
	    public int getCapacity() {
	        return 5000;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.YELLOW_DYE);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&eUncorrupted Table";
	    }
	    
	}