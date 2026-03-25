package dark.detraismc.SPC_SF;

import io.github.thebusybiscuit.exoticgarden.items.ExoticGardenFruit;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

import org.bukkit.inventory.ItemStack;

public class SPC_Food extends ExoticGardenFruit {
   private final int food;

   public SPC_Food(ItemGroup category, SlimefunItemStack item, RecipeType recipe_type, ItemStack[] recipe, int food) {
      super(category, item, recipe_type, true, recipe);
      this.food = food;
   }

   public SPC_Food(ItemGroup category, SlimefunItemStack item, RecipeType recipe_type, int amount, ItemStack[] recipe, int food) {
      super(category, item, recipe_type, true, recipe, new SlimefunItemStack(item, amount));
      this.food = food;
   }

   public int getFoodValue() {
      return this.food;
   }
}
