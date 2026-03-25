package dark.detraismc.SPC_SF;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.researches.Research;

final class ResearchSetup {
   static final ResearchSetup INSTANCE = new ResearchSetup();
   private boolean initialised;

   private ResearchSetup() {
   }

   public void init() {
      if (!this.initialised) {
         this.initialised = true;
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "spc_food"), 8212278, "SPC Food", 20)).addItems(new ItemStack[]{SPCItems.INDONESIAN_INGREDIENT_LOOTBAG}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "club_harom"), 8212279, "Club Harom", 15)).addItems(new ItemStack[]{SPCItems.VODKA}).addItems(new ItemStack[]{SPCItems.BEER}).addItems(new ItemStack[]{SPCItems.RED_WINE}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "laut_itu_asin"), 8212280, "Laut itu asin", 30)).addItems(new ItemStack[]{SPCItems.ATLANTIC_DUST}).addItems(new ItemStack[]{SPCItems.ATLANTIC_INGOT}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "kaum_elit"), 8212281, "Kaum Elit", 28)).addItems(new ItemStack[]{SPCItems.ELITE_GENERATOR}).addItems(new ItemStack[]{SPCItems.ELITE_INGOT}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "ender_power"), 8212282, "Ender Power", 60)).addItems(new ItemStack[]{SPCItems.ENDERITE_DUST}).addItems(new ItemStack[]{SPCItems.ENDER_DEBRIS}).addItems(new ItemStack[]{SPCItems.ENDERITE_INGOT}).addItems(new ItemStack[]{SPCItems.ENDERITE_SWORD}).addItems(new ItemStack[]{SPCItems.ENDERITE_HELMET}).addItems(new ItemStack[]{SPCItems.ENDERITE_CHESTPLATE}).addItems(new ItemStack[]{SPCItems.ENDERITE_LEGGINGS}).addItems(new ItemStack[]{SPCItems.ENDERITE_BOOTS}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "upgraded_backpack"), 8212283, "Upgraded Backpack", 30)).addItems(new ItemStack[]{SPCItems.DIAMOND_BACKPACK}).addItems(new ItemStack[]{SPCItems.SAPPHIRE_BACKPACK}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "iron_man_backpack"), 8212284, "Iron Man Backpack", 35)).addItems(new ItemStack[]{SPCItems.REINFORCED_IRON_BACKPACK}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "god_backpack"), 8212285, "God Backpack", 40)).addItems(new ItemStack[]{SPCItems.ULTIMATE_BACKPACK}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "ender_power_2"), 8212286, "Ender Power 2", 62)).addItems(new ItemStack[]{SPCItems.ENDERITE_PICKAXE})
         .addItems(new ItemStack[]{SPCItems.ENDERITE_AXE}).addItems(new ItemStack[]{SPCItems.ENDERITE_SHOVEL}).addItems(new ItemStack[]{SPCItems.ENDERITE_HOE}).addItems(new ItemStack[]{SPCItems.ENDERITE_PLATE}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "dwarf_technology"), 8212287, "Dwarf Technology", 40)).addItems(new ItemStack[]{SPCItems.DRILL_HEAD}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "obsidian_destroyer"), 8212288, "Obsidian Destroyer", 45)).addItems(new ItemStack[]{SPCItems.OBSIDIAN_DRILL}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "diggy_diggy_hole"), 8212289, "Diggy Diggy Hole", 45)).addItems(new ItemStack[]{SPCItems.STONE_DRILL}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "jamur_kadas_kurap"), 8212291, "Jamur, kadas, kurap", 40)).addItems(new ItemStack[]{SPCItems.MUSHROOMATOR}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "jamur_kadas_kurap_2"), 8212292, "Jamur, kadas, kurap 2", 45)).addItems(new ItemStack[]{SPCItems.MUSHROOMATOR_2}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "jamur_kadas_kurap_3"), 8212293, "Jamur, kadas, kurap 3", 50)).addItems(new ItemStack[]{SPCItems.MUSHROOMATOR_3}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "bau_tanah"), 8212294, "Bau Tanah", 30)).addItems(new ItemStack[]{SPCItems.DIRT_CREATOR}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "bau_tanah_2"), 8212295, "Bau Tanah 2", 35)).addItems(new ItemStack[]{SPCItems.DIRT_CREATOR_2}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "bau_tanah_3"), 8212296, "Bau Tanah 3", 40)).addItems(new ItemStack[]{SPCItems.DIRT_CREATOR_3}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "korupsi"), 8212297, "Korupsi", 50)).addItems(new ItemStack[]{SPCItems.CORRUPTED_TABLE}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "master_korupsi"), 8212298, "Master Korupsi", 60)).addItems(new ItemStack[]{SPCItems.CORRUPTED_TABLE_2}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "kpk"), 8212299, "KPK", 50)).addItems(new ItemStack[]{SPCItems.UNCORRUPTED_TABLE}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "master_kpk"), 8212300, "Master KPK", 60)).addItems(new ItemStack[]{SPCItems.UNCORRUPTED_TABLE_2}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "ender_ritual"), 8212301, "Ender Ritual", 65)).addItems(new ItemStack[]{SPCItems.ENDER_ALTAR}).addItems(new ItemStack[]{SPCItems.ENDER_ORB}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "nether_ritual"), 8212302, "Nether Ritual", 65)).addItems(new ItemStack[]{SPCItems.NETHER_ALTAR}).addItems(new ItemStack[]{SPCItems.NETHER_ORB}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "ender_ritual_2"), 8212303, "Ender Ritual 2", 70)).addItems(new ItemStack[]{SPCItems.ENDER_ALTAR_2}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "nether_ritual_2"), 8212304, "Nether Ritual 2", 70)).addItems(new ItemStack[]{SPCItems.NETHER_ALTAR_2}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "the_strongest_fairy"), 8212305, "The Strongest Fairy", 20)).addItems(new ItemStack[]{SPCItems.CIRNO}).addItems(new ItemStack[]{SPCItems.CIRNO_2}).addItems(new ItemStack[]{SPCItems.CIRNO_2_2}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "imperial_age"), 8212306, "Imperial Age", 65)).addItems(new ItemStack[]{SPCItems.STEEL_CYLINDER}).addItems(new ItemStack[]{SPCItems.FOLDED_STEEL_PLATE})
         .addItems(new ItemStack[]{SPCItems.WOOD_RESIN}).addItems(new ItemStack[]{SPCItems.MUSKET_HANDLE}).addItems(new ItemStack[]{SPCItems.MUSKET_MECHANISM}).addItems(new ItemStack[]{SPCItems.MUSKET}).addItems(new ItemStack[]{SPCItems.MUSKET_BALL}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "professional_circuit_board"), 8212307, "Professional Circuit Board", 50)).addItems(new ItemStack[]{SPCItems.PROFESSIONAL_CIRCUIT_BOARD}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "wibu_lu"), 8212308, "Wibu Lu", 65)).addItems(new ItemStack[]{SPCItems.KATANA}).addItems(new ItemStack[]{SPCItems.WEEB_INGOT}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "raja_akhirat"), 8212309, "Raja Akhirat", 70)).addItems(new ItemStack[]{SPCItems.VOID_ESSENCE}).addItems(new ItemStack[]{SPCItems.SUSPICIOUS_LOOKING_PEARL}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "void_power"), 8212310, "Void Power", 65)).addItems(new ItemStack[]{SPCItems.VOID_DUST}).addItems(new ItemStack[]{SPCItems.VOID_INGOT}).addItems(new ItemStack[]{SPCItems.VOID_PLATE}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "pedang_kehampaan"), 8212311, "Pedang Kehampaan", 70)).addItems(new ItemStack[]{SPCItems.VOID_BLADE}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "void_obsidian_destroyer"), 8212312, "Void Obsidian Destroyer", 70)).addItems(new ItemStack[]{SPCItems.VOID_OBSIDIAN_DRILL}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "void_diggy_diggy_hole"), 82122313, "Void Diggy Diggy Hole", 70)).addItems(new ItemStack[]{SPCItems.VOID_STONE_DRILL}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "oh_cincin"), 82122314, "Oh Cincin", 30)).addItems(new ItemStack[]{SPCItems.GOLD_RING}).addItems(new ItemStack[]{SPCItems.SILVER_RING}).addItems(new ItemStack[]{SPCItems.GOLD_RING_24K}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "oh_cincin_2"), 82122315, "Oh Cincin 2", 40)).addItems(new ItemStack[]{SPCItems.NETHERITE_RING}).addItems(new ItemStack[]{SPCItems.ENDERITE_RING}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "batu_akik"), 82122316, "Batu Akik", 34)).addItems(new ItemStack[]{SPCItems.OBSIDIAN_GEM}).addItems(new ItemStack[]{SPCItems.GUARDIAN_GEM}).addItems(new ItemStack[]{SPCItems.DRAGON_GEM}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "batu_akik_2"), 82122317, "Batu Akik 2", 44)).addItems(new ItemStack[]{SPCItems.VOID_GEM}).addItems(new ItemStack[]{SPCItems.VAMPIRE_GEM}).addItems(new ItemStack[]{SPCItems.FROST_GEM}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "mandarin"), 82122318, "Mandarin", 40)).addItems(new ItemStack[]{SPCItems.DIAMOND_RING}).addItems(new ItemStack[]{SPCItems.SAPPHIRE_RING}).addItems(new ItemStack[]{SPCItems.NETHER_RING}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "mandarin_2"), 82122319, "Mandarin 2", 50)).addItems(new ItemStack[]{SPCItems.OBSIDIAN_RING}).addItems(new ItemStack[]{SPCItems.DRAGON_RING}).addItems(new ItemStack[]{SPCItems.GUARDIAN_RING}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "mandarin_3"), 82122320, "Mandarin 3", 60)).addItems(new ItemStack[]{SPCItems.VOID_RING}).addItems(new ItemStack[]{SPCItems.VAMPIRE_RING}).addItems(new ItemStack[]{SPCItems.FROST_RING}).register();
         
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "artifact_hunting"), 82122321, "Artifact Hunting", 70)).addItems(new ItemStack[]{SPCItems.ARTIFACT_PICKAXE}).addItems(new ItemStack[]{SPCItems.UNIDENTIFIED_ARTIFACT}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "artifact_scanning"), 82122322, "Artifact Scanning", 75)).addItems(new ItemStack[]{SPCItems.ARTIFACT_SCANNER}).addItems(new ItemStack[]{SPCItems.BASIC_ARTIFACT}).addItems(new ItemStack[]{SPCItems.NATURE_ARTIFACT})
         .addItems(new ItemStack[]{SPCItems.TECH_ARTIFACT}).addItems(new ItemStack[]{SPCItems.ANCIENT_ARTIFACT}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "artifact_scanning_2"), 82122323, "Artifact Scanning 2", 80)).addItems(new ItemStack[]{SPCItems.ARTIFACT_SCANNER_2}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "artifact_crafting"), 82122324, "Artifact Crafting", 80)).addItems(new ItemStack[]{SPCItems.BIFURCATING_COMPONENT}).addItems(new ItemStack[]{SPCItems.ARTIFACT_CIRCUIT_BOARD}).addItems(new ItemStack[]{SPCItems.ARTIFACT_POWER_CORE})
         .addItems(new ItemStack[]{SPCItems.ANCIENT_COMPONENT}).addItems(new ItemStack[]{SPCItems.NATURE_COMPONENT}).addItems(new ItemStack[]{SPCItems.TECH_COMPONENT}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "paralyse_gun"), 82122325, "Paralyse Gun", 70)).addItems(new ItemStack[]{SPCItems.TASER}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "professional_have_standard"), 82122326, "Professional Have Standard", 80)).addItems(new ItemStack[]{SPCItems.SNIPER_RIFLE}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "crazed_gunman"), 82122327, "Crazed Gunman", 80)).addItems(new ItemStack[]{SPCItems.ASSAULT_RIFLE}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "shooting_star"), 82122328, "Shooting Star", 85)).addItems(new ItemStack[]{SPCItems.MONOCHROME_SHOOTER}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "pulu_pulu"), 82122329, "Pulu_Pulu", 70)).addItems(new ItemStack[]{SPCItems.BLOWPIPE}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "sharp_grass"), 82122330, "Sharp Grass", 80)).addItems(new ItemStack[]{SPCItems.BLADE_OF_GRASS}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "hand_of_gold"), 82122331, "Hand Of Gold", 80)).addItems(new ItemStack[]{SPCItems.MIDAS_BLADE}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "rage_of_natura"), 82122332, "Rage Of Natura", 85)).addItems(new ItemStack[]{SPCItems.NATUR_AL_SALASTUS}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "ancient_ring"), 82122333, "Ancient Ring", 80)).addItems(new ItemStack[]{SPCItems.ANCIENT_RING}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "lost_in_time"), 82122334, "Lost In Time", 90)).addItems(new ItemStack[]{SPCItems.ANCIENT_BOOTS}).addItems(new ItemStack[]{SPCItems.ANCIENT_LEGGINGS}).addItems(new ItemStack[]{SPCItems.ANCIENT_CHESTPLATE}).addItems(new ItemStack[]{SPCItems.ANCIENT_HELMET}).register();
         
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "tanah_airku_subur"), 82122335, "Tanah Airku Subur", 50)).addItems(new ItemStack[]{SPCItems.FERTILE_SOIL}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "pabrik_pertanian"), 82122336, "Pabrik Pertanian", 55)).addItems(new ItemStack[]{SPCItems.ARTIFICIAL_HARVESTER}).addItems(new ItemStack[]{SPCItems.ARTIFICIAL_SOIL}).addItems(new ItemStack[]{SPCItems.CROPS_MOTOR})
         .addItems(new ItemStack[]{SPCItems.ZINC_ARTIFICIAL_SEEDS}).addItems(new ItemStack[]{SPCItems.MAGNESIUM_ARTIFICIAL_SEEDS}).register();
         
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "automatic_ritual"), 82122337, "Automatic Ritual", 100)).addItems(new ItemStack[]{SPCItems.AUTO_ANCIENT_ALTAR}).addItems(new ItemStack[]{SPCItems.ADVANCED_ANCIENT_PEDESTAL}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "automatic_magic_craft"), 82122338, "Automatic Magic Craft", 60)).addItems(new ItemStack[]{SPCItems.AUTO_MAGIC_WORKBENCH}).register();
         
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "kaum_elit_2"), 82122339, "Kaum Elit 2", 40)).addItems(new ItemStack[]{SPCItems.ELITE_GENERATOR_2}).addItems(new ItemStack[]{SPCItems.ELITE_GENERATOR_3}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "nether_ecosystem"), 82122340, "Nether Ecosystem", 45)).addItems(new ItemStack[]{SPCItems.ELECTRIFIED_NETHER_COMPOSTER}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "nether_ecosystem_2"), 82122341, "Nether Ecosystem 2", 50)).addItems(new ItemStack[]{SPCItems.ELECTRIFIED_NETHER_COMPOSTER_2}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "nether_ecosystem_3"), 82122342, "Nether Ecosystem 3", 55)).addItems(new ItemStack[]{SPCItems.ELECTRIFIED_NETHER_COMPOSTER_3}).register();
         
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "machine_ritual"), 8212343, "Machine Ritual", 60)).addItems(new ItemStack[]{SPCItems.IRON_ALTAR}).addItems(new ItemStack[]{SPCItems.IRON_ORB}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "machine_ritual_2"), 8212344, "Machine Ritual 2", 65)).addItems(new ItemStack[]{SPCItems.IRON_ALTAR_2}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "material_from_demon"), 8212345, "Material From Demon", 66)).addItems(new ItemStack[]{SPCItems.INFERNAL_ALLOY_INGOT}).addItems(new ItemStack[]{SPCItems.INFERNAL_ALLOY_PLATE}).register();
         
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "alloy_recycle"), 8212346, "Alloy Recycle", 60)).addItems(new ItemStack[]{SPCItems.ELECTRIC_SALVAGER}).addItems(new ItemStack[]{SPCItems.ELECTRIC_SALVAGER_2}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "alloy_press"), 8212346, "Alloy Press", 50)).addItems(new ItemStack[]{SPCItems.ALLOY_PRESS}).addItems(new ItemStack[]{SPCItems.ALLOY_PRESS_2}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "helth"), 8212347, "helth", 20)).addItems(new ItemStack[]{SPCItems.HEALING_CORE}).addItems(new ItemStack[]{SPCItems.HEALING_HERB})
         .addItems(new ItemStack[]{SPCItems.HEALING_FRUIT}).addItems(new ItemStack[]{SPCItems.HEALING_TICKET}).addItems(new ItemStack[]{SPCItems.MINI_HOSPITAL})
         .addItems(new ItemStack[]{SPCItems.HEALTH_POTION}).addItems(new ItemStack[]{SPCItems.HEALTH_POTION_2}).addItems(new ItemStack[]{SPCItems.HEALTH_POTION_3})
         .addItems(new ItemStack[]{SPCItems.HEALTH_POTION_4}).addItems(new ItemStack[]{SPCItems.CURE_ALL}).addItems(new ItemStack[]{SPCItems.HOLY_WATER}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "helth_2"), 8212348, "helth 2", 35)).addItems(new ItemStack[]{SPCItems.MINI_HOSPITAL_2}).register();
         (new Research(new NamespacedKey(SPCAddon.getInstance(), "helth_3"), 8212349, "helth 3", 45)).addItems(new ItemStack[]{SPCItems.MINI_HOSPITAL_3}).register();
         
         
      }
   }
}
