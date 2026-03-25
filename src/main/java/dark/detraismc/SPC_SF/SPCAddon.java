package dark.detraismc.SPC_SF;

import dark.detraismc.SPC_SF.utils.ItemsUtils;
import dark.detraismc.SPC_SF.utils.MathUtils;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;

import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

public class SPCAddon extends JavaPlugin implements SlimefunAddon {
   private static SPCAddon instance;
   public MathUtils mtk = new MathUtils();
   public ItemsUtils iutils = new ItemsUtils();
   public HashMap<String, String> cooldown_map;
   public HashMap<String, String> cooldown_map2;
   public HashMap<String, String> cooldown_map3;
   public HashMap<String, String> cooldownpot_map;
   public HashMap<String, String> cooldownpot_map2;
   public HashMap<String, String> natur_map;
   public HashMap<String, String> snipe_map;

   public void onEnable() {
      instance = this;
      ItemSetup.INSTANCE.init();
      ResearchSetup.INSTANCE.init();
      RecipeTypeSetup.INSTANCE.init();
      ListenerSetup.INSTANCE.init();
      cooldown_map = new HashMap<>();
      cooldown_map2 = new HashMap<>();
      cooldown_map3 = new HashMap<>();
      cooldownpot_map = new HashMap<>();
      cooldownpot_map2 = new HashMap<>();
      natur_map = new HashMap<>();
      snipe_map = new HashMap<>();
   }

   public void onDisable() {
   }

   public String getBugTrackerURL() {
      return null;
   }

   public JavaPlugin getJavaPlugin() {
      return this;
   }

   public static SPCAddon getInstance() {
      return instance;
   }
}
