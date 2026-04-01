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

public class Corrupted_Table_2 extends AContainer implements RecipeDisplayItem {
	
	private List<ItemStack> recipeList;
	
	   public Corrupted_Table_2() {
	        super(SPCItems.category_machine, SPCItems.CORRUPTED_TABLE_2, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
	        		SPCItems.NETHERITE_PLATE, SPCItems.ENDERITE_PLATE, SPCItems.NETHERITE_PLATE,
		    		SPCItems.CORRUPTED_EMERALD, SPCItems.CORRUPTED_TABLE, SPCItems.CORRUPTED_EMERALD,
		    		SPCItems.NETHERITE_PLATE, SlimefunItems.ELECTRIC_MOTOR, SPCItems.NETHERITE_PLATE
		    });
	    }
	   
	   protected void registerDefaultRecipes() {
	        recipeList = new ArrayList<>();
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
	        
	        recipeList.add(new SlimefunItemStack(SlimefunItems.GOLD_4K, 64));
	        recipeList.add(SPCItems.CORRUPTED_GOLD_INGOT);
	        recipeList.add(new SlimefunItemStack(SlimefunItems.GOLD_24K, 64));
	        recipeList.add(new SlimefunItemStack(SPCItems.CORRUPTED_GOLD_INGOT, 11));
	        
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
	            registerRecipe(10, recipeList.get(i), recipeList.get(i + 1));
	        }
		   }

	   @Override
	   public String getMachineIdentifier() {
	      return "CORRUPTED_TABLE_2";
	   }
	   
	   @Override
	    public int getEnergyConsumption() {
	        return 250;
	    }

	    @Override
	    public int getCapacity() {
	        return 50000;
	    }

	    @Override
	    public ItemStack getProgressBar() {
	        return new ItemStack(Material.PURPLE_DYE);
	    }

	    @Override
	    public String getInventoryTitle() {
	        return "&5Corrupted Table &7- &eII";
	    }
	    
	}