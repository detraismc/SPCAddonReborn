package dark.detraismc.SPC_SF.implementation.block;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dark.detraismc.SPC_SF.SPCAddon;
import dark.detraismc.SPC_SF.SPCItems;

public class Artifact_Scanner extends AContainer implements RecipeDisplayItem {
	
	SPCAddon plugin = SPCAddon.getInstance();

   public Artifact_Scanner() {
       super(SPCItems.category_machine, SPCItems.ARTIFACT_SCANNER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
       		SPCItems.PROFESSIONAL_CIRCUIT_BOARD, SPCItems.CORRUPTED_SPIDER_EYE_2, SPCItems.PROFESSIONAL_CIRCUIT_BOARD,
       		SPCItems.CORRUPTED_SPIDER_EYE_2, SlimefunItems.GPS_GEO_SCANNER, SPCItems.CORRUPTED_SPIDER_EYE_2,
	    		SPCItems.ENDERITE_PLATE, SlimefunItems.ENERGIZED_CAPACITOR, SPCItems.ENDERITE_PLATE
	    });
   }

   public List<ItemStack> getDisplayRecipes() {
      List<ItemStack> recipes = new ArrayList<ItemStack>();
      recipes.add(SPCItems.UNIDENTIFIED_ARTIFACT);
      recipes.add(new ItemStack(SPCItems.BASIC_ARTIFACT));
      recipes.add(SPCItems.UNIDENTIFIED_ARTIFACT);
      recipes.add(new ItemStack(SPCItems.NATURE_ARTIFACT));
      recipes.add(SPCItems.UNIDENTIFIED_ARTIFACT);
      recipes.add(new ItemStack(SPCItems.TECH_ARTIFACT));
      recipes.add(SPCItems.UNIDENTIFIED_ARTIFACT);
      recipes.add(new ItemStack(SPCItems.ANCIENT_ARTIFACT));
      return recipes;
   }

   public ItemStack getProgressBar() {
      return new ItemStack(Material.SNOWBALL);
   }

   protected MachineRecipe findNextRecipe(BlockMenu menu) {
      if (!this.hasFreeSlot(menu)) {
         return null;
      } else {
         int[] var2 = this.getInputSlots();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            int slot = var2[var4];
            @SuppressWarnings("deprecation")
			ItemStack item = menu.getItemInSlot(slot);
            ItemStack output = null;
            MachineRecipe recipe;
            if (SlimefunUtils.isItemSimilar(item, SPCItems.UNIDENTIFIED_ARTIFACT, true, false)) {
            	if (plugin.mtk.getChance(30, 100)) {
            		int randos = plugin.mtk.getRandomNumber(1, 4);
                	if (randos == 1) {
                		output = SPCItems.ANCIENT_ARTIFACT;
                	} else if (randos == 2) {
                		output = SPCItems.NATURE_ARTIFACT;
                	} else if (randos == 3) {
                		output = SPCItems.TECH_ARTIFACT;
                	} else {
                		output = SPCItems.BASIC_ARTIFACT;
                	}
            	} else {
            		output = SPCItems.BASIC_ARTIFACT;
            	}
               recipe = new MachineRecipe(30 / this.getSpeed(), new ItemStack[]{SPCItems.UNIDENTIFIED_ARTIFACT}, new ItemStack[]{output});
               if (output.getType() != Material.AIR && menu.fits(output, this.getOutputSlots())) {
                  menu.consumeItem(slot);
                  return recipe;
               }
            }
         }

         return null;
      }
   }

   @SuppressWarnings("deprecation")
private boolean hasFreeSlot(@Nonnull BlockMenu menu) {
      int[] var2 = this.getOutputSlots();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int slot = var2[var4];
         if (menu.getItemInSlot(slot) == null) {
            return true;
         }
      }

      return false;
   }

   public String getMachineIdentifier() {
      return "ARTIFACT_SCANNER";
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
   public String getInventoryTitle() {
       return "&1Artifact Scanner";
   }
}

