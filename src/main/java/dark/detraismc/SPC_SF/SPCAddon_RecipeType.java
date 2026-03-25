package dark.detraismc.SPC_SF;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public final class SPCAddon_RecipeType {
   public static final RecipeType VENDING_MACHINE;
   public static final RecipeType ELITE_MOBS_DROP;
   public static final RecipeType DRAGON_DROP;
   public static final RecipeType CORRUPTED_TABLE;
   public static final RecipeType ENDER_KING_DROP;
   public static final RecipeType ARTIFACT;
   public static final RecipeType ARTIFACT_SCAN;
   public static final RecipeType MINI_HOSPITAL;

   static {
      VENDING_MACHINE = new RecipeType(new NamespacedKey(SPCAddon.getInstance(), "vending_machine"), new SlimefunItemStack("VENDING_MACHINE", Material.GLASS_BOTTLE, "&bVending Machine", new String[0]), new String[]{"", "&aThis item are from", "&avending machine"});
      ELITE_MOBS_DROP = new RecipeType(new NamespacedKey(SPCAddon.getInstance(), "elite_mobs_drop"), new SlimefunItemStack("ELITE_MOBS_DROP", Material.IRON_SWORD, "&eElite Mobs Drop", new String[0]), new String[]{"", "&aThis item are drop", "&afrom elite mobs"});
      DRAGON_DROP = new RecipeType(new NamespacedKey(SPCAddon.getInstance(), "dragon_drop"), new SlimefunItemStack("DRAGON_DROP", Material.IRON_SWORD, "&eEnder Dragon Drop", new String[0]), new String[]{"", "&aThis item are drop", "&afrom ender dragon"});
      CORRUPTED_TABLE = new RecipeType(new NamespacedKey(SPCAddon.getInstance(), "corrupted_table"), new SlimefunItemStack("CORRUPTED_TABLE", Material.PURPLE_GLAZED_TERRACOTTA, "&5Corrupted Table", new String[0]), new String[]{"", "&aThis item are craft", "&afrom corrupted table"});
      ENDER_KING_DROP = new RecipeType(new NamespacedKey(SPCAddon.getInstance(), "ender_king_drop"), new SlimefunItemStack("ENDER_KING_DROP", Material.ENDER_PEARL, "&5Ender King Drop", new String[0]), new String[]{"", "&aThis item are drop", "&afrom ender king"});
      ARTIFACT = new RecipeType(new NamespacedKey(SPCAddon.getInstance(), "artifact"), new SlimefunItemStack("ARTIFACT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmYyM2Q5MTAxYTI1ZTQ1N2M5MmJhOTE3MTUyMmMxOWNiZjczNDVmNzA3MjZiZGVhNWFhNGI5M2MyYTBiMzM2NyJ9fX0=", "&1Artifact Drop", new String[0]), new String[]{"", "&aThis item are drop", "&afrom Artifact Mobs.", "&aSummon artifact mobs by breaking", "&aendstone with artifact pickaxe."});
      ARTIFACT_SCAN = new RecipeType(new NamespacedKey(SPCAddon.getInstance(), "artifact_scan"), new SlimefunItemStack("ARTIFACT_SCAN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjc0NGFkYjAxYTkwZTQ2OTAyZDg4NTFiZWI3Y2RmZmQwODA3OTI5MDljZjQ0YmE0NmQzMzc0Yzg2MTVhOTI1OSJ9fX0=", "&1Artifact Scan", new String[0]), new String[]{"", "&aScan Unidentified Artifact", "&ausing Artifact Scanner to get this."});
      MINI_HOSPITAL = new RecipeType(new NamespacedKey(SPCAddon.getInstance(), "mini_hospital"), new SlimefunItemStack("MINI_HOSPITAL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFhNmE0MTFiODAyYjIyZTUzMjQ3OTVjZTM0ZTNjYWU0YTgzNzk2YTE4ZDkyMzMyNjY2Y2JmMjE0ODhjMCJ9fX0=", "&dMini Hospital", new String[0]), new String[]{"", "&aCraft using mini hospital", "&ato get this."});
      
   }

   private SPCAddon_RecipeType() {
   }
}
