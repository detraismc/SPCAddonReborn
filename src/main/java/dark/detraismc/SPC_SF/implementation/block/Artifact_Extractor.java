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

public class Artifact_Extractor extends AContainer implements RecipeDisplayItem {

    private List<ItemStack> recipeList;

   public Artifact_Extractor() {
       super(SPCItems.category_machine, SPCItems.ARTIFACT_EXTRACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
               SPCItems.ARTIFACT_CIRCUIT_BOARD, SPCItems.ARTIFACT_SCANNER_2, SPCItems.ARTIFACT_CIRCUIT_BOARD,
                SPCItems.ARTIFACT_PICKAXE, SPCItems.NATUR_AL_SALASTUS, SPCItems.ARTIFACT_PICKAXE,
                SPCItems.DUST_EXTRACTOR, SPCItems.ARTIFACT_REACTOR, SPCItems.URANIUM_EXTRACTOR
	    });
   }

    protected void registerDefaultRecipes() {
        this.registerRecipe(25, new ItemStack[]{new ItemStack(Material.END_STONE, 8)},
                new ItemStack[] {SPCItems.UNIDENTIFIED_ARTIFACT});
        this.recipeList = new ArrayList<ItemStack>();
        this.recipeList.add(new ItemStack(Material.END_STONE, 8));
        this.recipeList.add(SPCItems.UNIDENTIFIED_ARTIFACT);
    }

    @Override
    public String getMachineIdentifier() {
        return "ARTIFACT_EXTRACTOR";
    }

    @Override
    public int getEnergyConsumption() {
        return 2000;
    }

    @Override
    public int getCapacity() {
        return 80000;
    }

    @Override
    public ItemStack getProgressBar() {
        return SPCItems.ARTIFACT_PICKAXE;
    }

    @Override
    public String getInventoryTitle() {
        return "&cArtifact Extractor";
    }

    public List<ItemStack> getDisplayRecipes() {
        return this.recipeList;
    }

}

