package dark.detraismc.SPC_SF;

import io.github.thebusybiscuit.exoticgarden.CustomPotion;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class SPCItems {
	public static NestedItemGroup spcaddon_category;
   public static ItemGroup category_ingredient;
   public static ItemGroup category_masak;
   public static ItemGroup category_tools;
   public static ItemGroup category_consumable;
   public static ItemGroup category_material;
   public static ItemGroup category_weapon;
   public static ItemGroup category_armor;
   public static ItemGroup category_machine;
   public static ItemGroup category_plant;
   public static ItemGroup category_skin;
   public static final SlimefunItemStack RICE;
   public static final SlimefunItemStack COFFEE_BEAN;
   public static final SlimefunItemStack CASSAVA;
   public static final SlimefunItemStack CHILI;
   public static final SlimefunItemStack PEANUT;
   public static final SlimefunItemStack DURIAN;
   public static final SlimefunItemStack MANGO;
   public static final SlimefunItemStack BANANA;
   public static final SlimefunItemStack SALAM_AND_SEREH;
   public static final SlimefunItemStack MSG;
   public static final SlimefunItemStack SOYBEAN;
   public static final SlimefunItemStack TOBACCO;
   public static final SlimefunItemStack BLACK_PEPPER_POWDER;
   public static final SlimefunItemStack TAPIOCA_FLOUR;
   public static final SlimefunItemStack BREAD_CRUMB;
   public static final SlimefunItemStack UNCOOK_NOODLE;
   public static final SlimefunItemStack CHOCOLATE_POWDER;
   public static final SlimefunItemStack COFFEE_POWDER;
   public static final SlimefunItemStack SOY_SAUCE;
   public static final SlimefunItemStack SWEET_SOY_SAUCE;
   public static final SlimefunItemStack GRATED_COCONUT;
   public static final SlimefunItemStack FRESH_MILK;
   public static final SlimefunItemStack CONDENSED_MILK;
   public static final SlimefunItemStack COMPRESSED_SEAGRASS;
   public static final SlimefunItemStack NORI;
   public static final SlimefunItemStack FERMENTED_WHEAT;
   public static final SlimefunItemStack FERMENTED_POTATO;
   public static final SlimefunItemStack FERMENTED_GRAPE;
   public static final SlimefunItemStack CHILI_POWDER;
   public static final SlimefunItemStack VODKA;
   public static final SlimefunItemStack BEER;
   public static final SlimefunItemStack RED_WINE;
   public static final SlimefunItemStack MANGO_JUICE;
   public static final SlimefunItemStack CRACKER;
   public static final SlimefunItemStack COFFEE;
   public static final SlimefunItemStack CAPPUCINO;
   public static final SlimefunItemStack CHICKEN_NOODLE;
   public static final SlimefunItemStack SPICY_CHICKEN_NOODLE;
   public static final SlimefunItemStack SPAGHETTI;
   public static final SlimefunItemStack BEEF_RENDANG;
   public static final SlimefunItemStack SUSHI;
   public static final SlimefunItemStack MILK_PIE;
   public static final SlimefunItemStack MILK_TEA;
   public static final SlimefunItemStack HOT_FRIED_CHICKEN;
   public static final SlimefunItemStack CHICKEN_KARAAGE;
   public static final SlimefunItemStack RINGO_AME;
   public static final SlimefunItemStack RAMEN;
   public static final SlimefunItemStack CILOK;
   public static final SlimefunItemStack BEEF_SKEWER;
   public static final SlimefunItemStack CHICKEN_SKEWER;
   public static final SlimefunItemStack MUTTON_SKEWER;
   public static final SlimefunItemStack DURIAN_ICE_CREAM;
   public static final SlimefunItemStack PEANUT_BUTTER_SANDWICH;
   public static final SlimefunItemStack FRIED_BANANA;
   public static final SlimefunItemStack BANANA_SPLIT_SUNDAE;
   public static final SlimefunItemStack EGG_FRIED_RICE;
   public static final SlimefunItemStack MUTTON_FRIED_RICE;
   public static final SlimefunItemStack COCA_COLA;
   public static final SlimefunItemStack SPRITE;
   public static final SlimefunItemStack FANTA;
   public static final SlimefunItemStack PEPSI;
   public static final SlimefunItemStack CIGARETTES;
   public static final SlimefunItemStack INDONESIAN_INGREDIENT_LOOTBAG;
   public static final SlimefunItemStack UNCHARGED_HEART_OF_THE_SEA;
   public static final SlimefunItemStack VENDING_MACHINE;
   public static final SlimefunItemStack ELITE_GENERATOR;
   public static final SlimefunItemStack ELITE_GENERATOR_2;
   public static final SlimefunItemStack ELITE_GENERATOR_3;
   public static final SlimefunItemStack ELITE_COIN;
   public static final SlimefunItemStack ELITE_INGOT;
   public static final SlimefunItemStack REINFORCED_LEATHER;
   public static final SlimefunItemStack REINFORCED_SHULKER_SHELL;
   public static final SlimefunItemStack ROPE;
   public static final SlimefunItemStack NETHER_RUNE;
   public static final SlimefunItemStack ATLANTIC_DUST;
   public static final SlimefunItemStack ATLANTIC_INGOT;
   public static final SlimefunItemStack ENDER_DEBRIS;
   public static final SlimefunItemStack ENDERITE_DUST;
   public static final SlimefunItemStack ENDERITE_INGOT;
   public static final SlimefunItemStack ENDER_DRAGON_SCALES;
   public static final SlimefunItemStack ENDER_HEART;
   public static final SlimefunItemStack GOLDEN_PLATE;
   public static final SlimefunItemStack DIAMOND_PLATE;
   public static final SlimefunItemStack SAPPHIRE_PLATE;
   public static final SlimefunItemStack NETHERITE_PLATE;
   public static final SlimefunItemStack ENDERITE_SWORD;
   public static final SlimefunItemStack ENDERITE_HELMET;
   public static final SlimefunItemStack ENDERITE_CHESTPLATE;
   public static final SlimefunItemStack ENDERITE_LEGGINGS;
   public static final SlimefunItemStack ENDERITE_BOOTS;
   public static final SlimefunItemStack GOLDEN_BACKPACK;
   public static final SlimefunItemStack DIAMOND_BACKPACK;
   public static final SlimefunItemStack SAPPHIRE_BACKPACK;
   public static final SlimefunItemStack REINFORCED_IRON_BACKPACK;
   public static final SlimefunItemStack ULTIMATE_BACKPACK;
   public static final SlimefunItemStack ENDERITE_PICKAXE;
   public static final SlimefunItemStack ENDERITE_AXE;
   public static final SlimefunItemStack ENDERITE_SHOVEL;
   public static final SlimefunItemStack ENDERITE_HOE;

   public static final SlimefunItemStack DRILL_HEAD;
   public static final SlimefunItemStack OBSIDIAN_DRILL;
   public static final SlimefunItemStack STONE_DRILL;

   public static final SlimefunItemStack MUSHROOMATOR;
   public static final SlimefunItemStack MUSHROOMATOR_2;
   public static final SlimefunItemStack MUSHROOMATOR_3;

   public static final SlimefunItemStack ENDERITE_PLATE;

   public static final SlimefunItemStack DIRT_CREATOR;
   public static final SlimefunItemStack DIRT_CREATOR_2;
   public static final SlimefunItemStack DIRT_CREATOR_3;

   public static final SlimefunItemStack CORRUPTED_TABLE;
   public static final SlimefunItemStack CORRUPTED_TABLE_2;

   public static final SlimefunItemStack UNCORRUPTED_TABLE;
   public static final SlimefunItemStack UNCORRUPTED_TABLE_2;

   public static final SlimefunItemStack CORRUPTED_COAL;
   public static final SlimefunItemStack CORRUPTED_DIAMOND;
   public static final SlimefunItemStack CORRUPTED_EMERALD;
   public static final SlimefunItemStack CORRUPTED_IRON_INGOT;
   public static final SlimefunItemStack CORRUPTED_GOLD_INGOT;
   public static final SlimefunItemStack CORRUPTED_REDSTONE_DUST;
   public static final SlimefunItemStack CORRUPTED_LAPIS_LAZULI;
   public static final SlimefunItemStack CORRUPTED_NETHERITE_INGOT;
   public static final SlimefunItemStack CORRUPTED_ENDERITE_INGOT;
   public static final SlimefunItemStack CORRUPTED_ELITE_INGOT;
    public static final SlimefunItemStack CORRUPTED_REACTOR_COOLANT_CELL;
    public static final SlimefunItemStack CORRUPTED_NATURE_ARTIFACT;
    public static final SlimefunItemStack CORRUPTED_TECH_ARTIFACT;
    public static final SlimefunItemStack CORRUPTED_ANCIENT_ARTIFACT;

   public static final SlimefunItemStack CORRUPTED_COAL_2;
   public static final SlimefunItemStack CORRUPTED_DIAMOND_2;
   public static final SlimefunItemStack CORRUPTED_EMERALD_2;
   public static final SlimefunItemStack CORRUPTED_IRON_INGOT_2;
   public static final SlimefunItemStack CORRUPTED_GOLD_INGOT_2;
   public static final SlimefunItemStack CORRUPTED_REDSTONE_DUST_2;
   public static final SlimefunItemStack CORRUPTED_LAPIS_LAZULI_2;
   public static final SlimefunItemStack CORRUPTED_NETHERITE_INGOT_2;
   public static final SlimefunItemStack CORRUPTED_ENDERITE_INGOT_2;
   public static final SlimefunItemStack CORRUPTED_ELITE_INGOT_2;
    public static final SlimefunItemStack CORRUPTED_REACTOR_COOLANT_CELL_2;
    public static final SlimefunItemStack CORRUPTED_NATURE_ARTIFACT_2;
    public static final SlimefunItemStack CORRUPTED_TECH_ARTIFACT_2;
    public static final SlimefunItemStack CORRUPTED_ANCIENT_ARTIFACT_2;

   public static final SlimefunItemStack CORRUPTED_ROTTEN_FLESH;
   public static final SlimefunItemStack CORRUPTED_BONE;
   public static final SlimefunItemStack CORRUPTED_SPIDER_EYE;
   public static final SlimefunItemStack CORRUPTED_GUNPOWDER;
   public static final SlimefunItemStack CORRUPTED_MAGMA_CREAM;
   public static final SlimefunItemStack CORRUPTED_ENDER_EYE;
   public static final SlimefunItemStack CORRUPTED_NETHER_STAR;

   public static final SlimefunItemStack CORRUPTED_ROTTEN_FLESH_2;
   public static final SlimefunItemStack CORRUPTED_BONE_2;
   public static final SlimefunItemStack CORRUPTED_SPIDER_EYE_2;
   public static final SlimefunItemStack CORRUPTED_GUNPOWDER_2;
   public static final SlimefunItemStack CORRUPTED_MAGMA_CREAM_2;
   public static final SlimefunItemStack CORRUPTED_ENDER_EYE_2;
   public static final SlimefunItemStack CORRUPTED_NETHER_STAR_2;

   public static final SlimefunItemStack CORRUPTED_OAK_LOG;
   public static final SlimefunItemStack CORRUPTED_BIRCH_LOG;
   public static final SlimefunItemStack CORRUPTED_SPRUCE_LOG;
   public static final SlimefunItemStack CORRUPTED_JUNGLE_LOG;
   public static final SlimefunItemStack CORRUPTED_ACACIA_LOG;
   public static final SlimefunItemStack CORRUPTED_DARK_OAK_LOG;
   public static final SlimefunItemStack CORRUPTED_CRIMSON_STEM;
   public static final SlimefunItemStack CORRUPTED_WARPED_STEM;

   public static final SlimefunItemStack CORRUPTED_OAK_LOG_2;
   public static final SlimefunItemStack CORRUPTED_BIRCH_LOG_2;
   public static final SlimefunItemStack CORRUPTED_SPRUCE_LOG_2;
   public static final SlimefunItemStack CORRUPTED_JUNGLE_LOG_2;
   public static final SlimefunItemStack CORRUPTED_ACACIA_LOG_2;
   public static final SlimefunItemStack CORRUPTED_DARK_OAK_LOG_2;
   public static final SlimefunItemStack CORRUPTED_CRIMSON_STEM_2;
   public static final SlimefunItemStack CORRUPTED_WARPED_STEM_2;

   public static final SlimefunItemStack NETHER_ORB;
   public static final SlimefunItemStack ENDER_ORB;
   public static final SlimefunItemStack IRON_ORB;
   public static final SlimefunItemStack PROFESSIONAL_CIRCUIT_BOARD;

   public static final SlimefunItemStack NETHER_ALTAR;
   public static final SlimefunItemStack NETHER_ALTAR_2;
   public static final SlimefunItemStack ENDER_ALTAR;
   public static final SlimefunItemStack ENDER_ALTAR_2;
   public static final SlimefunItemStack IRON_ALTAR;
   public static final SlimefunItemStack IRON_ALTAR_2;

   public static final SlimefunItemStack CIRNO;
   public static final SlimefunItemStack CIRNO_2;
   public static final SlimefunItemStack CIRNO_2_2;

   public static final SlimefunItemStack SHULKER_MIND;
   public static final SlimefunItemStack ULTIMATE_CORE;

   public static final SlimefunItemStack STEEL_CYLINDER;
   public static final SlimefunItemStack FOLDED_STEEL_PLATE;
   public static final SlimefunItemStack WEEB_INGOT;
   public static final SlimefunItemStack WOOD_RESIN;
   public static final SlimefunItemStack MUSKET_HANDLE;
   public static final SlimefunItemStack MUSKET_MECHANISM;
   public static final SlimefunItemStack MUSKET;
   public static final SlimefunItemStack MUSKET_BALL;
   public static final SlimefunItemStack KATANA;

   public static final SlimefunItemStack SUSPICIOUS_LOOKING_PEARL;
   public static final SlimefunItemStack VOID_ESSENCE;
   public static final SlimefunItemStack VOID_DUST;
   public static final SlimefunItemStack VOID_INGOT;
   public static final SlimefunItemStack VOID_BLADE;

   public static final SlimefunItemStack VOID_OBSIDIAN_DRILL;
   public static final SlimefunItemStack VOID_STONE_DRILL;

   public static final SlimefunItemStack VOID_SHIELD;

   public static final SlimefunItemStack GOLD_RING;
   public static final SlimefunItemStack SILVER_RING;
   public static final SlimefunItemStack GOLD_RING_24K;
   public static final SlimefunItemStack NETHERITE_RING;
   public static final SlimefunItemStack ENDERITE_RING;

   public static final SlimefunItemStack OBSIDIAN_GEM;
   public static final SlimefunItemStack DRAGON_GEM;
   public static final SlimefunItemStack GUARDIAN_GEM;
   public static final SlimefunItemStack VOID_GEM;
   public static final SlimefunItemStack VAMPIRE_GEM;
   public static final SlimefunItemStack FROST_GEM;

   public static final SlimefunItemStack DIAMOND_RING;
   public static final SlimefunItemStack SAPPHIRE_RING;
   public static final SlimefunItemStack NETHER_RING;
   public static final SlimefunItemStack OBSIDIAN_RING;
   public static final SlimefunItemStack DRAGON_RING;
   public static final SlimefunItemStack GUARDIAN_RING;
   public static final SlimefunItemStack VOID_RING;
   public static final SlimefunItemStack VAMPIRE_RING;
   public static final SlimefunItemStack FROST_RING;

   public static final SlimefunItemStack UNIDENTIFIED_ARTIFACT;
   public static final SlimefunItemStack BASIC_ARTIFACT;
   public static final SlimefunItemStack ANCIENT_ARTIFACT;
   public static final SlimefunItemStack NATURE_ARTIFACT;
   public static final SlimefunItemStack TECH_ARTIFACT;

   public static final SlimefunItemStack ARTIFACT_PICKAXE;

   public static final SlimefunItemStack ARTIFACT_SCANNER;
   public static final SlimefunItemStack ARTIFACT_SCANNER_2;

   public static final SlimefunItemStack TASER;
   public static final SlimefunItemStack SNIPER_RIFLE;
   public static final SlimefunItemStack ASSAULT_RIFLE;
   public static final SlimefunItemStack MONOCHROME_SHOOTER;

   public static final SlimefunItemStack BLOWPIPE;
   public static final SlimefunItemStack BLADE_OF_GRASS;
   public static final SlimefunItemStack MIDAS_BLADE;
   public static final SlimefunItemStack NATUR_AL_SALASTUS;

   public static final SlimefunItemStack ANCIENT_RING;
   public static final SlimefunItemStack ANCIENT_HELMET;
   public static final SlimefunItemStack ANCIENT_CHESTPLATE;
   public static final SlimefunItemStack ANCIENT_LEGGINGS;
   public static final SlimefunItemStack ANCIENT_BOOTS;

   public static final SlimefunItemStack VOID_PLATE;
   public static final SlimefunItemStack BIFURCATING_COMPONENT;
   public static final SlimefunItemStack ARTIFACT_CIRCUIT_BOARD;
   public static final SlimefunItemStack ARTIFACT_POWER_CORE;
   public static final SlimefunItemStack ANCIENT_COMPONENT;
   public static final SlimefunItemStack NATURE_COMPONENT;
   public static final SlimefunItemStack TECH_COMPONENT;

   public static final SlimefunItemStack FERTILE_SOIL;
   public static final SlimefunItemStack ARTIFICIAL_SOIL;
   public static final SlimefunItemStack ARTIFICIAL_HARVESTER;
   public static final SlimefunItemStack CROPS_MOTOR;



   public static final SlimefunItemStack ARTIFICIAL_TREE_OAK;
   public static final SlimefunItemStack ARTIFICIAL_TREE_BIRCH;
   public static final SlimefunItemStack ARTIFICIAL_TREE_SPRUCE;
   public static final SlimefunItemStack ARTIFICIAL_TREE_JUNGLE;
   public static final SlimefunItemStack ARTIFICIAL_TREE_ACACIA;
   public static final SlimefunItemStack ARTIFICIAL_TREE_DARK_OAK;
   public static final SlimefunItemStack ARTIFICIAL_TREE_CRIMSON;
   public static final SlimefunItemStack ARTIFICIAL_TREE_WARPED;
   public static final SlimefunItemStack ARTIFICIAL_TREE_APPLE;
    public static final SlimefunItemStack ARTIFICIAL_TREE_MANGROVE;
    public static final SlimefunItemStack ARTIFICIAL_TREE_CHERRY;
    public static final SlimefunItemStack ARTIFICIAL_TREE_PALE_OAK;

   public static final SlimefunItemStack ARTIFICIAL_TREE_OAK_2;
   public static final SlimefunItemStack ARTIFICIAL_TREE_BIRCH_2;
   public static final SlimefunItemStack ARTIFICIAL_TREE_SPRUCE_2;
   public static final SlimefunItemStack ARTIFICIAL_TREE_JUNGLE_2;
   public static final SlimefunItemStack ARTIFICIAL_TREE_ACACIA_2;
   public static final SlimefunItemStack ARTIFICIAL_TREE_DARK_OAK_2;
   public static final SlimefunItemStack ARTIFICIAL_TREE_CRIMSON_2;
   public static final SlimefunItemStack ARTIFICIAL_TREE_WARPED_2;
   public static final SlimefunItemStack ARTIFICIAL_TREE_APPLE_2;
    public static final SlimefunItemStack ARTIFICIAL_TREE_MANGROVE_2;
    public static final SlimefunItemStack ARTIFICIAL_TREE_CHERRY_2;
    public static final SlimefunItemStack ARTIFICIAL_TREE_PALE_OAK_2;


   public static final SlimefunItemStack ARTIFICIAL_CROPS_WHEAT;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_POTATO;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CARROT;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_BEETROOT;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_PUMPKIN;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_MELON;

   public static final SlimefunItemStack ARTIFICIAL_CROPS_WHEAT_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_POTATO_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CARROT_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_BEETROOT_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_PUMPKIN_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_MELON_2;


   public static final SlimefunItemStack ARTIFICIAL_CROPS_SWEET_BERRIES;
    public static final SlimefunItemStack ARTIFICIAL_CROPS_GLOW_BERRIES;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_KELP;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_BAMBOO;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_SUGAR_CANE;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CHORUS_FRUIT;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_NETHER_WARTS;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CACTUS;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_COCOA_BEANS;

   public static final SlimefunItemStack ARTIFICIAL_CROPS_SWEET_BERRIES_2;
    public static final SlimefunItemStack ARTIFICIAL_CROPS_GLOW_BERRIES_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_KELP_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_BAMBOO_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_SUGAR_CANE_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CHORUS_FRUIT_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_NETHER_WARTS_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CACTUS_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_COCOA_BEANS_2;


   public static final SlimefunItemStack ARTIFICIAL_CROPS_COAL;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_IRON;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_GOLD;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_COPPER;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_ALUMINUM;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_TIN;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_SILVER;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_LEAD;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_REDSTONE;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_LAPIS;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_ENDER;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_QUARTZ;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_DIAMOND;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_EMERALD;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_GLOWSTONE;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_OBSIDIAN;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_SLIME;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_MAGNESIUM;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_ZINC;

   public static final SlimefunItemStack ARTIFICIAL_CROPS_COAL_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_IRON_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_GOLD_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_COPPER_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_ALUMINUM_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_TIN_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_SILVER_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_LEAD_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_REDSTONE_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_LAPIS_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_ENDER_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_QUARTZ_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_DIAMOND_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_EMERALD_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_GLOWSTONE_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_OBSIDIAN_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_SLIME_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_MAGNESIUM_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_ZINC_2;

   public static final SlimefunItemStack ARTIFICIAL_CROPS_IRON_3;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_GOLD_3;



   public static final SlimefunItemStack ARTIFICIAL_CROPS_GRAPE;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_BLUEBERRY;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_ELDERBERRY;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_RASPBERRY;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_BLACKBERRY;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CRANBERRY;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_COWBERRY;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_STRAWBERRY;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_TOMATO;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_LETTUCE;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_TEA;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CABBAGE;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_SWEET_POTATO;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_MUSTARD;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CURRY;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_ONION;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_GARLIC;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CILANTRO;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_BLACK_PEPPER;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CORN;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_PINEAPPLE;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_RED_BELL_PEPPER;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_OAK_APPLE;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_COCONUT;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CHERRY;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_POMEGRANATE;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_LEMON;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_PLUM;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_LIME;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_ORANGE;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_PEACH;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_PEAR;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_DRAGON_FRUIT;

   public static final SlimefunItemStack ARTIFICIAL_CROPS_GRAPE_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_BLUEBERRY_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_ELDERBERRY_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_RASPBERRY_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_BLACKBERRY_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CRANBERRY_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_COWBERRY_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_STRAWBERRY_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_TOMATO_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_LETTUCE_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_TEA_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CABBAGE_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_SWEET_POTATO_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_MUSTARD_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CURRY_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_ONION_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_GARLIC_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CILANTRO_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_BLACK_PEPPER_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CORN_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_PINEAPPLE_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_RED_BELL_PEPPER_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_OAK_APPLE_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_COCONUT_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CHERRY_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_POMEGRANATE_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_LEMON_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_PLUM_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_LIME_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_ORANGE_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_PEACH_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_PEAR_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_DRAGON_FRUIT_2;


   public static final SlimefunItemStack ARTIFICIAL_CROPS_BANANA;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CASSAVA;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CHILI;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_COFFEE_BEAN;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_DURIAN;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_MANGO;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_MSG;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_PEANUT;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_RICE;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_SALAM_AND_SEREH;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_SOYBEAN;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_TOBACCO;

   public static final SlimefunItemStack ARTIFICIAL_CROPS_BANANA_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CASSAVA_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_CHILI_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_COFFEE_BEAN_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_DURIAN_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_MANGO_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_MSG_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_PEANUT_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_RICE_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_SALAM_AND_SEREH_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_SOYBEAN_2;
   public static final SlimefunItemStack ARTIFICIAL_CROPS_TOBACCO_2;


   public static final SlimefunItemStack AUTO_ANCIENT_ALTAR;
   public static final SlimefunItemStack ADVANCED_ANCIENT_PEDESTAL;
   public static final SlimefunItemStack ZINC_ARTIFICIAL_SEEDS;
   public static final SlimefunItemStack MAGNESIUM_ARTIFICIAL_SEEDS;

   public static final SlimefunItemStack AUTO_MAGIC_WORKBENCH;

   public static final SlimefunItemStack ELECTRIFIED_NETHER_COMPOSTER;
   public static final SlimefunItemStack ELECTRIFIED_NETHER_COMPOSTER_2;
   public static final SlimefunItemStack ELECTRIFIED_NETHER_COMPOSTER_3;

   public static final SlimefunItemStack WEEB_PLATE;
   public static final SlimefunItemStack INFERNAL_ALLOY_INGOT;
   public static final SlimefunItemStack INFERNAL_ALLOY_PLATE;

   public static final SlimefunItemStack ELECTRIC_SALVAGER;
   public static final SlimefunItemStack ELECTRIC_SALVAGER_2;

   public static final SlimefunItemStack ALLOY_PRESS;
   public static final SlimefunItemStack ALLOY_PRESS_2;

   public static final SlimefunItemStack MINI_HOSPITAL;
   public static final SlimefunItemStack MINI_HOSPITAL_2;
   public static final SlimefunItemStack MINI_HOSPITAL_3;

   public static final SlimefunItemStack HEALTH_POTION;
   public static final SlimefunItemStack HEALTH_POTION_2;
   public static final SlimefunItemStack HEALTH_POTION_3;
   public static final SlimefunItemStack HEALTH_POTION_4;

   public static final SlimefunItemStack HOLY_WATER;
   public static final SlimefunItemStack CURE_ALL;

   public static final SlimefunItemStack HEALING_HERB;
   public static final SlimefunItemStack HEALING_TICKET;
   public static final SlimefunItemStack HEALING_CORE;
   public static final SlimefunItemStack HEALING_FRUIT;

    public static final SlimefunItemStack ORE_POLISHER;
    public static final SlimefunItemStack TURTLE_SCUTE_PRINTER;
    public static final SlimefunItemStack EGG_PRINTER;
    public static final SlimefunItemStack EGG_PRINTER_2;
    public static final SlimefunItemStack MILK_STERILIZER;

    public static final SlimefunItemStack COMPACT_REACTOR;
    public static final SlimefunItemStack ICE_KING_COOLANT_CELL;

    public static final SlimefunItemStack DUST_EXTRACTOR;
    public static final SlimefunItemStack URANIUM_EXTRACTOR;

    public static final SlimefunItemStack ELITE_ARTIFACT;
    public static final SlimefunItemStack FUSION_ARTIFACT;
    public static final SlimefunItemStack ARTIFACT_REACTOR;

    public static final SlimefunItemStack VOID_ALTAR;
    public static final SlimefunItemStack VOID_ALTAR_2;


   static {
	  spcaddon_category = new NestedItemGroup(new NamespacedKey(SPCAddon.getInstance(), "spc_smp_category"), new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode("fdd2cce04674c2c3d5a3a94ff219787a2b459de790a0c01ff29b96729072cd")), "&bSPC SMP Addon", new String[0]));
      category_ingredient = new SubItemGroup(new NamespacedKey(SPCAddon.getInstance(), "spc_smp_ingredient"), spcaddon_category, new CustomItemStack(Material.BEEF, "&bSPC SMP - Ingredient", new String[]{"", "&a> Click to open"}));
      category_masak = new SubItemGroup(new NamespacedKey(SPCAddon.getInstance(), "spc_smp_masak"), spcaddon_category, new CustomItemStack(Material.COOKED_BEEF, "&bSPC SMP - Masak Mania", new String[]{"", "&a> Click to open"}));
      category_tools = new SubItemGroup(new NamespacedKey(SPCAddon.getInstance(), "spc_smp_tools"), spcaddon_category, new CustomItemStack(Material.GOLDEN_SHOVEL, "&bSPC SMP - Tools", new String[]{"", "&a> Click to open"}));
      category_consumable = new SubItemGroup(new NamespacedKey(SPCAddon.getInstance(), "spc_smp_consumable"), spcaddon_category, new CustomItemStack(Material.POTION, "&bSPC SMP - Consumable", new String[]{"", "&a> Click to open"}));
      category_material = new SubItemGroup(new NamespacedKey(SPCAddon.getInstance(), "spc_smp_material"), spcaddon_category ,new CustomItemStack(Material.LEATHER, "&bSPC SMP - Material", new String[]{"", "&a> Click to open"}));
      category_weapon = new SubItemGroup(new NamespacedKey(SPCAddon.getInstance(), "spc_smp_weapon"), spcaddon_category, new CustomItemStack(Material.STONE_SWORD, "&bSPC SMP - Weapons", new String[]{"", "&a> Click to open"}));
      category_armor = new SubItemGroup(new NamespacedKey(SPCAddon.getInstance(), "spc_smp_armor"), spcaddon_category, new CustomItemStack(Material.CHAINMAIL_CHESTPLATE, "&bSPC SMP - Armors", new String[]{"", "&a> Click to open"}));
      category_machine = new SubItemGroup(new NamespacedKey(SPCAddon.getInstance(), "spc_smp_machine"), spcaddon_category, new CustomItemStack(Material.DISPENSER, "&bSPC SMP - Machine", new String[]{"", "&a> Click to open"}));
      category_plant = new SubItemGroup(new NamespacedKey(SPCAddon.getInstance(), "spc_smp_plant"), spcaddon_category, new CustomItemStack(Material.OAK_SAPLING, "&bSPC SMP - Artificial Plants", new String[]{"", "&a> Click to open"}));
      category_skin = new SubItemGroup(new NamespacedKey(SPCAddon.getInstance(), "spc_smp_skin"), spcaddon_category, new CustomItemStack(Material.PAINTING, "&bSPC SMP - Machine Skin", new String[]{"", "&a> Click to open"}));
      RICE = new SlimefunItemStack("RICE", Material.BONE_MEAL, "&fRice", new String[0]);
      COFFEE_BEAN = new SlimefunItemStack("COFFEE_BEAN", Material.COCOA_BEANS, "&eCoffee Beans", new String[0]);
      CASSAVA = new SlimefunItemStack("CASSAVA", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I4ZDQ2NWQyZDRkNDRlMDY5NTk2YWQ2ODA1MjQzY2UyZjYxZmIwYzNmYmNhYWI2ZDgyZTk5YzkxNDBiMiJ9fX0=", "&fCassava", new String[0]);
      CHILI = new SlimefunItemStack("CHILI", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzUyMDc2NmI4N2QyNDYzYzM0MTczZmZjZDU3OGIwZTY3ZDE2M2QzN2EyZDdjMmU3NzkxNWNkOTExNDRkNDBkMSJ9fX0=", "&eChili", new String[0]);
      PEANUT = new SlimefunItemStack("PEANUT", Material.COCOA_BEANS, "&fPeanut", new String[0]);
      DURIAN = new SlimefunItemStack("DURIAN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjgwNDkyZWU2ZTkzNzcyZmI4ZGIzYzY0YWYwODljM2EzNmM2YWZkNzc2YTRjZGUyZGMyODVmZWNkMWFlMzlhIn19fQ==", "&eDurian", new String[0]);
      MANGO = new SlimefunItemStack("MANGO", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTk1MzM4OGNjZDZmZjY0ZmMxOTUwZGQ0Y2VjNGFkZWFhMzQ4YWFhYmNjNTMyODI4ZTcxNDRmNTA5ZjIzYyJ9fX0=", "&fMango", new String[]{"", "&7&oRestores &b&o0.5 &7&oHunger"});
      BANANA = new SlimefunItemStack("BANANA", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjBhYWExNDI1ZDJiOTkzODM2OTdkNTcxOTNmMjdkODcyNDQyYmNiOTk1NTA4ZjQyZDE5ZGU0YWYxZjg2MTIifX19", "&eBanana", new String[]{"", "&7&oRestores &b&o0.5 &7&oHunger"});
      SALAM_AND_SEREH = new SlimefunItemStack("SALAM_AND_SEREH", Material.KELP, "&eSalam And Sereh", new String[0]);
      MSG = new SlimefunItemStack("MSG", Material.SUGAR, "&eMSG", new String[]{"", "&7&oUncle Roger Favorites"});
      SOYBEAN = new SlimefunItemStack("SOYBEAN", Material.PUMPKIN_SEEDS, "&fSoybean", new String[0]);
      TOBACCO = new SlimefunItemStack("TOBACCO", Material.WHEAT, "&eTobacco", new String[]{"", "&7&oAlias tembakau"});
      BLACK_PEPPER_POWDER = new SlimefunItemStack("BLACK_PEPPER_POWDER", Material.GUNPOWDER, "&eBlack Pepper Powder", new String[0]);
      TAPIOCA_FLOUR = new SlimefunItemStack("TAPIOCA_FLOUR", Material.SUGAR, "&eTapioca Flour", new String[0]);
      BREAD_CRUMB = new SlimefunItemStack("BREAD_CRUMB", Material.GLOWSTONE_DUST, "&fBread Crumb", new String[0]);
      UNCOOK_NOODLE = new SlimefunItemStack("UNCOOK_NOODLE", Material.STRING, "&eUncook Noodle", new String[0]);
      CHOCOLATE_POWDER = new SlimefunItemStack("CHOCOLATE_POWDER", Material.GLOWSTONE_DUST, "&eChocolate Powder", new String[0]);
      COFFEE_POWDER = new SlimefunItemStack("COFFEE_POWDER", Material.GLOWSTONE_DUST, "&eCoffee Powder", new String[0]);
      SOY_SAUCE = new SlimefunItemStack("SOY_SAUCE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODlmZmE5MjI0ZmYyZGUxMTBiZDZkMzg5NjllMGNlODU1NDhiNjc3MDdmZTI1YmU5ZGY5ODQ4NWIzMzlhMzcifX19", "&eSoy Sauce", new String[0]);
      SWEET_SOY_SAUCE = new SlimefunItemStack("SWEET_SOY_SAUCE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODlmZmE5MjI0ZmYyZGUxMTBiZDZkMzg5NjllMGNlODU1NDhiNjc3MDdmZTI1YmU5ZGY5ODQ4NWIzMzlhMzcifX19", "&eSweet Soy Sauce", new String[0]);
      GRATED_COCONUT = new SlimefunItemStack("GRATED_COCONUT", Material.SUGAR, "&eGrated Coconut", new String[0]);
      FRESH_MILK = new SlimefunItemStack("FRESH_MILK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzI4MzQ4YWQ0Mjk4NzlmMTZiMmIyODk3ODY4ZDZiMWY0NTE1YjJlZmE3NjZkMzNkNGNhYWY0M2VhNDY1In19fQ==", "&fFresh Milk", new String[0]);
      CONDENSED_MILK = new SlimefunItemStack("CONDENSED_MILK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIxMmEzMTY2ZDNjYzI2YTczNGY2NTAwZWQ2OGI4ZDllNjAyMzgyMDhjMjk5MTkzZTFiMGY3ZTExOTNjY2ExNCJ9fX0=", "&eCondensed Milk", new String[0]);
      COMPRESSED_SEAGRASS = new SlimefunItemStack("COMPRESSED_SEAGRASS", Material.LIME_CARPET, "&fCompressed Seagrass", new String[0]);
      NORI = new SlimefunItemStack("NORI", Material.GREEN_CARPET, "&eNori", new String[0]);
      FERMENTED_WHEAT = new SlimefunItemStack("FERMENTED_WHEAT", Material.WHEAT, "&fFermented Wheat", new String[0]);
      FERMENTED_POTATO = new SlimefunItemStack("FERMENTED_POTATO", Material.POISONOUS_POTATO, "&fFermented Potato", new String[0]);
      FERMENTED_GRAPE = new SlimefunItemStack("FERMENTED_GRAPE", "6ee97649bd999955413fcbf0b269c91be4342b10d0755bad7a17e95fcefdab0", "&fFermented Grape", new String[0]);
      CHILI_POWDER = new SlimefunItemStack("CHILI_POWDER", Material.REDSTONE, "&eChili Powder", new String[0]);
      VODKA = new SlimefunItemStack("VODKA", new CustomPotion("&aVodka", Color.WHITE, new PotionEffect(PotionEffectType.NAUSEA, 600, 0), new String[]{"", "&aApply NAUSEA", "", "&7&oThis + Wiskey = Oolong Tea"}));
      BEER = new SlimefunItemStack("BEER", new CustomPotion("&aBeer", Color.YELLOW, new PotionEffect(PotionEffectType.NAUSEA, 600, 0), new String[]{"", "&aApply NAUSEA", "", "&7&oAmerican Classic"}));
      RED_WINE = new SlimefunItemStack("RED_WINE", new CustomPotion("&aRed Wine", Color.RED, new PotionEffect(PotionEffectType.NAUSEA, 600, 0), new String[]{"", "&aApply NAUSEA", "", "&7&oCeban pertama"}));
      MANGO_JUICE = new SlimefunItemStack("MANGO_JUICE", new CustomPotion("&aMango Juice", Color.ORANGE, new PotionEffect(PotionEffectType.SATURATION, 6, 0), new String[]{"", "&7&oRestores &b&o3.0 &7&oHunger"}));
      CRACKER = new SlimefunItemStack("CRACKER", Material.YELLOW_CARPET, "&eCracker", new String[]{"", "&7&oRestores &b&o3.0 &7&oHunger"});
      COFFEE = new SlimefunItemStack("COFFEE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2VhMGY3NzU3MTg1YmU5ZGY1YjJmYzlkODVkNDA2NDJlYTRmZGI0NTE1ZjMxNGRhMThmNTljNjk2ZTViZTkifX19", "&eCoffee", new String[]{"", "&7&oRestores &b&o4.0 &7&oHunger", "", "&7&oNikmat ketika senja dengan sebatang rokok"});
      CAPPUCINO = new SlimefunItemStack("CAPPUCINO", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzRhZTE5MmNlYzI4NTBiMjQ1YjgyM2ExNWNlNTVmMzMyZjA5YzQ5MWIxNWE5NjQ1Yzk4MmI4OGM1NjRkNGMyIn19fQ==", "&bCappucino", new String[]{"", "&7&oRestores &b&o4.5 &7&oHunger", "", "&7&oNikmat ketika senja dengan sebatang rokok"});
      CHICKEN_NOODLE = new SlimefunItemStack("CHICKEN_NOODLE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmRjNTVmNDNlM2Q4NDIwOTc1MTg5YTcwZmVhNGRmNzc5MWU0ZTEwMGI0MTYzZDYxNWI5YzBkMjBiMWRmYjJiZSJ9fX0=", "&bChicken Noodle", new String[]{"", "&7&oRestores &b&o5.5 &7&oHunger"});
      SPICY_CHICKEN_NOODLE = new SlimefunItemStack("SPICY_CHICKEN_NOODLE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjIzZGZkNGNlNTc3ODY5MTQ5NjhhMmIzYmE4MjE3M2JhN2M2Y2I4YmMwODQ0MmQ0MTMwY2IwOWM0YTAwMDk4MCJ9fX0=", "&dSpicy Chicken Noodle", new String[]{"", "&7&oRestores &b&o8.0 &7&oHunger"});
      SPAGHETTI = new SlimefunItemStack("SPAGHETTI", "5be45a5e9c95d5223640e73ec028a0d4ba0e594f55ce47792df4097b324bddf", "&bSpaghetti", new String[]{"", "&7&oRestores &b&o6.0 &7&oHunger"});
      BEEF_RENDANG = new SlimefunItemStack("BEEF_RENDANG", Material.COOKED_BEEF, "&dBeef Rendang", new String[]{"", "&7&oRestores &b&o9.0 &7&oHunger"});
      SUSHI = new SlimefunItemStack("SUSHI", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUzNDdkYWRmNjgxOTlmYTdhMWI2NmYwNDgxYWQ4ZTlkYWVlMTUxMDg2NWFkZDZmMzNkMTVmYjM3OGQxM2U5MSJ9fX0=", "&bSushi", new String[]{"", "&7&oRestores &b&o5.0 &7&oHunger"});
      MILK_PIE = new SlimefunItemStack("MILK_PIE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDUzYzFlODdlNTM3ZjFhYjI3NzRkZGFmYjgzNDM5YjMzNmY0YTc3N2I0N2FkODJiY2IzMGQ1ZmNiZGY5YmMifX19", "&bMilk Pie", new String[]{"", "&7&oRestores &b&o6.5 &7&oHunger"});
      MILK_TEA = new SlimefunItemStack("MILK_TEA", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDhlOTRkZGQ3NjlhNWJlYTc0ODM3NmI0ZWM3MzgzZmQzNmQyNjc4OTRkN2MzYmVlMDExZThlNGY1ZmNkNyJ9fX0=", "&bMilk Tea", new String[]{"", "&7&oRestores &b&o4.5 &7&oHunger"});
      HOT_FRIED_CHICKEN = new SlimefunItemStack("HOT_FRIED_CHICKEN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDNlMjBhMjZjYmI1NzQwYTE1OGRhOTkxZWY5NGRjZDMyZDQ0N2U5YWMwM2FhMGU4ZjgyOWE0OTgzMDYxOWExMCJ9fX0=", "&dHot Fried Chicken", new String[]{"", "&7&oRestores &b&o8.0 &7&oHunger"});
      CHICKEN_KARAAGE = new SlimefunItemStack("CHICKEN_KARAAGE", "11ec45cef70e846ff48ea174b60dc6ad2e2ab7a7ccf7eff32e914c53d5f3fc87", "&bChicken Karaage", new String[]{"", "&7&oRestores &b&o5.5 &7&oHunger"});
      RINGO_AME = new SlimefunItemStack("RINGO_AME", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWZhNThiNGE0MzMwOWM0YWJiNGVkMzU1NDQ4NmZkMWJiOTUyY2MyNmFmMDlkZTZiYmRmNDYxZDMwNDkzMGU4MyJ9fX0=", "&bRingo Ame", new String[]{"", "&7&oRestores &b&o3.0 &7&oHunger"});
      RAMEN = new SlimefunItemStack("RAMEN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTE1M2FmY2E5YWJjYTU1ZWMzNTljZmFhNWFhY2IwMTAxYWFhZmI3NWI3ZGE2M2I2M2I2YTFlYTVhNTg4NzNhIn19fQ==", "&bRamen", new String[]{"", "&7&oRestores &b&o7.5 &7&oHunger"});
      CILOK = new SlimefunItemStack("CILOK", Material.FIREWORK_STAR, "&bCilok", new String[]{"", "&7&oRestores &b&o4.0 &7&oHunger"});
      BEEF_SKEWER = new SlimefunItemStack("BEEF_SKEWER", Material.BLAZE_ROD, "&bBeef Skewer", new String[]{"", "&7&oRestores &b&o6.0 &7&oHunger"});
      CHICKEN_SKEWER = new SlimefunItemStack("CHICKEN_SKEWER", Material.BLAZE_ROD, "&bChicken Skewer", new String[]{"", "&7&oRestores &b&o6.0 &7&oHunger"});
      MUTTON_SKEWER = new SlimefunItemStack("MUTTON_SKEWER", Material.BLAZE_ROD, "&bMutton Skewer", new String[]{"", "&7&oRestores &b&o6.0 &7&oHunger"});
      DURIAN_ICE_CREAM = new SlimefunItemStack("DURIAN_ICE_CREAM", "aba260ae3223323049889f1389d84765e8e88afbd8391b09f1beb5931c44339", "&dDurian Ice Cream", new String[]{"", "&7&oRestores &b&o9.0 &7&oHunger"});
      PEANUT_BUTTER_SANDWICH = new SlimefunItemStack("PEANUT_BUTTER_SANDWICH", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2Q1MzI1MjViNzkwNjRkNGI1MDRkODczMTE3OGI1YmFhYjkxODY2ZWI5YWI1M2QwZmRlN2YwOGMxY2MwZGY4YyJ9fX0=", "&bPeanut Butter Sandwich", new String[]{"", "&7&oRestores &b&o6.0 &7&oHunger"});
      FRIED_BANANA = new SlimefunItemStack("FRIED_BANANA", Material.GOLDEN_CARROT, "&bFried Banana", new String[]{"", "&7&oRestores &b&o4.5 &7&oHunger"});
      BANANA_SPLIT_SUNDAE = new SlimefunItemStack("BANANA_SPLIT_SUNDAE", "cad2e64638dafdeb24c95658b6abab236d23eb9341e98a2437ba611949489a", "&dBanana Split Sundae", new String[]{"", "&7&oRestores &b&o8.5 &7&oHunger"});
      EGG_FRIED_RICE = new SlimefunItemStack("EGG_FRIED_RICE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjZhYTQ1MjdlZWIyZjJiY2U1NGJhNjQyMDhjYjU4ZGVlOGZkM2IyZjA2YjgyM2VhMmJmMWE3MjFjOTIzNTRjIn19fQ==", "&bEgg Fried Rice", new String[]{"", "&7&oRestores &b&o6.0 &7&oHunger"});
      MUTTON_FRIED_RICE = new SlimefunItemStack("MUTTON_FRIED_RICE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTVlZjIyNWU2ZTk2NzljMzFjMzU1NjYyNTgyNTZjNzY3Y2U0N2I5NDU4NTZiM2RiYTgxNDkxNjU2ZmUyZTVjMyJ9fX0=", "&bMutton Fried Rice", new String[]{"", "&7&oRestores &b&o7.5 &7&oHunger"});
      COCA_COLA = new SlimefunItemStack("COCA_COLA", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTNiMDFmYjJmNmJhNDdjOWQ3NjM4NDkxZjM3Y2Q4NTgyYTkzNzczMTE4NmRmNGQxZWNjZDU5YjY1YmYzNyJ9fX0=", "&aCoca Cola", new String[]{"", "&7&oRestores &b&o4.5 &7&oHunger"});
      SPRITE = new SlimefunItemStack("SPRITE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjhhMzRkODZhN2JiMTNkNDVhZmRjNTBkM2RjZTVlZWQ5NWUxODQ0ZmJkZWUwY2NhNzUzYzZkMzM0NmUzMzllIn19fQ==", "&aSprite", new String[]{"", "&7&oRestores &b&o3.0 &7&oHunger"});
      FANTA = new SlimefunItemStack("FANTA", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmJlOTUwNWEzOGExNGQxNTEyYzc4OTJmYzQ0ZDNkN2NlNjMzOGIxYmYwZjkxMjM3MjFiMTIxYTE0YjA5NWEzIn19fQ==", "&aFanta", new String[]{"", "&7&oRestores &b&o7.0 &7&oHunger"});
      PEPSI = new SlimefunItemStack("PEPSI", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmJiYWU2ZGY5OWRjODJiZWFmNDlkMDY0ZGY3NGExYmJjMTVlOGUzNzY1MzMyNzY5MTJjOGM4ZmU1OWNiNGY0In19fQ==", "&aPepsi", new String[]{"", "&7&oRestores &b&o5.5 &7&oHunger"});
      CIGARETTES = new SlimefunItemStack("CIGARETTES", Material.STICK, "&bCigarettes", new String[]{"", "&aGive Smoky Feeling", "", "&7&oNikmat ketika senja dengan kopi"});
      INDONESIAN_INGREDIENT_LOOTBAG = new SlimefunItemStack("INDONESIAN_INGREDIENT_LOOTBAG", Material.LEATHER, "&aIndonesian Ingredient Loot Bag", new String[]{"", "&aRight Click to get random Indonesian", "&aingredient"});
      UNCHARGED_HEART_OF_THE_SEA = new SlimefunItemStack("UNCHARGED_HEART_OF_THE_SEA", Material.HEART_OF_THE_SEA, "&fUncharged Heart Of The Sea", new String[]{"", "&aRight Click to charge"});
      VENDING_MACHINE = new SlimefunItemStack("VENDING_MACHINE", Material.GLASS_BOTTLE, "&bVending Machine", new String[]{"", "&7&oMenjual minuman segar"});
      ELITE_GENERATOR = new SlimefunItemStack("ELITE_GENERATOR", "6b9a4dfcc7153c3176dc8cf38887d2d8385545fa4c5f8c2ff13f9d69e98e9", "&bElite Generator", new String[]{"", "&7&oGenerator untuk para kaum elit", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR), LoreBuilder.powerBuffer(1000), LoreBuilder.powerPerSecond(100)});
      ELITE_GENERATOR_2 = new SlimefunItemStack("ELITE_GENERATOR_2", "6b9a4dfcc7153c3176dc8cf38887d2d8385545fa4c5f8c2ff13f9d69e98e9", "&bElite Generator &7- &eII", new String[]{"", "&7&oGenerator untuk para kaum elit", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(2500), LoreBuilder.powerPerSecond(250)});
      ELITE_GENERATOR_3 = new SlimefunItemStack("ELITE_GENERATOR_3", "6b9a4dfcc7153c3176dc8cf38887d2d8385545fa4c5f8c2ff13f9d69e98e9", "&bElite Generator &7- &eIII", new String[]{"", "&7&oGenerator untuk para kaum elit", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(5300), LoreBuilder.powerPerSecond(530)});
      ELITE_COIN = new SlimefunItemStack("ELITE_COIN", Material.GOLD_NUGGET, "&bElite Coin", new String[]{"", "&7&oCoin drop dari elite mobs"});
      ELITE_INGOT = new SlimefunItemStack("ELITE_INGOT", Material.GOLD_INGOT, "&bElite Ingot", new String[]{"", "&7&oBahan bakar untuk para kaum elit"});
      REINFORCED_LEATHER = new SlimefunItemStack("REINFORCED_LEATHER", Material.BROWN_CARPET, "&eReinforced Leather", new String[0]);
      REINFORCED_SHULKER_SHELL = new SlimefunItemStack("REINFORCED_SHULKER_SHELL", Material.PURPLE_CARPET, "&dReinforced Shulker Shell", new String[0]);
      ROPE = new SlimefunItemStack("ROPE", Material.COPPER_CHAIN, "&eRope", new String[0]);

      NETHER_RUNE = new SlimefunItemStack("NETHER_RUNE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjFhNzY4Y2ViN2I4NmM4OGY3MGU4NzlkOWJmNGJhYzRlNzdmOTI0OTYzZGFkMmUyNTdmZjM1M2M0MGU5MGVkOSJ9fX0=", "&7Ancient Rune &8&l[&6&lNether&8&l]", new String[0]);

      ATLANTIC_DUST = new SlimefunItemStack("ATLANTIC_DUST", Material.SUGAR, "&9Atlantic Dust", new String[0]);
      ATLANTIC_INGOT = new SlimefunItemStack("ATLANTIC_INGOT", Material.IRON_INGOT, "&9Atlantic Ingot", new String[0]);
      ENDER_DEBRIS = new SlimefunItemStack("ENDER_DEBRIS", Material.PURPLE_GLAZED_TERRACOTTA, "&5Ender Debris", new String[]{"", "&7&oEnder Power"});
      ENDERITE_DUST = new SlimefunItemStack("ENDERITE_DUST", Material.GUNPOWDER, "&5Enderite Dust", new String[]{"", "&7&oEnder Power"});
      ENDERITE_INGOT = new SlimefunItemStack("ENDERITE_INGOT", Material.NETHERITE_INGOT, "&5Enderite Ingot", new String[]{"", "&7&oEnder Power"});
      ENDER_DRAGON_SCALES = new SlimefunItemStack("ENDER_DRAGON_SCALES", Material.PURPLE_DYE, "&5Ender Dragon Scales", new String[]{"", "&8&oDrop from the ender dragon"});
      ENDER_HEART = new SlimefunItemStack("ENDER_HEART", Material.CHORUS_FRUIT, "&5Ender Heart", new String[0]);
      ENDER_HEART.addUnsafeEnchantment(Enchantment.UNBREAKING, 10);
      ItemMeta endheartmeta = ENDER_HEART.getItemMeta();
      endheartmeta.addItemFlags(new ItemFlag[]{ItemFlag.HIDE_ENCHANTS});
      ENDER_HEART.setItemMeta(endheartmeta);
      GOLDEN_PLATE = new SlimefunItemStack("GOLDEN_PLATE", Material.YELLOW_CARPET, "&eGolden Plate", new String[0]);
      DIAMOND_PLATE = new SlimefunItemStack("DIAMOND_PLATE", Material.LIGHT_BLUE_CARPET, "&bDiamond Plate", new String[0]);
      SAPPHIRE_PLATE = new SlimefunItemStack("SAPPHIRE_PLATE", Material.BLUE_CARPET, "&1Sapphire Plate", new String[0]);
      NETHERITE_PLATE = new SlimefunItemStack("NETHERITE_PLATE", Material.BLACK_CARPET, "&4Netherite Plate", new String[0]);

       // --- ITEM DEFINITIONS ---
       ENDERITE_SWORD = new SlimefunItemStack("ENDERITE_SWORD", Material.NETHERITE_SWORD, "&5Enderite Sword", "", "&7&oEnder Power", "", "&7When in Main Hand:", " &29 Attack Damage", " &21.8 Attack Speed");
       setupTool(ENDERITE_SWORD, "ender_sword", 9.0D, -2.2D, true);

       ENDERITE_HELMET = new SlimefunItemStack("ENDERITE_HELMET", Material.LEATHER_HELMET, Color.fromRGB(108, 0, 154), "&5Enderite Helmet", "", "&7&oEnder Power");
       setupArmor(ENDERITE_HELMET, "ender_helm", 3.0D, 3.0D, 0.1D, 2.0D, EquipmentSlotGroup.HEAD, true);
       ENDERITE_CHESTPLATE = new SlimefunItemStack("ENDERITE_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.fromRGB(108, 0, 154), "&5Enderite Chestplate", "", "&7&oEnder Power");
       setupArmor(ENDERITE_CHESTPLATE, "ender_chest", 8.0D, 3.0D, 0.1D, 2.0D, EquipmentSlotGroup.CHEST, true);
       ENDERITE_LEGGINGS = new SlimefunItemStack("ENDERITE_LEGGINGS", Material.LEATHER_LEGGINGS, Color.fromRGB(108, 0, 154), "&5Enderite Leggings", "", "&7&oEnder Power");
       setupArmor(ENDERITE_LEGGINGS, "ender_legs", 6.0D, 3.0D, 0.1D, 2.0D, EquipmentSlotGroup.LEGS, true);
       ENDERITE_BOOTS = new SlimefunItemStack("ENDERITE_BOOTS", Material.LEATHER_BOOTS, Color.fromRGB(108, 0, 154), "&5Enderite Boots", "", "&7&oEnder Power");
       setupArmor(ENDERITE_BOOTS, "ender_boots", 3.0D, 3.0D, 0.1D, 2.0D, EquipmentSlotGroup.FEET, true);

       ENDERITE_PICKAXE = new SlimefunItemStack("ENDERITE_PICKAXE", Material.NETHERITE_PICKAXE, "&5Enderite Pickaxe", "", "&7&oEnder Power", "", "&7When in Main Hand:", " &27 Attack Damage", " &21.2 Attack Speed");
       setupTool(ENDERITE_PICKAXE, "ender_pick", 7.0D, -2.8D, true);
       ENDERITE_AXE = new SlimefunItemStack("ENDERITE_AXE", Material.NETHERITE_AXE, "&5Enderite Axe", "", "&7&oEnder Power", "", "&7When in Main Hand:", " &211 Attack Damage", " &20.8 Attack Speed");
       setupTool(ENDERITE_AXE, "ender_axe", 11.0D, -3.2D, true);
       ENDERITE_SHOVEL = new SlimefunItemStack("ENDERITE_SHOVEL", Material.NETHERITE_SHOVEL, "&5Enderite Shovel", "", "&7&oEnder Power", "", "&7When in Main Hand:", " &26.5 Attack Damage", " &21 Attack Speed");
       setupTool(ENDERITE_SHOVEL, "ender_shovel", 6.5D, -3.0D, true);
       ENDERITE_HOE = new SlimefunItemStack("ENDERITE_HOE", Material.NETHERITE_HOE, "&5Enderite Hoe", "", "&7&oEnder Power", "", "&7When in Main Hand:", " &24 Attack Damage", " &22 Attack Speed");
       setupTool(ENDERITE_HOE, "ender_hoe", 4.0D, -2.0D, true);

       OBSIDIAN_DRILL = new SlimefunItemStack("OBSIDIAN_DRILL", Material.DIAMOND_PICKAXE, "&8Obsidian Drill", "", "&9+ Can only mine obsidian", "", "&7When in Main Hand:", " &27 Attack Damage", " &21.2 Attack Speed");
       OBSIDIAN_DRILL.addUnsafeEnchantment(Enchantment.EFFICIENCY, 20);
       setupTool(OBSIDIAN_DRILL, "obs_drill", 7.0D, -2.8D, false);
       STONE_DRILL = new SlimefunItemStack("STONE_DRILL", Material.IRON_PICKAXE, "&7Stone Drill", "", "&9+ Can only mine stone", "", "&7When in Main Hand:", " &27 Attack Damage", " &21.2 Attack Speed");
       STONE_DRILL.addUnsafeEnchantment(Enchantment.EFFICIENCY, 10);
       STONE_DRILL.addUnsafeEnchantment(Enchantment.UNBREAKING, 7);
       setupTool(STONE_DRILL, "stone_drill", 7.0D, -2.8D, false);





      GOLDEN_BACKPACK = new SlimefunItemStack("GOLDEN_BACKPACK", "a37a35522f67b2af92345592846b702b9afb9d7c8dbad5ea150673c9e44de3", "&eGolden Backpack", new String[]{"", "&7Size: &e18", "&7ID: <ID>", "", "&eRight Click&7 to open"});
      DIAMOND_BACKPACK = new SlimefunItemStack("DIAMOND_BACKPACK", "df70fab3246fe027ce0bba885a73c6e82d8ff8f358231e8461f956560cfa58f", "&bDiamond Backpack", new String[]{"", "&7Size: &e27", "&7ID: <ID>", "", "&eRight Click&7 to open"});
      SAPPHIRE_BACKPACK = new SlimefunItemStack("SAPPHIRE_BACKPACK", "8224b2c7391eb5bfcb278431d5c827cb26349526c7bc535b1e95f6df9f3fdf3", "&1Sapphire Backpack", new String[]{"", "&7Size: &e36", "&7ID: <ID>", "", "&eRight Click&7 to open"});
      REINFORCED_IRON_BACKPACK = new SlimefunItemStack("REINFORCED_IRON_BACKPACK", "ebdf8d53bdb932c223c627bbb8c1e0c5e351a616cd8056929c66e6dce44433db", "&f&lReinforced Iron Backpack", new String[]{"", "&7Size: &e45", "&7ID: <ID>", "", "&eRight Click&7 to open"});
      ULTIMATE_BACKPACK = new SlimefunItemStack("ULTIMATE_BACKPACK", "5cd287727d33967592637b953d5735586ec4d01b1b5160c0adb349c4675db4", "&c&lUltimate Backpack", new String[]{"", "&7Size: &e54", "&7ID: <ID>", "", "&eRight Click&7 to open"});


      DRILL_HEAD = new SlimefunItemStack("DRILL_HEAD", Material.HOPPER, "&f&lDrill Head", new String[0]);


      MUSHROOMATOR = new SlimefunItemStack("MUSHROOMATOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWYzYzE0ZDJjZjE2NDA1ZGFmODMyOTJlYTRlOThlNzUxOTNiNjQyNTc2MjM0MTMxMmZhYTg4OTMzNTk5ZTMwIn19fQ=="
    		  , "&6Mushroomator", new String[]{"", "&fMembuat mushroom dan mycelium", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerPerSecond(40)});

      MUSHROOMATOR_2 = new SlimefunItemStack("MUSHROOMATOR_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWYzYzE0ZDJjZjE2NDA1ZGFmODMyOTJlYTRlOThlNzUxOTNiNjQyNTc2MjM0MTMxMmZhYTg4OTMzNTk5ZTMwIn19fQ=="
    		  , "&6Mushroomator &7- &eII", new String[]{"", "&fMembuat mushroom dan mycelium", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3.5F), LoreBuilder.powerPerSecond(80)});

      MUSHROOMATOR_3 = new SlimefunItemStack("MUSHROOMATOR_3", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWYzYzE0ZDJjZjE2NDA1ZGFmODMyOTJlYTRlOThlNzUxOTNiNjQyNTc2MjM0MTMxMmZhYTg4OTMzNTk5ZTMwIn19fQ=="
    		  , "&6Mushroomator &7- &eIII", new String[]{"", "&fMembuat mushroom dan mycelium", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(10.0F), LoreBuilder.powerPerSecond(80)});

      ENDERITE_PLATE = new SlimefunItemStack("ENDERITE_PLATE", Material.PURPLE_CARPET, "&5Enderite Plate", new String[0]);


      DIRT_CREATOR = new SlimefunItemStack("DIRT_CREATOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmFmODVhOTJiZWRkOWE4NTcxY2Y1YTA2NzU4YTc1YjllYjU1NmE2MzkxNTk2MTlmZGQ1OTJkYzRhMzM0YWE1In19fQ=="
    		  , "&6Dirt Creator", new String[]{"", "&fMembuat dirt dari bahan lain", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerPerSecond(10)});

      DIRT_CREATOR_2 = new SlimefunItemStack("DIRT_CREATOR_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmFmODVhOTJiZWRkOWE4NTcxY2Y1YTA2NzU4YTc1YjllYjU1NmE2MzkxNTk2MTlmZGQ1OTJkYzRhMzM0YWE1In19fQ=="
    		  , "&6Dirt Creator &7- &eII", new String[]{"", "&fMembuat dirt dari bahan lain", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(3.0F), LoreBuilder.powerPerSecond(24)});

      DIRT_CREATOR_3 = new SlimefunItemStack("DIRT_CREATOR_3", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmFmODVhOTJiZWRkOWE4NTcxY2Y1YTA2NzU4YTc1YjllYjU1NmE2MzkxNTk2MTlmZGQ1OTJkYzRhMzM0YWE1In19fQ=="
    		  , "&6Dirt Creator &7- &eIII", new String[]{"", "&fMembuat dirt dari bahan lain", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(10.0F), LoreBuilder.powerPerSecond(24)});

      CORRUPTED_TABLE = new SlimefunItemStack("CORRUPTED_TABLE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmMyZThmZGFiMGJmNzQ2MjZmMWQ2ZjkwODAyNzUyNGEyOGI1M2U2MmYzYTY1ODhmODc2YzUzYTdmN2U1OGI1OCJ9fX0="
    		  , "&5Corrupted Table", new String[]{"", "&fMembuat bahan corrupt", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerBuffer(5000), LoreBuilder.powerPerSecond(500)});

      CORRUPTED_TABLE_2 = new SlimefunItemStack("CORRUPTED_TABLE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmMyZThmZGFiMGJmNzQ2MjZmMWQ2ZjkwODAyNzUyNGEyOGI1M2U2MmYzYTY1ODhmODc2YzUzYTdmN2U1OGI1OCJ9fX0="
    		  , "&5Corrupted Table &7- &eII", new String[]{"", "&fMembuat bahan corrupt", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5.0F), LoreBuilder.powerBuffer(50000), LoreBuilder.powerPerSecond(500)});

      UNCORRUPTED_TABLE = new SlimefunItemStack("UNCORRUPTED_TABLE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjNmODlmMzZjODNkZjQ5OTRlYzE3M2FhODk3NGIxMmFjNjI5YzYwOWI3OGY2ZGE4MjVhMjEwOWU3ZGE3MzkifX19"
    		  , "&eUncorrupted Table", new String[]{"", "&fMembersihkan item corrupt", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerBuffer(5000), LoreBuilder.powerPerSecond(500)});

      UNCORRUPTED_TABLE_2 = new SlimefunItemStack("UNCORRUPTED_TABLE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjNmODlmMzZjODNkZjQ5OTRlYzE3M2FhODk3NGIxMmFjNjI5YzYwOWI3OGY2ZGE4MjVhMjEwOWU3ZGE3MzkifX19"
    		  , "&eUncorrupted Table &7- &eII", new String[]{"", "&fMembersihkan item corrupt", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5.0F), LoreBuilder.powerBuffer(50000), LoreBuilder.powerPerSecond(500)});

       CORRUPTED_COAL = new SlimefunItemStack("CORRUPTED_COAL", Material.COAL, "&5Corrupted &fCoal &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_COAL);
       CORRUPTED_COAL_2 = new SlimefunItemStack("CORRUPTED_COAL_2", Material.COAL, "&5Corrupted &fCoal &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_COAL_2);

       CORRUPTED_DIAMOND = new SlimefunItemStack("CORRUPTED_DIAMOND", Material.DIAMOND, "&5Corrupted &fDiamond &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_DIAMOND);
       CORRUPTED_DIAMOND_2 = new SlimefunItemStack("CORRUPTED_DIAMOND_2", Material.DIAMOND, "&5Corrupted &fDiamond &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_DIAMOND_2);

       CORRUPTED_EMERALD = new SlimefunItemStack("CORRUPTED_EMERALD", Material.EMERALD, "&5Corrupted &fEmerald &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_EMERALD);
       CORRUPTED_EMERALD_2 = new SlimefunItemStack("CORRUPTED_EMERALD_2", Material.EMERALD, "&5Corrupted &fEmerald &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_EMERALD_2);

       CORRUPTED_REDSTONE_DUST = new SlimefunItemStack("CORRUPTED_REDSTONE_DUST", Material.REDSTONE, "&5Corrupted &fRedstone Dust &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_REDSTONE_DUST);
       CORRUPTED_REDSTONE_DUST_2 = new SlimefunItemStack("CORRUPTED_REDSTONE_DUST_2", Material.REDSTONE, "&5Corrupted &fRedstone Dust &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_REDSTONE_DUST_2);

       CORRUPTED_LAPIS_LAZULI = new SlimefunItemStack("CORRUPTED_LAPIS_LAZULI", Material.LAPIS_LAZULI, "&5Corrupted &fLapis Lazuli &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_LAPIS_LAZULI);
       CORRUPTED_LAPIS_LAZULI_2 = new SlimefunItemStack("CORRUPTED_LAPIS_LAZULI_2", Material.LAPIS_LAZULI, "&5Corrupted &fLapis Lazuli &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_LAPIS_LAZULI_2);

       CORRUPTED_IRON_INGOT = new SlimefunItemStack("CORRUPTED_IRON_INGOT", Material.IRON_INGOT, "&5Corrupted &fIron Ingot &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_IRON_INGOT);
       CORRUPTED_IRON_INGOT_2 = new SlimefunItemStack("CORRUPTED_IRON_INGOT_2", Material.IRON_INGOT, "&5Corrupted &fIron Ingot &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_IRON_INGOT_2);

       CORRUPTED_GOLD_INGOT = new SlimefunItemStack("CORRUPTED_GOLD_INGOT", Material.GOLD_INGOT, "&5Corrupted &fGold Ingot &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_GOLD_INGOT);
       CORRUPTED_GOLD_INGOT_2 = new SlimefunItemStack("CORRUPTED_GOLD_INGOT_2", Material.GOLD_INGOT, "&5Corrupted &fGold Ingot &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_GOLD_INGOT_2);

       CORRUPTED_ELITE_INGOT = new SlimefunItemStack("CORRUPTED_ELITE_INGOT", Material.GOLD_INGOT, "&5Corrupted &bElite Ingot &7- &eI", "", "&7&oMaterial untuk para kaum elit", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_ELITE_INGOT);
       CORRUPTED_ELITE_INGOT_2 = new SlimefunItemStack("CORRUPTED_ELITE_INGOT_2", Material.GOLD_INGOT, "&5Corrupted &bElite Ingot &7- &eII", "", "&7&oMaterial untuk para kaum elit", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_ELITE_INGOT_2);

       CORRUPTED_NETHERITE_INGOT = new SlimefunItemStack("CORRUPTED_NETHERITE_INGOT", Material.NETHERITE_INGOT, "&5Corrupted &fNetherite Ingot &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_NETHERITE_INGOT);
       CORRUPTED_NETHERITE_INGOT_2 = new SlimefunItemStack("CORRUPTED_NETHERITE_INGOT_2", Material.NETHERITE_INGOT, "&5Corrupted &fNetherite Ingot &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_NETHERITE_INGOT_2);

       CORRUPTED_ENDERITE_INGOT = new SlimefunItemStack("CORRUPTED_ENDERITE_INGOT", Material.NETHERITE_INGOT, "&5Corrupted &fEnderite Ingot &7- &eI", "", "&7&oEnder Power", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_ENDERITE_INGOT);
       CORRUPTED_ENDERITE_INGOT_2 = new SlimefunItemStack("CORRUPTED_ENDERITE_INGOT_2", Material.NETHERITE_INGOT, "&5Corrupted &fEnderite Ingot &7- &eII", "", "&7&oEnder Power", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_ENDERITE_INGOT_2);


       CORRUPTED_ROTTEN_FLESH = new SlimefunItemStack("CORRUPTED_ROTTEN_FLESH", Material.ROTTEN_FLESH, "&5Corrupted &fRotten Flesh &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_ROTTEN_FLESH);
       CORRUPTED_ROTTEN_FLESH_2 = new SlimefunItemStack("CORRUPTED_ROTTEN_FLESH_2", Material.ROTTEN_FLESH, "&5Corrupted &fRotten Flesh &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_ROTTEN_FLESH_2);

       CORRUPTED_BONE = new SlimefunItemStack("CORRUPTED_BONE", Material.BONE, "&5Corrupted &fBone &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_BONE);
       CORRUPTED_BONE_2 = new SlimefunItemStack("CORRUPTED_BONE_2", Material.BONE, "&5Corrupted &fBone &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_BONE_2);

       CORRUPTED_SPIDER_EYE = new SlimefunItemStack("CORRUPTED_SPIDER_EYE", Material.SPIDER_EYE, "&5Corrupted &fSpider Eye &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_SPIDER_EYE);
       CORRUPTED_SPIDER_EYE_2 = new SlimefunItemStack("CORRUPTED_SPIDER_EYE_2", Material.SPIDER_EYE, "&5Corrupted &fSpider Eye &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_SPIDER_EYE_2);

       CORRUPTED_GUNPOWDER = new SlimefunItemStack("CORRUPTED_GUNPOWDER", Material.GUNPOWDER, "&5Corrupted &fGunpowder &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_GUNPOWDER);
       CORRUPTED_GUNPOWDER_2 = new SlimefunItemStack("CORRUPTED_GUNPOWDER_2", Material.GUNPOWDER, "&5Corrupted &fGunpowder &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_GUNPOWDER_2);

       CORRUPTED_MAGMA_CREAM = new SlimefunItemStack("CORRUPTED_MAGMA_CREAM", Material.MAGMA_CREAM, "&5Corrupted &fMagma Cream &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_MAGMA_CREAM);
       CORRUPTED_MAGMA_CREAM_2 = new SlimefunItemStack("CORRUPTED_MAGMA_CREAM_2", Material.MAGMA_CREAM, "&5Corrupted &fMagma Cream &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_MAGMA_CREAM_2);

       CORRUPTED_ENDER_EYE = new SlimefunItemStack("CORRUPTED_ENDER_EYE", Material.ENDER_EYE, "&5Corrupted &fEnder Eye &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_ENDER_EYE);
       CORRUPTED_ENDER_EYE_2 = new SlimefunItemStack("CORRUPTED_ENDER_EYE_2", Material.ENDER_EYE, "&5Corrupted &fEnder Eye &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_ENDER_EYE_2);

       CORRUPTED_NETHER_STAR = new SlimefunItemStack("CORRUPTED_NETHER_STAR", Material.NETHER_STAR, "&5Corrupted &bNether Star &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_NETHER_STAR);
       CORRUPTED_NETHER_STAR_2 = new SlimefunItemStack("CORRUPTED_NETHER_STAR_2", Material.NETHER_STAR, "&5Corrupted &bNether Star &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_NETHER_STAR_2);

       CORRUPTED_REACTOR_COOLANT_CELL = new SlimefunItemStack("CORRUPTED_REACTOR_COOLANT_CELL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjU0OGRjNzUwZWNiMTQ2ZTVjM2E0YmI4OTBjYzYzY2UyYzhkZDI5YjcyNDJhYmE4ZjgxZjdmMWJhNjhlNGY2YyJ9fX0=", "&5Corrupted &bReactor Coolant Cell &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_REACTOR_COOLANT_CELL);
       CORRUPTED_REACTOR_COOLANT_CELL_2 = new SlimefunItemStack("CORRUPTED_REACTOR_COOLANT_CELL_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjU0OGRjNzUwZWNiMTQ2ZTVjM2E0YmI4OTBjYzYzY2UyYzhkZDI5YjcyNDJhYmE4ZjgxZjdmMWJhNjhlNGY2YyJ9fX0=", "&5Corrupted &bReactor Coolant Cell &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_REACTOR_COOLANT_CELL_2);

       CORRUPTED_NATURE_ARTIFACT = new SlimefunItemStack("CORRUPTED_NATURE_ARTIFACT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzM4YjBiMGYxZjM1YzU2YjdkNjRlMGUyYjk2NjE4MDFmOTEyZjMxOGZhOWM4YzFkODNlOTE3ZGI0ZjJlNjUyMSJ9fX0=", "&5Corrupted &aNature Artifact &7- &eI", "", "&c&oFeel the corruption", "&1&oLost in time");
       setupEnchanted(CORRUPTED_NATURE_ARTIFACT);
       CORRUPTED_NATURE_ARTIFACT_2 = new SlimefunItemStack("CORRUPTED_NATURE_ARTIFACT_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzM4YjBiMGYxZjM1YzU2YjdkNjRlMGUyYjk2NjE4MDFmOTEyZjMxOGZhOWM4YzFkODNlOTE3ZGI0ZjJlNjUyMSJ9fX0=", "&5Corrupted &aNature Artifact &7- &eII", "", "&c&oFeel the corruption", "&1&oLost in time");
       setupEnchanted(CORRUPTED_NATURE_ARTIFACT_2);

       CORRUPTED_TECH_ARTIFACT = new SlimefunItemStack("CORRUPTED_TECH_ARTIFACT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGQ0MmJiMzM5MWIzOTY0ZGUyNjZkOWJlYmU3Y2NmN2VmM2MzOTA2MjZlYjdhODQ1NjEyYWQ5MGYzZmE0MmMxMiJ9fX0=", "&5Corrupted &bTech Artifact &7- &eI", "", "&c&oFeel the corruption", "&1&oLost in time");
       setupEnchanted(CORRUPTED_TECH_ARTIFACT);
       CORRUPTED_TECH_ARTIFACT_2 = new SlimefunItemStack("CORRUPTED_TECH_ARTIFACT_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGQ0MmJiMzM5MWIzOTY0ZGUyNjZkOWJlYmU3Y2NmN2VmM2MzOTA2MjZlYjdhODQ1NjEyYWQ5MGYzZmE0MmMxMiJ9fX0=", "&5Corrupted &bTech Artifact &7- &eII", "", "&c&oFeel the corruption", "&1&oLost in time");
       setupEnchanted(CORRUPTED_TECH_ARTIFACT_2);

       CORRUPTED_ANCIENT_ARTIFACT = new SlimefunItemStack("CORRUPTED_ANCIENT_ARTIFACT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2EzNmIzZmIyMzhlOWYyY2Y4MmU5YmExYzMwMzRiOTY5ZmY5NWQzOGQ4ZDE1MTY4ZDQzZDQ2NjQ1MzE2NCJ9fX0=", "&5Corrupted &eAncient Artifact &7- &eI", "", "&c&oFeel the corruption", "&1&oLost in time");
       setupEnchanted(CORRUPTED_ANCIENT_ARTIFACT);
       CORRUPTED_ANCIENT_ARTIFACT_2 = new SlimefunItemStack("CORRUPTED_ANCIENT_ARTIFACT_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2EzNmIzZmIyMzhlOWYyY2Y4MmU5YmExYzMwMzRiOTY5ZmY5NWQzOGQ4ZDE1MTY4ZDQzZDQ2NjQ1MzE2NCJ9fX0=", "&5Corrupted &eAncient Artifact &7- &eII", "", "&c&oFeel the corruption", "&1&oLost in time");
       setupEnchanted(CORRUPTED_ANCIENT_ARTIFACT_2);


       // Logic: Repeat this block for each log type (Oak, Birch, Spruce, Jungle, Acacia, Dark Oak, Crimson, Warped)
       CORRUPTED_OAK_LOG = new SlimefunItemStack("CORRUPTED_OAK_LOG", Material.OAK_LOG, "&5Corrupted &fOak Log &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_OAK_LOG);
       CORRUPTED_OAK_LOG_2 = new SlimefunItemStack("CORRUPTED_OAK_LOG_2", Material.OAK_LOG, "&5Corrupted &fOak Log &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_OAK_LOG_2);

       CORRUPTED_BIRCH_LOG = new SlimefunItemStack("CORRUPTED_BIRCH_LOG", Material.BIRCH_LOG, "&5Corrupted &fBirch Log &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_BIRCH_LOG);
       CORRUPTED_BIRCH_LOG_2 = new SlimefunItemStack("CORRUPTED_BIRCH_LOG_2", Material.BIRCH_LOG, "&5Corrupted &fBirch Log &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_BIRCH_LOG_2);

       CORRUPTED_SPRUCE_LOG = new SlimefunItemStack("CORRUPTED_SPRUCE_LOG", Material.SPRUCE_LOG, "&5Corrupted &fSpruce Log &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_SPRUCE_LOG);
       CORRUPTED_SPRUCE_LOG_2 = new SlimefunItemStack("CORRUPTED_SPRUCE_LOG_2", Material.SPRUCE_LOG, "&5Corrupted &fSpruce Log &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_SPRUCE_LOG_2);

       CORRUPTED_JUNGLE_LOG = new SlimefunItemStack("CORRUPTED_JUNGLE_LOG", Material.JUNGLE_LOG, "&5Corrupted &fJungle Log &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_JUNGLE_LOG);
       CORRUPTED_JUNGLE_LOG_2 = new SlimefunItemStack("CORRUPTED_JUNGLE_LOG_2", Material.JUNGLE_LOG, "&5Corrupted &fJungle Log &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_JUNGLE_LOG_2);

       CORRUPTED_ACACIA_LOG = new SlimefunItemStack("CORRUPTED_ACACIA_LOG", Material.ACACIA_LOG, "&5Corrupted &fAcacia Log &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_ACACIA_LOG);
       CORRUPTED_ACACIA_LOG_2 = new SlimefunItemStack("CORRUPTED_ACACIA_LOG_2", Material.ACACIA_LOG, "&5Corrupted &fAcacia Log &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_ACACIA_LOG_2);

       CORRUPTED_DARK_OAK_LOG = new SlimefunItemStack("CORRUPTED_DARK_OAK_LOG", Material.DARK_OAK_LOG, "&5Corrupted &fDark Oak Log &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_DARK_OAK_LOG);
       CORRUPTED_DARK_OAK_LOG_2 = new SlimefunItemStack("CORRUPTED_DARK_OAK_LOG_2", Material.DARK_OAK_LOG, "&5Corrupted &fDark Oak Log &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_DARK_OAK_LOG_2);

       CORRUPTED_CRIMSON_STEM = new SlimefunItemStack("CORRUPTED_CRIMSON_STEM", Material.CRIMSON_STEM, "&5Corrupted &fCrimson Stem &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_CRIMSON_STEM);
       CORRUPTED_CRIMSON_STEM_2 = new SlimefunItemStack("CORRUPTED_CRIMSON_STEM_2", Material.CRIMSON_STEM, "&5Corrupted &fCrimson Stem &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_CRIMSON_STEM_2);

       CORRUPTED_WARPED_STEM = new SlimefunItemStack("CORRUPTED_WARPED_STEM", Material.WARPED_STEM, "&5Corrupted &fWarped Stem &7- &eI", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_WARPED_STEM);
       CORRUPTED_WARPED_STEM_2 = new SlimefunItemStack("CORRUPTED_WARPED_STEM_2", Material.WARPED_STEM, "&5Corrupted &fWarped Stem &7- &eII", "", "&c&oFeel the corruption");
       setupEnchanted(CORRUPTED_WARPED_STEM_2);


      NETHER_ORB = new SlimefunItemStack("NETHER_ORB", Material.ORANGE_WOOL, "&6Nether Orb", new String[0]);
      ENDER_ORB = new SlimefunItemStack("ENDER_ORB", Material.PURPLE_WOOL, "&5Ender Orb", new String[0]);
      IRON_ORB = new SlimefunItemStack("IRON_ORB", Material.WHITE_WOOL, "&7Iron Orb", new String[0]);
      PROFESSIONAL_CIRCUIT_BOARD = new SlimefunItemStack("PROFESSIONAL_CIRCUIT_BOARD", Material.DETECTOR_RAIL, "&bProfessional Circuit Board", new String[0]);

      NETHER_ALTAR = new SlimefunItemStack("NETHER_ALTAR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTdhOWE5ZjlhMWJkNjZhZGM3MDA2MDM4NWE3NzBjYjg2YmM3NjIxZGQ0MmI3NDMyZmNmNTMyNmViMGQzOGUzNSJ9fX0="
    		  , "&6Nether Altar", new String[]{"", "&fMembuat nether star dari nether orb", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerBuffer(12000), LoreBuilder.powerPerSecond(1600)});

      NETHER_ALTAR_2 = new SlimefunItemStack("NETHER_ALTAR_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTdhOWE5ZjlhMWJkNjZhZGM3MDA2MDM4NWE3NzBjYjg2YmM3NjIxZGQ0MmI3NDMyZmNmNTMyNmViMGQzOGUzNSJ9fX0="
    		  , "&6Nether Altar &7- &eII", new String[]{"", "&fMembuat nether star dari nether orb", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3.0F), LoreBuilder.powerBuffer(32000), LoreBuilder.powerPerSecond(1600)});

      ENDER_ALTAR = new SlimefunItemStack("ENDER_ALTAR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2Y5NjMyNjI0YjAxYzFhNWMyYTcxYThkMDJiYTFhMjYwYjljOWRmMzk2M2I4MmMzYzQwNzA1OGJiZDBjMGU4MiJ9fX0="
    		  , "&5Ender Altar", new String[]{"", "&fMembuat ender dragon scale dari ender orb", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerBuffer(12000), LoreBuilder.powerPerSecond(1600)});

      ENDER_ALTAR_2 = new SlimefunItemStack("ENDER_ALTAR_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2Y5NjMyNjI0YjAxYzFhNWMyYTcxYThkMDJiYTFhMjYwYjljOWRmMzk2M2I4MmMzYzQwNzA1OGJiZDBjMGU4MiJ9fX0="
    		  , "&5Ender Altar &7- &eII", new String[]{"", "&fMembuat ender dragon scale dari ender orb", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3.0F), LoreBuilder.powerBuffer(32000), LoreBuilder.powerPerSecond(1600)});

      IRON_ALTAR = new SlimefunItemStack("IRON_ALTAR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2RiMDIyNjA1NGVhZTA5YWNjZWU1ZTAyMjU2ODcyZTU1YjYyNTkzZGNjZGNkOTQwZGQxYWUzNzkyNDUwZTMyOCJ9fX0="
    		  , "&fIron Altar", new String[]{"", "&fMembuat basic circuit board dari iron orb", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerBuffer(6000), LoreBuilder.powerPerSecond(800)});

      IRON_ALTAR_2 = new SlimefunItemStack("IRON_ALTAR_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2RiMDIyNjA1NGVhZTA5YWNjZWU1ZTAyMjU2ODcyZTU1YjYyNTkzZGNjZGNkOTQwZGQxYWUzNzkyNDUwZTMyOCJ9fX0="
    		  , "&fIron Altar &7- &eII", new String[]{"", "&fMembuat basic circuit board dari iron orb", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(6.0F), LoreBuilder.powerBuffer(16000), LoreBuilder.powerPerSecond(800)});

      CIRNO = new SlimefunItemStack("CIRNO", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWJmMzk2ODllYzI2MzA0YzRlYTk5ZGFjMWE1NjEyZDE3NWViMDJjZjhiYThjODI1OGM1ZmY5MzYxZDUzOGJhYiJ9fX0="
    		  , "&bCirno, the ice fairy", "", "&aMachine Skin: &fFreezer", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(18));

      CIRNO_2 = new SlimefunItemStack("CIRNO_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWJmMzk2ODllYzI2MzA0YzRlYTk5ZGFjMWE1NjEyZDE3NWViMDJjZjhiYThjODI1OGM1ZmY5MzYxZDUzOGJhYiJ9fX0="
    		  , "&bCirno, the ice fairy &7- &eII", "", "&aMachine Skin: &fFreezer", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(30));

      CIRNO_2_2 = new SlimefunItemStack("CIRNO_2_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWJmMzk2ODllYzI2MzA0YzRlYTk5ZGFjMWE1NjEyZDE3NWViMDJjZjhiYThjODI1OGM1ZmY5MzYxZDUzOGJhYiJ9fX0="
    		  , "&bCirno, the ice fairy &7- &eII", "", "&aMachine Skin: &fFreezer", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(30));

      ULTIMATE_CORE = new SlimefunItemStack("ULTIMATE_CORE", Material.RED_NETHER_BRICKS, "&4Ultimate Core", new String[]{"", "&4&oUltimate Being"});
      SHULKER_MIND = new SlimefunItemStack("SHULKER_MIND", Material.PURPLE_WOOL, "&5Shulker Mind", new String[0]);
      STEEL_CYLINDER = new SlimefunItemStack("STEEL_CYLINDER", Material.HOPPER, "&7Steel Cylinder", new String[0]);
      FOLDED_STEEL_PLATE = new SlimefunItemStack("FOLDED_STEEL_PLATE", Material.GRAY_CARPET, "&7Folded Steel Plate", new String[0]);
      WEEB_INGOT = new SlimefunItemStack("WEEB_INGOT", Material.IRON_INGOT, "&dWeeb &7Ingot", new String[]{"", "&7&oWibu lu"});
      WOOD_RESIN = new SlimefunItemStack("WOOD_RESIN", Material.ORANGE_WOOL, "&eWood Resin", new String[0]);
      MUSKET_HANDLE = new SlimefunItemStack("MUSKET_HANDLE", Material.STICK, "&bMusket Handle", new String[0]);
      MUSKET_MECHANISM = new SlimefunItemStack("MUSKET_MECHANISM", Material.DISPENSER, "&bMusket Mechanism", new String[0]);
      MUSKET = new SlimefunItemStack("MUSKET", Material.IRON_HOE, "&6Musket", new String[]{"", "&aRight click to shoot", "&9Require musket ball", "", "&7When shoot:", " &220 Attack Damage", " &21.0 Attack Speed"});
      ItemMeta musketmeta = MUSKET.getItemMeta();
      musketmeta.setUnbreakable(true);
      musketmeta.addItemFlags(new ItemFlag[]{ItemFlag.HIDE_ATTRIBUTES});
      MUSKET.setItemMeta(musketmeta);

      MUSKET_BALL = new SlimefunItemStack("MUSKET_BALL", Material.STONE_BUTTON, "&fMusket Ball", new String[]{"", "&9Ammo"});

       KATANA = new SlimefunItemStack(
               "KATANA",
               Material.IRON_SWORD,
               "&7Katana",
               new String[]{
                       "",
                       "&d&oPedang tajam dari jepang",
                       "",
                       "&7When in Main Hand:",
                       " &26 Attack Damage",
                       " &210.0 Attack Speed"
               }
       );

       setupTool(KATANA, "katana", 6.0D, 6.0D, false);


       SUSPICIOUS_LOOKING_PEARL = new SlimefunItemStack("SUSPICIOUS_LOOKING_PEARL", Material.ENDER_PEARL, "&1Suspicious Looking Pearl", new String[]{"", "&9Right click to Summon Ender King"});
       VOID_ESSENCE = new SlimefunItemStack("VOID_ESSENCE", Material.FLINT, "&8Void Essence", new String[0]);
       VOID_DUST = new SlimefunItemStack("VOID_DUST", Material.GUNPOWDER, "&8Void Dust", new String[0]);
       VOID_INGOT = new SlimefunItemStack("VOID_INGOT", Material.NETHERITE_INGOT, "&8Void Ingot", new String[]{"", "&7&oVoid Power"});


       VOID_BLADE = new SlimefunItemStack(
               "VOID_BLADE",
               Material.STONE_SWORD,
               "&8Void Blade",
               new String[]{
                       "",
                       "&9Right click to Summon Jaws",
                       "",
                       "&7&oVoid Power",
                       "",
                       "&7When in Main Hand:",
                       " &210 Attack Damage",
                       " &21.8 Attack Speed"
               }
       );

       setupTool(VOID_BLADE, "void_blade", 10.0D, -2.2D, true);

       VOID_OBSIDIAN_DRILL = new SlimefunItemStack(
               "VOID_OBSIDIAN_DRILL",
               Material.DIAMOND_PICKAXE,
               "&5Void &8Obsidian Drill",
               new String[]{
                       "",
                       "&9+ Can only mine obsidian",
                       "",
                       "&7&oVoid Power",
                       "",
                       "&7When in Main Hand:",
                       " &27 Attack Damage",
                       " &21.2 Attack Speed"
               }
       );

       VOID_OBSIDIAN_DRILL.addUnsafeEnchantment(Enchantment.EFFICIENCY, 20);
       setupTool(VOID_OBSIDIAN_DRILL, "void_obsidian_drill", 7.0D, -2.8D, true);

       VOID_STONE_DRILL = new SlimefunItemStack(
               "VOID_STONE_DRILL",
               Material.IRON_PICKAXE,
               "&5Void &7Stone Drill",
               new String[]{
                       "",
                       "&9+ Can only mine stone",
                       "",
                       "&7&oVoid Power",
                       "",
                       "&7When in Main Hand:",
                       " &27 Attack Damage",
                       " &21.2 Attack Speed"
               }
       );

       VOID_STONE_DRILL.addUnsafeEnchantment(Enchantment.EFFICIENCY, 10);
       setupTool(VOID_STONE_DRILL, "void_stone_drill", 7.0D, -2.8D, true);



       VOID_SHIELD = new SlimefunItemStack(
               "VOID_SHIELD",
               Material.SHIELD,
               "&5Void Shield",
               new String[]{
                       "",
                       "&7&oVoid Power",
                       "",
                       "&7When in Off Hand:",
                       " &2+12 Health"
               }
       );
       setupOffhand(VOID_SHIELD, "void_obsidian_drill", 12.0D, 0.0D, 0.0D, true);



       GOLD_RING = new SlimefunItemStack("GOLD_RING", Material.GOLD_NUGGET, "&fGold Ring", new String[0]);
      SILVER_RING = new SlimefunItemStack("SILVER_RING", Material.IRON_NUGGET, "&fSilver Ring", new String[0]);
      GOLD_RING_24K = new SlimefunItemStack("GOLD_RING_24K", Material.GOLD_NUGGET, "&fGold Ring 24K", new String[0]);
      NETHERITE_RING = new SlimefunItemStack("NETHERITE_RING", Material.STONE_BUTTON, "&8Netherite Ring", new String[0]);
      ENDERITE_RING = new SlimefunItemStack("ENDERITE_RING", Material.POLISHED_BLACKSTONE_BUTTON, "&5Enderite Ring", new String[0]);

      OBSIDIAN_GEM = new SlimefunItemStack("OBSIDIAN_GEM", Material.BLACK_STAINED_GLASS_PANE, "&8Obsidian Gem", new String[0]);
      DRAGON_GEM = new SlimefunItemStack("DRAGON_GEM", Material.ORANGE_STAINED_GLASS_PANE, "&6Dragon Gem", new String[0]);
      GUARDIAN_GEM = new SlimefunItemStack("GUARDIAN_GEM", Material.LIME_STAINED_GLASS_PANE, "&aGuardian Gem", new String[0]);
      VOID_GEM = new SlimefunItemStack("VOID_GEM", Material.PURPLE_STAINED_GLASS_PANE, "&5Void Gem", new String[0]);
      VAMPIRE_GEM = new SlimefunItemStack("VAMPIRE_GEM", Material.RED_STAINED_GLASS_PANE, "&4Vampire Gem", new String[0]);
      FROST_GEM = new SlimefunItemStack("FROST_GEM", Material.LIGHT_BLUE_STAINED_GLASS_PANE, "&bFrost Gem", new String[0]);



       DIAMOND_RING = new SlimefunItemStack(
               "DIAMOND_RING",
               Material.GOLD_NUGGET,
               "&fDiamond Ring",
               new String[]{"", "&7When in Off Hand:", " &2+4 Max Health"}
       );
       setupOffhand(DIAMOND_RING, "diamond_ring", 4, 0, 0, true);

       SAPPHIRE_RING = new SlimefunItemStack(
               "SAPPHIRE_RING",
               Material.GOLD_NUGGET,
               "&1Sapphire Ring",
               new String[]{"", "&7When in Off Hand:", " &2+2 Attack Damage"}
       );
       setupOffhand(SAPPHIRE_RING, "sapphire_ring", 0, 2, 0, true);

       NETHER_RING = new SlimefunItemStack(
               "NETHER_RING",
               Material.GOLD_NUGGET,
               "&6Nether Ring",
               new String[]{"", "&9Burn target when hit", "", "&7When in Off Hand:", " &2+3 Attack Damage"}
       );
       setupOffhand(NETHER_RING, "nether_ring", 0, 3, 0, true);

       OBSIDIAN_RING = new SlimefunItemStack(
               "OBSIDIAN_RING",
               Material.GOLD_NUGGET,
               "&8Obsidian Ring",
               new String[]{"", "&7When in Off Hand:", " &2+3 Max Health", " &2+4 Knockback Resistance"}
       );
       setupOffhand(OBSIDIAN_RING, "obsidian_ring", 3, 0, 0.4, true);

       DRAGON_RING = new SlimefunItemStack(
               "DRAGON_RING",
               Material.GOLD_NUGGET,
               "&eDragon Ring",
               new String[]{"", "&7When in Off Hand:", " &2+5 Attack Damage"}
       );
       setupOffhand(DRAGON_RING, "dragon_ring", 0, 5, 0, true);

       GUARDIAN_RING = new SlimefunItemStack(
               "GUARDIAN_RING",
               Material.GOLD_NUGGET,
               "&aGuardian Ring",
               new String[]{"", "&7When in Off Hand:", " &2+12 Max Health"}
       );
       setupOffhand(GUARDIAN_RING, "guardian_ring", 12, 0, 0, true);

       VOID_RING = new SlimefunItemStack(
               "VOID_RING",
               Material.GOLD_NUGGET,
               "&5Void Ring",
               new String[]{"", "&9Apply poison when hit", "&9Apply wither when hit", "", "&7When in Off Hand:", " &2+7 Attack Damage"}
       );
       setupOffhand(VOID_RING, "void_ring", 0, 7, 0, true);

       VAMPIRE_RING = new SlimefunItemStack(
               "VAMPIRE_RING",
               Material.GOLD_NUGGET,
               "&dVampire Ring",
               new String[]{"", "&9Apply regen to self when hit", "", "&7When in Off Hand:", " &2+15 Max Health"}
       );
       setupOffhand(VAMPIRE_RING, "vampire_ring", 15, 0, 0, true);

       FROST_RING = new SlimefunItemStack(
               "FROST_RING",
               Material.GOLD_NUGGET,
               "&bFrost Ring",
               new String[]{"", "&9Apply mining fatigue and slow when hit", "&9Remove mining fatigue and slow when hitted", "", "&7When in Off Hand:", " &2+4 Attack Damage"}
       );
       setupOffhand(FROST_RING, "frost_ring", 0, 4, 0, true);





       UNIDENTIFIED_ARTIFACT = new SlimefunItemStack("UNIDENTIFIED_ARTIFACT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmMyNzEwNTI3MTllZjY0MDc5ZWU4YzE0OTg5NTEyMzhhNzRkYWM0YzI3Yjk1NjQwZGI2ZmJkZGMyZDZiNWI2ZSJ9fX0=", "&fUnidentified Artifact", new String[]{"", "&1&oLost in time"});
      BASIC_ARTIFACT = new SlimefunItemStack("BASIC_ARTIFACT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjUxZTAyZGE3OTM2NTNhMjVhODY5N2IyZmMwZWRjN2EyNmE3ODBjOGIzMTdiODI2MTZlMmMzNGQ5NGJlYmFkNCJ9fX0=", "&fBasic Artifact", new String[]{"", "&1&oLost in time"});
      TECH_ARTIFACT = new SlimefunItemStack("TECH_ARTIFACT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGQ0MmJiMzM5MWIzOTY0ZGUyNjZkOWJlYmU3Y2NmN2VmM2MzOTA2MjZlYjdhODQ1NjEyYWQ5MGYzZmE0MmMxMiJ9fX0=", "&bTech Artifact", new String[]{"", "&1&oLost in time"});
      ANCIENT_ARTIFACT = new SlimefunItemStack("ANCIENT_ARTIFACT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2EzNmIzZmIyMzhlOWYyY2Y4MmU5YmExYzMwMzRiOTY5ZmY5NWQzOGQ4ZDE1MTY4ZDQzZDQ2NjQ1MzE2NCJ9fX0=", "&eAncient Artifact", new String[]{"", "&1&oLost in time"});
      NATURE_ARTIFACT = new SlimefunItemStack("NATURE_ARTIFACT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzM4YjBiMGYxZjM1YzU2YjdkNjRlMGUyYjk2NjE4MDFmOTEyZjMxOGZhOWM4YzFkODNlOTE3ZGI0ZjJlNjUyMSJ9fX0=", "&aNature Artifact", new String[]{"", "&1&oLost in time"});

      ARTIFACT_PICKAXE = new SlimefunItemStack("ARTIFACT_PICKAXE", Material.IRON_PICKAXE, "&1Artifact Pickaxe", new String[]{"", "&9+ Destroying endstone have chance to", "&9summon artifact mobs", "", "&7When in Main Hand:", " &27.5 Attack Damage", " &21.2 Attack Speed"});
       setupTool(ARTIFACT_PICKAXE, "artifact_pickaxe", 7.5D, -2.8D, false);

      ARTIFACT_SCANNER = new SlimefunItemStack("ARTIFACT_SCANNER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjc0NGFkYjAxYTkwZTQ2OTAyZDg4NTFiZWI3Y2RmZmQwODA3OTI5MDljZjQ0YmE0NmQzMzc0Yzg2MTVhOTI1OSJ9fX0="
    		  , "&9Artifact Scanner", new String[]{"", "&fMengidentifikasi Artefak", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerBuffer(48000), LoreBuilder.powerPerSecond(1600)});

      ARTIFACT_SCANNER_2 = new SlimefunItemStack("ARTIFACT_SCANNER_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjc0NGFkYjAxYTkwZTQ2OTAyZDg4NTFiZWI3Y2RmZmQwODA3OTI5MDljZjQ0YmE0NmQzMzc0Yzg2MTVhOTI1OSJ9fX0="
    		  , "&9Artifact Scanner &7- &eII", new String[]{"", "&fMengidentifikasi Artefak", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3.0F), LoreBuilder.powerBuffer(128000), LoreBuilder.powerPerSecond(1600)});

      TASER = new SlimefunItemStack("TASER", Material.IRON_HOE, "&9Taser", new String[]{"", "&aRight click to shoot", "",  "&1&oLost in time", "", "&7When shoot:", " &2Apply Slow 5 for 10 Second", " &21.0 Attack Speed"});
      ItemMeta tasermeta = TASER.getItemMeta();
      tasermeta.setUnbreakable(true);
      tasermeta.addItemFlags(new ItemFlag[]{ItemFlag.HIDE_ATTRIBUTES});
      TASER.setItemMeta(tasermeta);

      SNIPER_RIFLE = new SlimefunItemStack("SNIPER_RIFLE", Material.IRON_HOE, "&6Sniper Rifle", new String[]{"", "&aRight click to shoot", "&aLeft click to aim", "&9Require musket ball", "",  "&1&oLost in time", "", "&7When shoot:", " &250.0 Attack Damage", " &20.5 Attack Speed"});
      ItemMeta snipermeta = SNIPER_RIFLE.getItemMeta();
      snipermeta.setUnbreakable(true);
      snipermeta.addItemFlags(new ItemFlag[]{ItemFlag.HIDE_ATTRIBUTES});
      SNIPER_RIFLE.setItemMeta(snipermeta);

      ASSAULT_RIFLE = new SlimefunItemStack("ASSAULT_RIFLE", Material.IRON_HOE, "&4Assault Rifle", new String[]{"", "&aRight click to shoot", "&9Require musket ball", "&9Shoot 3 at a same time", "",  "&1&oLost in time", "", "&7When shoot:", " &210.0 Attack Damage", " &22.0 Attack Speed"});
      ItemMeta assaultmeta = ASSAULT_RIFLE.getItemMeta();
      assaultmeta.setUnbreakable(true);
      assaultmeta.addItemFlags(new ItemFlag[]{ItemFlag.HIDE_ATTRIBUTES});
      ASSAULT_RIFLE.setItemMeta(assaultmeta);

      MONOCHROME_SHOOTER = new SlimefunItemStack("MONOCHROME_SHOOTER", Material.BOW, "&5Monochrome &cShooter", new String[]{"", "&9Any Arrows fired using this Bow", "&9will apply death mark for 3 seconds.", "",  "&1&oLost in time"});
      ItemMeta monometa = MONOCHROME_SHOOTER.getItemMeta();
      monometa.setUnbreakable(true);
      MONOCHROME_SHOOTER.setItemMeta(monometa);

      BLOWPIPE = new SlimefunItemStack("BLOWPIPE", Material.WOODEN_HOE, "&4Blowpipe", new String[]{"", "&aRight click to shoot", "&9Require arrow", "&9Apply Poison 2 for 30 seconds to enemy", "",  "&1&oLost in time", "", "&7When shoot:", " &25.0 Attack Damage", " &21.0 Attack Speed"});
      ItemMeta blowmeta = BLOWPIPE.getItemMeta();
      blowmeta.setUnbreakable(true);
      blowmeta.addItemFlags(new ItemFlag[]{ItemFlag.HIDE_ATTRIBUTES});
      BLOWPIPE.setItemMeta(blowmeta);

      BLADE_OF_GRASS = new SlimefunItemStack("BLADE_OF_GRASS", Material.WOODEN_SWORD, "&aBlade Of Grass", new String[]{"", "&aRight click to apply speed 3 for 30s", "",  "&1&oLost in time", "", "&7When in Main Hand:", " &28 Attack Damage", " &21.8 Attack Speed"});
       setupTool(BLADE_OF_GRASS, "blade_of_grass", 8.0D, -2.2D, true);

      MIDAS_BLADE = new SlimefunItemStack("MIDAS_BLADE", Material.GOLDEN_SWORD, "&eMidas Blade", new String[]{"", "&9Drop gold ingot when defeating enemy.", "",  "&1&oLost in time", "", "&7When in Main Hand:", " &27 Attack Damage", " &21.6 Attack Speed"});
       setupTool(MIDAS_BLADE, "midas_blade", 7.0D, -2.4D, true);

      NATUR_AL_SALASTUS = new SlimefunItemStack("NATUR_AL_SALASTUS", Material.DIAMOND_SWORD, "&2Natur &aAl'Salastus", new String[]{"", "&aRight click to apply the folowing effect:", "&9when you deal damage using melee, double the damage", "&9and remove this effect. 5 seconds cooldown.", "",  "&1&oLost in time", "", "&7When in Main Hand:", " &210 Attack Damage", " &22.0 Attack Speed"});
       setupTool(NATUR_AL_SALASTUS, "natur_al_salastus", 10.0D, -2D, true);

      ANCIENT_RING = new SlimefunItemStack("ANCIENT_RING", Material.GOLD_NUGGET, "&6Ancient Ring", new String[]{"",  "&1&oLost in time", "", "&7When in Off Hand:", " &2+8.0 Attack Damage", " &2+15 Health"});
       setupOffhand(ANCIENT_RING, "ancient_ring", 15, 8, 0, true);


      ANCIENT_HELMET = new SlimefunItemStack("ANCIENT_HELMET", Material.LEATHER_HELMET, Color.fromRGB(246, 131, 14), "&cAncient Helmet", new String[]{"", "&6Full set effects:", "&e- Creeper Explosion Immunity", "&e- TNT Explosion Immunity", "&e- Fire and Lava Immunity", "", "&1&oLost in time"});
       setupArmor(ANCIENT_HELMET, "ancient_helmet", 3.0D, 3.0D, 0.15D, 4.0D, EquipmentSlotGroup.HEAD, true);

      ANCIENT_CHESTPLATE = new SlimefunItemStack("ANCIENT_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.fromRGB(246, 131, 14), "&cAncient Chestplate", new String[]{"", "&6Full set effects:", "&e- Creeper Explosion Immunity", "&e- TNT Explosion Immunity", "&e- Fire and Lava Immunity", "", "&1&oLost in time"});
       setupArmor(ANCIENT_CHESTPLATE, "ancient_chestplate", 8.0D, 3.0D, 0.15D, 4.0D, EquipmentSlotGroup.CHEST, true);

      ANCIENT_LEGGINGS = new SlimefunItemStack("ANCIENT_LEGGINGS", Material.LEATHER_LEGGINGS, Color.fromRGB(246, 131, 14), "&cAncient Leggings", new String[]{"", "&6Full set effects:", "&e- Creeper Explosion Immunity", "&e- TNT Explosion Immunity", "&e- Fire and Lava Immunity", "", "&1&oLost in time"});
       setupArmor(ANCIENT_LEGGINGS, "ancient_leggings", 6.0D, 3.0D, 0.15D, 4.0D, EquipmentSlotGroup.LEGS, true);

      ANCIENT_BOOTS = new SlimefunItemStack("ANCIENT_BOOTS", Material.LEATHER_BOOTS, Color.fromRGB(246, 131, 14), "&cAncient Boots", new String[]{"", "&6Full set effects:", "&e- Creeper Explosion Immunity", "&e- TNT Explosion Immunity", "&e- Fire and Lava Immunity", "", "&1&oLost in time"});
       setupArmor(ANCIENT_BOOTS, "ancient_boots", 3.0D, 3.0D, 0.15D, 4.0D, EquipmentSlotGroup.FEET, true);

      VOID_PLATE = new SlimefunItemStack("VOID_PLATE", Material.POLISHED_BLACKSTONE_PRESSURE_PLATE, "&8Void Plate", new String[]{"", "&1&oLost in time"});
       setupEnchanted(VOID_PLATE);

      BIFURCATING_COMPONENT = new SlimefunItemStack("BIFURCATING_COMPONENT", Material.STRING, "&fBifurcating Component", new String[] {"", "&1&oLost in time"});
      ARTIFACT_CIRCUIT_BOARD = new SlimefunItemStack("ARTIFACT_CIRCUIT_BOARD", Material.RAIL, "&9Artifact Circuit Board", new String[] {"", "&1&oLost in time"});
       setupEnchanted(ARTIFACT_CIRCUIT_BOARD);

      ARTIFACT_POWER_CORE = new SlimefunItemStack("ARTIFACT_POWER_CORE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2JmYjQxZjg2NmU3ZThlNTkzNjU5OTg2YzlkNmU4OGNkMzc2NzdiM2Y3YmQ0NDI1M2U1ODcxZTY2ZDFkNDI0In19fQ==", "&eArtifact Power Core", new String[] {"", "&1&oLost in time"});
      ANCIENT_COMPONENT = new SlimefunItemStack("ANCIENT_COMPONENT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjhmZTU5MzViMmIzMjAyOWZiODY2ZTFhOTY2ODNmOWI4MDhkMzVkZDljZDNhNzY5NDU1MzRkYmQwZWM0MWNhOSJ9fX0=", "&6Ancient Component", new String[] {"", "&1&oLost in time"});
      NATURE_COMPONENT = new SlimefunItemStack("NATURE_COMPONENT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjNhNThiZWM2NTY2OGI2ODJhYmFiMzYxMzAwYTljNDEzM2JiNmMwNmRiODg0NzIxMGE2MmI4ODRlZTZmYmM3ZCJ9fX0=", "&aNature Component", new String[] {"", "&1&oLost in time"});
      TECH_COMPONENT = new SlimefunItemStack("TECH_COMPONENT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmQzNzI4NTc5MzEzMWVkNzU1ZjFiMDA5OGYyOWRkNDEzZDY3NjU2YjYyMDg3Mjg5MzU0OTJiNDliMWQwZDRiYSJ9fX0=", "&bTech Component", new String[] {"", "&1&oLost in time"});

      FERTILE_SOIL = new SlimefunItemStack("FERTILE_SOIL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzYwODk1ZjIzYTYxZGNmYWQzMzliOTJmMmQxNzI5ZDEzNTI4YTg2YjJjYTUyNjdjYTlkZmRmYWU4ZWRkZmZjZCJ9fX0=", "&fFertile Soil", new String[0]);
      ARTIFICIAL_SOIL = new SlimefunItemStack("ARTIFICIAL_SOIL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjAzMjM5ZjcwYTNjMjUzNThiMjJhMjliZTFiZmQxYjk4NWVlOTVmMjg2MzQ4YjRlMGYyMmYzNDc0MDk4MjViOCJ9fX0=", "&bArtificial Soil", new String[0]);
      ARTIFICIAL_HARVESTER = new SlimefunItemStack("ARTIFICIAL_HARVESTER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjk4Njc5NDUyMTg2OWU4MzI3ZWY4MWRiYzM1Yzk4NTZiYzQwNTFkZjk4ODhkODFlYWIyMTI0NDJiMTc2YTgyZiJ9fX0=", "&bArtificial Harvester", new String[0]);
      CROPS_MOTOR = new SlimefunItemStack("CROPS_MOTOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWI5YWM1OWY4YTUyZDE5MzEyODIwMDdmNzZlMmIwNWNkNjg0ZTA1ODY4NWU0OTU0NTc4OGQ0MTcyZDEyOWVlMCJ9fX0=", "&aCrops Motor", new String[0]);

      ARTIFICIAL_TREE_OAK = new SlimefunItemStack("ARTIFICIAL_TREE_OAK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTdiMjQ1ZjNmMTUwYmE2MjE2NzU5MTZhMjlkMDA2OTA5OTBkZGQ4ZGU2MDMyOTNkZDJmNWY4MDA3MGEyOTA4In19fQ=="
    		  , "&aArtificial Tree &e[Oak]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_TREE_BIRCH = new SlimefunItemStack("ARTIFICIAL_TREE_BIRCH", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmYxMjBiZGQwNDdlNWU1ZGVlZDkzYzU3ZjhmZDE1Y2JkMGZjOWRhZDBmZmYwMWIxYjY3MzMyMGFhZmVhMGY5In19fQ=="
    		  , "&aArtificial Tree &e[Birch]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_TREE_SPRUCE = new SlimefunItemStack("ARTIFICIAL_TREE_SPRUCE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjdmYTY0YmJiNGJkNTE0Zjc5ZDdlYTQzNGI1MGMwYmQzNDJkOWY4MDdiZTllMTA4NDZkMGU4NTA1MTY2MzlmYyJ9fX0="
    		  , "&aArtificial Tree &e[Spruce]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_TREE_JUNGLE = new SlimefunItemStack("ARTIFICIAL_TREE_JUNGLE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzg3YzMzNTQ1NDNiNjUyNGUzMDUzOTQ0ZjZmOTNmNTFjMjc0M2Q5ODk4NjY5M2I3NjY5MmFiMGVmNjYxZTliZiJ9fX0="
    		  , "&aArtificial Tree &e[Jungle]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_TREE_ACACIA = new SlimefunItemStack("ARTIFICIAL_TREE_ACACIA", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTExMjRkYmE3NjZkN2Q2MGNlYWRmMGU0NDVjMGViMDZmOTQ0YmIzMDNjZjhmYTI3YzI0NWZmZWQ4YTgzZjQxOCJ9fX0="
    		  , "&aArtificial Tree &e[Acacia]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_TREE_DARK_OAK = new SlimefunItemStack("ARTIFICIAL_TREE_DARK_OAK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWI5MzMzNjEwYjRkNWM1MDI1MTQzNTA1MmIzOWUwNzIzZjc4YjY4YzExNDYyM2I1ODcyMDJjMjhmNWViYWZkMCJ9fX0="
    		  , "&aArtificial Tree &e[Dark Oak]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_TREE_CRIMSON = new SlimefunItemStack("ARTIFICIAL_TREE_CRIMSON", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWIyMDY0MzkwZTc5ZDllNTRjY2I0MThiMDczMzE1M2NmOTkyM2ZjNGE4ZDE0YWIxZDJiN2VmNTk2ODgzMWM5MyJ9fX0="
    		  , "&aArtificial Tree &e[Crimson]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_TREE_WARPED = new SlimefunItemStack("ARTIFICIAL_TREE_WARPED", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDUzZWJiZmU4NjIwYmI5OGUyZjQzYzE0MTZkZDdlYmMxMjZjYTQxZGNmZjg5N2VkZTM0YjA0ZmM5ZWUzMDM2ZSJ9fX0="
    		  , "&aArtificial Tree &e[Warped]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_TREE_APPLE = new SlimefunItemStack("ARTIFICIAL_TREE_APPLE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWFlNTMyY2ZiNWFhNjhlOGE3MDQwYjY5MTczZTFmN2JjMGRkNGE0NzFkNzNkYTk1MWVhNjg1YmRiZTRkNGVlNiJ9fX0="
    		  , "&aArtificial Tree &e[Apple]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
       ARTIFICIAL_TREE_MANGROVE = new SlimefunItemStack("ARTIFICIAL_TREE_MANGROVE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTdlMTI1NTE5YjMwOWNiYjczNGQyZDJhNjFlMTNlY2MwODYwMWM5NGQ2OTNmODZjOGI2NjhmZTcxN2RkN2VjIn19fQ=="
               , "&aArtificial Tree &e[Mangrove]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
       ARTIFICIAL_TREE_CHERRY = new SlimefunItemStack("ARTIFICIAL_TREE_CHERRY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmQwZTc3ODU1ZDg1Yjk0OTg3YmQzNTJhYWUxNmM2N2M5NTY0OTg2MzM2OWIxYjZjMzYzNjI3NTVhNjRhMTIxNCJ9fX0="
               , "&aArtificial Tree &e[Cherry]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
       ARTIFICIAL_TREE_PALE_OAK = new SlimefunItemStack("ARTIFICIAL_TREE_PALE_OAK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzYzOTJkMDQxNmZiNGE2YTk0N2JkMzYyMzkwOGMyMjU4MTI3NWZjY2YyYzczNmYwNjkyZjFiMGQ2MGU2ODY4In19fQ=="
               , "&aArtificial Tree &e[Pale Oak]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));

      ARTIFICIAL_TREE_OAK_2 = new SlimefunItemStack("ARTIFICIAL_TREE_OAK_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTdiMjQ1ZjNmMTUwYmE2MjE2NzU5MTZhMjlkMDA2OTA5OTBkZGQ4ZGU2MDMyOTNkZDJmNWY4MDA3MGEyOTA4In19fQ=="
    		  , "&aArtificial Tree &e[Oak] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_TREE_BIRCH_2 = new SlimefunItemStack("ARTIFICIAL_TREE_BIRCH_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmYxMjBiZGQwNDdlNWU1ZGVlZDkzYzU3ZjhmZDE1Y2JkMGZjOWRhZDBmZmYwMWIxYjY3MzMyMGFhZmVhMGY5In19fQ=="
    		  , "&aArtificial Tree &e[Birch] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_TREE_SPRUCE_2 = new SlimefunItemStack("ARTIFICIAL_TREE_SPRUCE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjdmYTY0YmJiNGJkNTE0Zjc5ZDdlYTQzNGI1MGMwYmQzNDJkOWY4MDdiZTllMTA4NDZkMGU4NTA1MTY2MzlmYyJ9fX0="
    		  , "&aArtificial Tree &e[Spruce] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_TREE_JUNGLE_2 = new SlimefunItemStack("ARTIFICIAL_TREE_JUNGLE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzg3YzMzNTQ1NDNiNjUyNGUzMDUzOTQ0ZjZmOTNmNTFjMjc0M2Q5ODk4NjY5M2I3NjY5MmFiMGVmNjYxZTliZiJ9fX0="
    		  , "&aArtificial Tree &e[Jungle] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_TREE_ACACIA_2 = new SlimefunItemStack("ARTIFICIAL_TREE_ACACIA_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTExMjRkYmE3NjZkN2Q2MGNlYWRmMGU0NDVjMGViMDZmOTQ0YmIzMDNjZjhmYTI3YzI0NWZmZWQ4YTgzZjQxOCJ9fX0="
    		  , "&aArtificial Tree &e[Acacia] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_TREE_DARK_OAK_2 = new SlimefunItemStack("ARTIFICIAL_TREE_DARK_OAK_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWI5MzMzNjEwYjRkNWM1MDI1MTQzNTA1MmIzOWUwNzIzZjc4YjY4YzExNDYyM2I1ODcyMDJjMjhmNWViYWZkMCJ9fX0="
    		  , "&aArtificial Tree &e[Dark Oak] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_TREE_CRIMSON_2 = new SlimefunItemStack("ARTIFICIAL_TREE_CRIMSON_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWIyMDY0MzkwZTc5ZDllNTRjY2I0MThiMDczMzE1M2NmOTkyM2ZjNGE4ZDE0YWIxZDJiN2VmNTk2ODgzMWM5MyJ9fX0="
    		  , "&aArtificial Tree &e[Crimson] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_TREE_WARPED_2 = new SlimefunItemStack("ARTIFICIAL_TREE_WARPED_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDUzZWJiZmU4NjIwYmI5OGUyZjQzYzE0MTZkZDdlYmMxMjZjYTQxZGNmZjg5N2VkZTM0YjA0ZmM5ZWUzMDM2ZSJ9fX0="
    		  , "&aArtificial Tree &e[Warped] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_TREE_APPLE_2 = new SlimefunItemStack("ARTIFICIAL_TREE_APPLE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWFlNTMyY2ZiNWFhNjhlOGE3MDQwYjY5MTczZTFmN2JjMGRkNGE0NzFkNzNkYTk1MWVhNjg1YmRiZTRkNGVlNiJ9fX0="
    		  , "&aArtificial Tree &e[Apple] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
       ARTIFICIAL_TREE_MANGROVE_2 = new SlimefunItemStack("ARTIFICIAL_TREE_MANGROVE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTdlMTI1NTE5YjMwOWNiYjczNGQyZDJhNjFlMTNlY2MwODYwMWM5NGQ2OTNmODZjOGI2NjhmZTcxN2RkN2VjIn19fQ=="
               , "&aArtificial Tree &e[Mangrove] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
       ARTIFICIAL_TREE_CHERRY_2 = new SlimefunItemStack("ARTIFICIAL_TREE_CHERRY_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmQwZTc3ODU1ZDg1Yjk0OTg3YmQzNTJhYWUxNmM2N2M5NTY0OTg2MzM2OWIxYjZjMzYzNjI3NTVhNjRhMTIxNCJ9fX0="
               , "&aArtificial Tree &e[Cherry] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
       ARTIFICIAL_TREE_PALE_OAK_2 = new SlimefunItemStack("ARTIFICIAL_TREE_PALE_OAK_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzYzOTJkMDQxNmZiNGE2YTk0N2JkMzYyMzkwOGMyMjU4MTI3NWZjY2YyYzczNmYwNjkyZjFiMGQ2MGU2ODY4In19fQ=="
               , "&aArtificial Tree &e[Pale Oak] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));


      ARTIFICIAL_CROPS_WHEAT = new SlimefunItemStack("ARTIFICIAL_CROPS_WHEAT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Wheat]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_POTATO = new SlimefunItemStack("ARTIFICIAL_CROPS_POTATO", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Potato]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_CARROT = new SlimefunItemStack("ARTIFICIAL_CROPS_CARROT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Carrot]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_BEETROOT = new SlimefunItemStack("ARTIFICIAL_CROPS_BEETROOT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Beetroot]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_MELON = new SlimefunItemStack("ARTIFICIAL_CROPS_MELON", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Melon]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_PUMPKIN = new SlimefunItemStack("ARTIFICIAL_CROPS_PUMPKIN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Pumpkin]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));

      ARTIFICIAL_CROPS_WHEAT_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_WHEAT_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Wheat] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_POTATO_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_POTATO_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Potato] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_CARROT_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_CARROT_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Carrot] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_BEETROOT_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_BEETROOT_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Beetroot] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_MELON_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_MELON_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Melon] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_PUMPKIN_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_PUMPKIN_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Pumpkin] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));

      ARTIFICIAL_CROPS_SWEET_BERRIES = new SlimefunItemStack("ARTIFICIAL_CROPS_SWEET_BERRIES", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Sweet Berries]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
       ARTIFICIAL_CROPS_GLOW_BERRIES = new SlimefunItemStack("ARTIFICIAL_CROPS_GLOW_BERRIES", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
               , "&aArtificial Crops &e[Glow Berries]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_KELP = new SlimefunItemStack("ARTIFICIAL_CROPS_KELP", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Kelp]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_BAMBOO = new SlimefunItemStack("ARTIFICIAL_CROPS_BAMBOO", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Bamboo]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_SUGAR_CANE = new SlimefunItemStack("ARTIFICIAL_CROPS_SUGAR_CANE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Sugar Cane]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_CHORUS_FRUIT = new SlimefunItemStack("ARTIFICIAL_CROPS_CHORUS_FRUIT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Chorus Fruit]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_NETHER_WARTS = new SlimefunItemStack("ARTIFICIAL_CROPS_NETHER_WARTS", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Nether Warts]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_CACTUS = new SlimefunItemStack("ARTIFICIAL_CROPS_CACTUS", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Cactus]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_COCOA_BEANS = new SlimefunItemStack("ARTIFICIAL_CROPS_COCOA_BEANS", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Cocoa Beans]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));

      ARTIFICIAL_CROPS_SWEET_BERRIES_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_SWEET_BERRIES_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Sweet Berries] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
       ARTIFICIAL_CROPS_GLOW_BERRIES_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_GLOW_BERRIES_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
               , "&aArtificial Crops &e[Glow Berries] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
       ARTIFICIAL_CROPS_KELP_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_KELP_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Kelp] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_BAMBOO_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_BAMBOO_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Bamboo] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_SUGAR_CANE_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_SUGAR_CANE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Sugar Cane] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_CHORUS_FRUIT_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_CHORUS_FRUIT_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Chorus Fruit] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_NETHER_WARTS_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_NETHER_WARTS_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Nether Warts] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_CACTUS_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_CACTUS_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Cactus] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_COCOA_BEANS_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_COCOA_BEANS_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWExZmJlZjNkMGM1MWFkNmM3MTNhYTIwYzQyZGIxODM0MzRjZWM0ZmI2M2E1YTNlYWExMDFhZDNjNWY3NWQxNSJ9fX0="
    		  , "&aArtificial Crops &e[Cocoa Beans] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));



      ARTIFICIAL_CROPS_COAL = new SlimefunItemStack("ARTIFICIAL_CROPS_COAL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Coal]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_IRON = new SlimefunItemStack("ARTIFICIAL_CROPS_IRON", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Iron]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_GOLD = new SlimefunItemStack("ARTIFICIAL_CROPS_GOLD", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Gold]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_COPPER = new SlimefunItemStack("ARTIFICIAL_CROPS_COPPER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Copper]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_ALUMINUM = new SlimefunItemStack("ARTIFICIAL_CROPS_ALUMINUM", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Aluminum]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_TIN = new SlimefunItemStack("ARTIFICIAL_CROPS_TIN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Tin]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_SILVER = new SlimefunItemStack("ARTIFICIAL_CROPS_SILVER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Silver]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_LEAD = new SlimefunItemStack("ARTIFICIAL_CROPS_LEAD", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Lead]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_REDSTONE = new SlimefunItemStack("ARTIFICIAL_CROPS_REDSTONE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Redstone]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(70));
      ARTIFICIAL_CROPS_LAPIS = new SlimefunItemStack("ARTIFICIAL_CROPS_LAPIS", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Lapis]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(70));
      ARTIFICIAL_CROPS_ENDER = new SlimefunItemStack("ARTIFICIAL_CROPS_ENDER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Ender]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(80));
      ARTIFICIAL_CROPS_QUARTZ = new SlimefunItemStack("ARTIFICIAL_CROPS_QUARTZ", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Quartz]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(70));
      ARTIFICIAL_CROPS_DIAMOND = new SlimefunItemStack("ARTIFICIAL_CROPS_DIAMOND", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Diamond]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(80));
      ARTIFICIAL_CROPS_EMERALD = new SlimefunItemStack("ARTIFICIAL_CROPS_EMERALD", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Emerald]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(80));
      ARTIFICIAL_CROPS_GLOWSTONE = new SlimefunItemStack("ARTIFICIAL_CROPS_GLOWSTONE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Glowstone]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(70));
      ARTIFICIAL_CROPS_OBSIDIAN = new SlimefunItemStack("ARTIFICIAL_CROPS_OBSIDIAN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Obsidian]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(80));
      ARTIFICIAL_CROPS_SLIME = new SlimefunItemStack("ARTIFICIAL_CROPS_SLIME", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Slime]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_MAGNESIUM = new SlimefunItemStack("ARTIFICIAL_CROPS_MAGNESIUM", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Magnesium]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_ZINC = new SlimefunItemStack("ARTIFICIAL_CROPS_ZINC", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Zinc]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));


      ARTIFICIAL_CROPS_COAL_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_COAL_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Coal] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_IRON_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_IRON_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Iron] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_CROPS_GOLD_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_GOLD_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Gold] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_CROPS_COPPER_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_COPPER_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Copper] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_CROPS_ALUMINUM_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_ALUMINUM_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Aluminum] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_CROPS_TIN_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_TIN_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Tin] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_CROPS_SILVER_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_SILVER_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Silver] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_CROPS_LEAD_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_LEAD_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Lead] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_CROPS_REDSTONE_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_REDSTONE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Redstone] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(140));
      ARTIFICIAL_CROPS_LAPIS_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_LAPIS_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Lapis] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(140));
      ARTIFICIAL_CROPS_ENDER_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_ENDER_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Ender] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(160));
      ARTIFICIAL_CROPS_QUARTZ_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_QUARTZ_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Quartz] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(160));
      ARTIFICIAL_CROPS_DIAMOND_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_DIAMOND_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Diamond] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(160));
      ARTIFICIAL_CROPS_EMERALD_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_EMERALD_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Emerald] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(160));
      ARTIFICIAL_CROPS_GLOWSTONE_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_GLOWSTONE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Glowstone] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(140));
      ARTIFICIAL_CROPS_OBSIDIAN_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_OBSIDIAN_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Obsidian] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(140));
      ARTIFICIAL_CROPS_SLIME_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_SLIME_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Slime] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_CROPS_MAGNESIUM_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_MAGNESIUM_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Magnesium] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_CROPS_ZINC_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_ZINC_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Zinc] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));


      ARTIFICIAL_CROPS_IRON_3 = new SlimefunItemStack("ARTIFICIAL_CROPS_IRON_3", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Iron] &7- &eIII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));
      ARTIFICIAL_CROPS_GOLD_3 = new SlimefunItemStack("ARTIFICIAL_CROPS_GOLD_3", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJkZjExNzNiNGZjMWFmMzYzMzQ1MjMyN2NlMjhiNGZjNDg1ZDE2MTIwZTE2NWE1MTljMmY3ODQ2MjQxIn19fQ=="
    		  , "&aArtificial Crops &e[Gold] &7- &eIII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(120));



      ARTIFICIAL_CROPS_GRAPE = new SlimefunItemStack("ARTIFICIAL_CROPS_GRAPE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Grape]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_BLUEBERRY = new SlimefunItemStack("ARTIFICIAL_CROPS_BLUEBERRY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Blueberry]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_ELDERBERRY = new SlimefunItemStack("ARTIFICIAL_CROPS_ELDERBERRY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Elderberry]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_RASPBERRY = new SlimefunItemStack("ARTIFICIAL_CROPS_RASPBERRY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Raspberry]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_BLACKBERRY = new SlimefunItemStack("ARTIFICIAL_CROPS_BLACKBERRY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Blackberry]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_COWBERRY = new SlimefunItemStack("ARTIFICIAL_CROPS_COWBERRY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Cowberry]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_CRANBERRY = new SlimefunItemStack("ARTIFICIAL_CROPS_CRANBERRY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Cranberry]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_STRAWBERRY = new SlimefunItemStack("ARTIFICIAL_CROPS_STRAWBERRY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Strawberry]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_TOMATO = new SlimefunItemStack("ARTIFICIAL_CROPS_TOMATO", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Tomato]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_LETTUCE = new SlimefunItemStack("ARTIFICIAL_CROPS_LETTUCE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Lettuce]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_TEA = new SlimefunItemStack("ARTIFICIAL_CROPS_TEA", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Tea]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_CABBAGE = new SlimefunItemStack("ARTIFICIAL_CROPS_CABBAGE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Cabbage]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_SWEET_POTATO = new SlimefunItemStack("ARTIFICIAL_CROPS_SWEET_POTATO", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Sweet Potato]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_MUSTARD = new SlimefunItemStack("ARTIFICIAL_CROPS_MUSTARD", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Mustard]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_CURRY = new SlimefunItemStack("ARTIFICIAL_CROPS_CURRY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Curry]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_ONION = new SlimefunItemStack("ARTIFICIAL_CROPS_ONION", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Onion]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_GARLIC = new SlimefunItemStack("ARTIFICIAL_CROPS_GARLIC", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Garlic]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_CILANTRO = new SlimefunItemStack("ARTIFICIAL_CROPS_CILANTRO", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Cilantro]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_BLACK_PEPPER = new SlimefunItemStack("ARTIFICIAL_CROPS_BLACK_PEPPER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Black Pepper]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_CORN = new SlimefunItemStack("ARTIFICIAL_CROPS_CORN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Corn]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_PINEAPPLE = new SlimefunItemStack("ARTIFICIAL_CROPS_PINEAPPLE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Pineapple]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_RED_BELL_PEPPER = new SlimefunItemStack("ARTIFICIAL_CROPS_RED_BELL_PEPPER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Red Bell Pepper]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_OAK_APPLE = new SlimefunItemStack("ARTIFICIAL_CROPS_OAK_APPLE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Oak Apple]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_COCONUT = new SlimefunItemStack("ARTIFICIAL_CROPS_COCONUT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Coconut]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_CHERRY = new SlimefunItemStack("ARTIFICIAL_CROPS_CHERRY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Cherry]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_POMEGRANATE = new SlimefunItemStack("ARTIFICIAL_CROPS_POMEGRANATE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Pomegranate]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_LEMON = new SlimefunItemStack("ARTIFICIAL_CROPS_LEMON", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Lemon]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_PLUM = new SlimefunItemStack("ARTIFICIAL_CROPS_PLUM", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Plum]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_LIME = new SlimefunItemStack("ARTIFICIAL_CROPS_LIME", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Lime]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_ORANGE = new SlimefunItemStack("ARTIFICIAL_CROPS_ORANGE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Orange]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_PEACH = new SlimefunItemStack("ARTIFICIAL_CROPS_PEACH", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Peach]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_PEAR = new SlimefunItemStack("ARTIFICIAL_CROPS_PEAR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Pear]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));
      ARTIFICIAL_CROPS_DRAGON_FRUIT = new SlimefunItemStack("ARTIFICIAL_CROPS_DRAGON_FRUIT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Dragon Fruit]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(50));

      ARTIFICIAL_CROPS_GRAPE_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_GRAPE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Grape] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_BLUEBERRY_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_BLUEBERRY_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Blueberry] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_ELDERBERRY_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_ELDERBERRY_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Elderberry] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_RASPBERRY_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_RASPBERRY_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Raspberry] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_BLACKBERRY_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_BLACKBERRY_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Blackberry] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_COWBERRY_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_COWBERRY_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Cowberry] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_CRANBERRY_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_CRANBERRY_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Cranberry] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_STRAWBERRY_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_STRAWBERRY_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Strawberry] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_TOMATO_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_TOMATO_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Tomato] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_LETTUCE_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_LETTUCE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Lettuce] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_TEA_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_TEA_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Tea] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_CABBAGE_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_CABBAGE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Cabbage] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_SWEET_POTATO_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_SWEET_POTATO_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Sweet Potato] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_MUSTARD_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_MUSTARD_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Mustard] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_CURRY_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_CURRY_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Curry] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_ONION_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_ONION_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Onion] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_GARLIC_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_GARLIC_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Garlic] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_CILANTRO_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_CILANTRO_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Cilantro] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_BLACK_PEPPER_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_BLACK_PEPPER_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Black Pepper] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_CORN_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_CORN_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Corn] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_PINEAPPLE_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_PINEAPPLE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Pineapple] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_RED_BELL_PEPPER_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_RED_BELL_PEPPER_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQ4MGMyNmY5MDRiNTdlNjMxZTM5ZWJjNDQ2ZWMxYWYyZGNlMzQzMmViODQzMWZiZDE5MDg3YWRiNGFiY2IifX19"
    		  , "&aArtificial Crops &e[Red Bell Pepper] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_OAK_APPLE_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_OAK_APPLE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Oak Apple] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_COCONUT_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_COCONUT_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Coconut] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_CHERRY_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_CHERRY_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Cherry] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_POMEGRANATE_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_POMEGRANATE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Pomegranate] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_LEMON_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_LEMON_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Lemon] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_PLUM_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_PLUM_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Plum] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_LIME_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_LIME_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Lime] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_ORANGE_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_ORANGE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Orange] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_PEACH_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_PEACH_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Peach] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_PEAR_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_PEAR_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Pear] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));
      ARTIFICIAL_CROPS_DRAGON_FRUIT_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_DRAGON_FRUIT_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0MDgwNDlhYjE5ZmE3ZTI4ZjM0NjZiZjBiOWEwMjc2NmMzMTkxODFhOWFiN2E0YjY5NzM4MTZmMzE4YTZhIn19fQ=="
    		  , "&aArtificial Crops &e[Dragon Fruit] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(100));

      ARTIFICIAL_CROPS_BANANA = new SlimefunItemStack("ARTIFICIAL_CROPS_BANANA", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Banana]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_CASSAVA = new SlimefunItemStack("ARTIFICIAL_CROPS_CASSAVA", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Cassava]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_CHILI = new SlimefunItemStack("ARTIFICIAL_CROPS_CHILI", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Chili]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_COFFEE_BEAN = new SlimefunItemStack("ARTIFICIAL_CROPS_COFFEE_BEAN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Coffee Bean]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_DURIAN = new SlimefunItemStack("ARTIFICIAL_CROPS_DURIAN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Durian]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_MANGO = new SlimefunItemStack("ARTIFICIAL_CROPS_MANGO", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Mango]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_MSG = new SlimefunItemStack("ARTIFICIAL_CROPS_MSG", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Msg]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_PEANUT = new SlimefunItemStack("ARTIFICIAL_CROPS_PEANUT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Peanut]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_RICE = new SlimefunItemStack("ARTIFICIAL_CROPS_RICE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Rice]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_SALAM_AND_SEREH = new SlimefunItemStack("ARTIFICIAL_CROPS_SALAM_AND_SEREH", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Salam And Sereh]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_SOYBEAN = new SlimefunItemStack("ARTIFICIAL_CROPS_SOYBEAN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Soybean]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_TOBACCO = new SlimefunItemStack("ARTIFICIAL_CROPS_TOBACCO", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Tobacco]", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));

      ARTIFICIAL_CROPS_BANANA_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_BANANA_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Banana] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_CASSAVA_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_CASSAVA_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Cassava] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_CHILI_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_CHILI_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Chili] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_COFFEE_BEAN_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_COFFEE_BEAN_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Coffee Bean] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_DURIAN_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_DURIAN_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Durian] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_MANGO_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_MANGO_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Mango] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_MSG_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_MSG_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Msg] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_PEANUT_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_PEANUT_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Peanut] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_RICE_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_RICE_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Rice] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_SALAM_AND_SEREH_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_SALAM_AND_SEREH_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Salam And Sereh] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_SOYBEAN_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_SOYBEAN_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Soybean] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));
      ARTIFICIAL_CROPS_TOBACCO_2 = new SlimefunItemStack("ARTIFICIAL_CROPS_TOBACCO_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTIzNjY4MzAzNjdmNjhmZmQ3YzkwODc3MmFjNTY2YTgyNmYyNzE0YjM2NDc2MmEwM2U3N2FkM2NiOTY4NTkifX19"
    		  , "&aArtificial Crops &e[Tobacco] &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(60));


      AUTO_ANCIENT_ALTAR = new SlimefunItemStack("SPC_AUTO_ANCIENT_ALTAR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODE4ZjgzZWI2NGY0MzhlM2Y2YWUzYTVjMmRlYThlZDEwMzAzYmFkODVhYzM0YTc5ODY1OWEyNzVhYTA5NjUwNiJ9fX0=", "&2Auto-Crafter &8(Ancient Altar)", new String[]{""
    		  , "&fPlace this machine on top of a", "&fchest or similar and make it craft", "&fanything that can be crafted using an", "&eAncient Altar", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(128).replace("/s", "/Item")});
      ADVANCED_ANCIENT_PEDESTAL = new SlimefunItemStack("ADVANCED_ANCIENT_PEDESTAL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODViNzFkYmQ5YjMxYzk0MjZhOTlkMjdkNjFkZDA4ZTMwYjljMDMwN2VlM2ZkZWQzNDI1NDk5MjU2MmQxYjg2NSJ9fX0=", "&eAdvanced &dAncient Pedestal", new String[0]);
      MAGNESIUM_ARTIFICIAL_SEEDS = new SlimefunItemStack("MAGNESIUM_ARTIFICIAL_SEEDS", Material.PUMPKIN_SEEDS, "&7Magnesium Artificial Seeds", new String[0]);
      ZINC_ARTIFICIAL_SEEDS = new SlimefunItemStack("ZINC_ARTIFICIAL_SEEDS", Material.PUMPKIN_SEEDS, "&7Zinc Artificial Seeds", new String[0]);

      AUTO_MAGIC_WORKBENCH = new SlimefunItemStack("SPC_AUTO_MAGIC_WORKBENCH", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTJiM2Q1YTZmZWMxZTNhNWYxYzhmM2YzYzk2ZjM4YzY3NDdjMjA5ZDZhMTA2Yzc5YjY1YTNhOWE5Y2ZkOTc3In19fQ==", "&2Auto-Crafter &8(Magic Workbench)", new String[]{""
    		  , "&fPlace this machine on top of a", "&fchest or similar and make it craft", "&fanything that can be crafted using an", "&eMagic Workbench", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(64).replace("/s", "/Item")});

      ELECTRIFIED_NETHER_COMPOSTER = new SlimefunItemStack("ELECTRIFIED_NETHER_COMPOSTER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGIyZGI4ZjBjMmE1ZDA0MjQ2NDM3YTlkYTcxZDU5NzNlMmNiZmQyMmY2MDUxMGE5MzlmYTRmNzY2NGE0MWQ2NiJ9fX0="
    		  , "&cElectrified Nether Composter", new String[]{"", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerPerSecond(96)});
      ELECTRIFIED_NETHER_COMPOSTER_2 = new SlimefunItemStack("ELECTRIFIED_NETHER_COMPOSTER_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGIyZGI4ZjBjMmE1ZDA0MjQ2NDM3YTlkYTcxZDU5NzNlMmNiZmQyMmY2MDUxMGE5MzlmYTRmNzY2NGE0MWQ2NiJ9fX0="
    		  , "&cElectrified Nether Composter &7- &eII", new String[]{"", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2.0F), LoreBuilder.powerPerSecond(160)});
      ELECTRIFIED_NETHER_COMPOSTER_3 = new SlimefunItemStack("ELECTRIFIED_NETHER_COMPOSTER_3", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGIyZGI4ZjBjMmE1ZDA0MjQ2NDM3YTlkYTcxZDU5NzNlMmNiZmQyMmY2MDUxMGE5MzlmYTRmNzY2NGE0MWQ2NiJ9fX0="
    		  , "&cElectrified Nether Composter &7- &eIII", new String[]{"", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(6.0F), LoreBuilder.powerPerSecond(240)});

      WEEB_PLATE = new SlimefunItemStack("WEEB_PLATE", Material.PINK_CARPET, "&dWeeb Plate", new String[0]);
      INFERNAL_ALLOY_INGOT = new SlimefunItemStack("INFERNAL_ALLOY_INGOT", Material.BRICK, "&cInfernal &6Alloy &7Ingot", new String[]{"", "&6&oFeels like burning"});
      INFERNAL_ALLOY_PLATE = new SlimefunItemStack("INFERNAL_ALLOY_PLATE", Material.RED_CARPET, "&cInfernal &6Alloy &1Plate", new String[]{"", "&6&oFeels like burning"});

      ELECTRIC_SALVAGER = new SlimefunItemStack("ELECTRIC_SALVAGER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTgzMDZiZjhlZTQwMzZhNmZkYjQ4NDE2NzBiMzE3Mjg5NDg1MDMxYjU2NTQ1ZDNkMWE1YzBlNTc0ZWNmZDFkNCJ9fX0="
    		  , "&eElectric Salvager", new String[]{"", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerPerSecond(64)});
      ELECTRIC_SALVAGER_2 = new SlimefunItemStack("ELECTRIC_SALVAGER_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTgzMDZiZjhlZTQwMzZhNmZkYjQ4NDE2NzBiMzE3Mjg5NDg1MDMxYjU2NTQ1ZDNkMWE1YzBlNTc0ZWNmZDFkNCJ9fX0="
    		  , "&eElectric Salvager &7- &eII", new String[]{"", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3.0F), LoreBuilder.powerPerSecond(160)});

      ALLOY_PRESS = new SlimefunItemStack("ALLOY_PRESS", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2U5OGI1NTY3MWQ0ZWYyZjY0MjU5ZWZlNmFhNjcyOWZlNjVjNzdkYTE5NmMyZDQ1Njg2NjM3NmVjY2NhNjYwYiJ9fX0="
    		  , "&eAlloy Press", new String[]{"", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerPerSecond(32)});
      ALLOY_PRESS_2 = new SlimefunItemStack("ALLOY_PRESS_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2U5OGI1NTY3MWQ0ZWYyZjY0MjU5ZWZlNmFhNjcyOWZlNjVjNzdkYTE5NmMyZDQ1Njg2NjM3NmVjY2NhNjYwYiJ9fX0="
    		  , "&eAlloy Press &7- &eII", new String[]{"", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(4.0F), LoreBuilder.powerPerSecond(80)});


      MINI_HOSPITAL = new SlimefunItemStack("MINI_HOSPITAL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFhNmE0MTFiODAyYjIyZTUzMjQ3OTVjZTM0ZTNjYWU0YTgzNzk2YTE4ZDkyMzMyNjY2Y2JmMjE0ODhjMCJ9fX0="
    		  , "&dMini Hospital", new String[]{"", LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerPerSecond(8)});
      MINI_HOSPITAL_2 = new SlimefunItemStack("MINI_HOSPITAL_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFhNmE0MTFiODAyYjIyZTUzMjQ3OTVjZTM0ZTNjYWU0YTgzNzk2YTE4ZDkyMzMyNjY2Y2JmMjE0ODhjMCJ9fX0="
    		  , "&dMini Hospital &7- &eII", new String[]{"", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(4.0F), LoreBuilder.powerPerSecond(24)});
      MINI_HOSPITAL_3 = new SlimefunItemStack("MINI_HOSPITAL_3", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFhNmE0MTFiODAyYjIyZTUzMjQ3OTVjZTM0ZTNjYWU0YTgzNzk2YTE4ZDkyMzMyNjY2Y2JmMjE0ODhjMCJ9fX0="
    		  , "&dMini Hospital &7- &eIII", new String[]{"", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(10.0F), LoreBuilder.powerPerSecond(64)});



      HEALTH_POTION = new SlimefunItemStack("HEALTH_POTION", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTBhMTRhOGNmMDkyZDBjZDE2OTMzYmUyZGM5ZDQ0MGZiMzBiNTE1OTIxZmM2YjY4Y2RjYzE5YWJmODY0NmZjZiJ9fX0=",
    		  "&cHealth Potion", new String[]{"", "&7&oRestores &b&o5.0 &7&oHealth"});
      HEALTH_POTION_2 = new SlimefunItemStack("HEALTH_POTION_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTBhMTRhOGNmMDkyZDBjZDE2OTMzYmUyZGM5ZDQ0MGZiMzBiNTE1OTIxZmM2YjY4Y2RjYzE5YWJmODY0NmZjZiJ9fX0=",
    		  "&cHealth Potion &7- &eII", new String[]{"", "&7&oRestores &b&o12.0 &7&oHealth"});
      HEALTH_POTION_3 = new SlimefunItemStack("HEALTH_POTION_3", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTBhMTRhOGNmMDkyZDBjZDE2OTMzYmUyZGM5ZDQ0MGZiMzBiNTE1OTIxZmM2YjY4Y2RjYzE5YWJmODY0NmZjZiJ9fX0=",
    		  "&cHealth Potion &7- &eIII", new String[]{"", "&7&oRestores &b&o25.0 &7&oHealth"});
      HEALTH_POTION_4 = new SlimefunItemStack("HEALTH_POTION_4", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTBhMTRhOGNmMDkyZDBjZDE2OTMzYmUyZGM5ZDQ0MGZiMzBiNTE1OTIxZmM2YjY4Y2RjYzE5YWJmODY0NmZjZiJ9fX0=",
    		  "&cHealth Potion &7- &eIV", new String[]{"", "&7&oRestores &b&o60.0 &7&oHealth"});

      HOLY_WATER = new SlimefunItemStack("HOLY_WATER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWRjOWZmMTg0YWU3NjdkM2NiZmQ5YzNhYTJjN2U4OGIxMGY5YjU5MTI5N2ZmNjc2ZGE2MzlmYjQ0NDYyMzhjOCJ9fX0=",
    		  "&bHoly Water", new String[]{"", "&7&oExtinguish Flame"});
      CURE_ALL = new SlimefunItemStack("CURE_ALL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDlmNDBlZjc3ZmYzMzlhN2MzYWNhOGVlYWRmMTVlNjMyYmU2YzI1NzRlNmNiYTJlNzFjMmNjNzBkYzNiYmU2NCJ9fX0=",
    		  "&eCure All", new String[]{"", "&7&oCure Negative Effect"});



      HEALING_HERB = new SlimefunItemStack("HEALING_HERB", Material.FERN, "&cHealing &2Herb", new String[]{"", "&7&ohelth"});
      setupEnchanted(HEALING_HERB);

      HEALING_TICKET = new SlimefunItemStack("HEALING_TICKET", Material.PAPER, "&cHealing &eTicket", new String[]{"", "&7&ohelth"});
      setupEnchanted(HEALING_TICKET);

      HEALING_CORE = new SlimefunItemStack("HEALING_CORE", Material.SPIDER_EYE, "&cHealing &5Core", new String[]{"", "&7&ohelth"});
      setupEnchanted(HEALING_CORE);

      HEALING_FRUIT = new SlimefunItemStack("HEALING_FRUIT", Material.GOLDEN_APPLE, "&cHealing &aFruit", new String[]{"", "&7&ohelth"});
      setupEnchanted(HEALING_FRUIT);

       ORE_POLISHER = new SlimefunItemStack("ORE_POLISHER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzA2N2Y1YmZjZGIwMmFiNDIwNmY3ZTlkMWYyNmM4NTZiM2JmNjlmYzkzZjgyZmZlZTdjZDQxNzZkNjUzYmY4MSJ9fX0="
               , "&bOre Polisher", new String[]{"", "&fMengubah deepslate ore menjadi ore biasa", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerPerSecond(64)});

       TURTLE_SCUTE_PRINTER = new SlimefunItemStack("TURTLE_SCUTE_PRINTER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWQxYmQwNmE2NzM4ZDBkYTUwNTNlYWU0OWExMzYyYjg5NDg5ZDFhYzAwNGMyMjI1MDQ1MzZmN2JjZDA3Njc5ZCJ9fX0="
               , "&aScute Printer", new String[]{"", "&fMengubah seagrass menjadi scute", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerPerSecond(240)});

       EGG_PRINTER = new SlimefunItemStack("EGG_PRINTER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzc3NzA3MzE3NzE0M2Y5NDc2ODQ0YTc4ZTJlZGFiZmIzYTg2ZjNmZTMxYWIxYzBmODhiZTdiM2Y3NjljYjk1ZSJ9fX0="
               , "&aEgg Printer", new String[]{"", "&fMengubah seeds menjadi egg", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerPerSecond(32)});

       EGG_PRINTER_2 = new SlimefunItemStack("EGG_PRINTER_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzc3NzA3MzE3NzE0M2Y5NDc2ODQ0YTc4ZTJlZGFiZmIzYTg2ZjNmZTMxYWIxYzBmODhiZTdiM2Y3NjljYjk1ZSJ9fX0="
               , "&aEgg Printer &7- &eII", new String[]{"", "&fMengubah seeds menjadi egg", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(4.0F), LoreBuilder.powerPerSecond(64)});

       MILK_STERILIZER = new SlimefunItemStack("MILK_STERILIZER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTc1YjU4NmQyOWFhNGY2MzAwNjcwN2ZiZTk0YTMzYzg5YzIyNWY0OWIzYjQ0Y2IxODE3Mzg2NTZjOTQyZTI3NyJ9fX0="
               , "&fMilk Sterilizer", new String[]{"", "&fMerebus susu menjadi fresh milk", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerPerSecond(40)});

       COMPACT_REACTOR = new SlimefunItemStack("COMPACT_REACTOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTdlMTVkZTBkNGI1ZTIwZTZjNmQwMmMwNjQ2NWU4ZDg3ZTJiMGFiYjdmNGVkNThmYzZhNGJiNDllMDA4NmY1YyJ9fX0=",
               "&2Compact Reactor", new String[]{"", "&7&oNuklir tanpa khawatir meledak", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(16384), LoreBuilder.powerPerSecond(500)});

       ICE_KING_COOLANT_CELL = new SlimefunItemStack("ICE_KING_COOLANT_CELL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODJkYTY4YmJjOWJkNGNjYmM2ZGFjMzlkZmRlNWRiNWIwYmNhODM1ODIyNGI0ZGYzZmJmMGZiNmYzN2JmNzQ5OSJ9fX0=", "&6Ice King Coolant Cell", new String[]{"", "&b&oBrrrrrr"});

       DUST_EXTRACTOR = new SlimefunItemStack("SPC_DUST_EXTRACTOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQ0YzVjZTJlYjY0M2Y4NjcxYzY2N2U4ODAyYzkzMTdhZDhjYzZhZjY4MGQ0ZWY2NzFkOGMwYzYzMjc3OTAwYSJ9fX0="
               , "&6Dust Extractor", new String[]{"", "&fMengubah cobblestone menjadi random dust", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerPerSecond(240)});

       URANIUM_EXTRACTOR = new SlimefunItemStack("SPC_URANIUM_EXTRACTOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWIzMDg2OTRjNWIwMWU4MTVkNDk4NTM1ZjRjM2RiNTgyN2I0Y2M0NWYxMmEzMzcxN2FkMGNhOWZlMjQ1MDljMCJ9fX0="
               , "&2Uranium Extractor", new String[]{"", "&fMengubah cobblestone menjadi uranium", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerPerSecond(180)});

       ELITE_ARTIFACT = new SlimefunItemStack("ELITE_ARTIFACT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ4N2ZiYTI2ODVlZGEwMjJkYmM2YjQwMTU4YjU4NDY4YWQwMTQwMzU2ZjY2MTc1ZWYwYWRkZTIzZmM4MTVjMyJ9fX0=",
               "&eElite Artifact", new String[]{"", "&1&oLost in time"});

       FUSION_ARTIFACT = new SlimefunItemStack("FUSION_ARTIFACT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTZlOTc3YWUyZjc5NmRjZTZjODBjYjZiZWQ5Mjk0ZTllZDRiMTFiODhmOWZkZTZjMzFmNDM1ZGZkMDM4MjUyOSJ9fX0=",
               "&dFusion Artifact", new String[]{"", "&1&oLost in time"});

       ARTIFACT_REACTOR = new SlimefunItemStack("ARTIFACT_REACTOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWY0NWZjY2EyMjZiOGZjM2RiM2ZlMDYzYTg2OTg4NzU5YTFjYzA3MWQ1ZDkzNjg3MTAwZmQzNzY5NWYwYzRmYyJ9fX0=",
               "&4Artifact Reactor", new String[]{"", "&1&oLost in time", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(65536), LoreBuilder.powerPerSecond(2048)});

       VOID_ALTAR = new SlimefunItemStack("VOID_ALTAR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWViMTY3OTkzNjZiNTVlYjViMzRlM2U2NmMyOWZmMzc3ODNlNGM5NWMxYmNkNDUwZTQ1YzFiMGM2ODgxNDI3OCJ9fX0="
               , "&5Void Altar", new String[]{"", "&fTidak perlu melawan ender king lagi", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1.0F), LoreBuilder.powerBuffer(36000), LoreBuilder.powerPerSecond(6000)});

       VOID_ALTAR_2 = new SlimefunItemStack("VOID_ALTAR_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWViMTY3OTkzNjZiNTVlYjViMzRlM2U2NmMyOWZmMzc3ODNlNGM5NWMxYmNkNDUwZTQ1YzFiMGM2ODgxNDI3OCJ9fX0="
               , "&5Void Altar &7- &eII", new String[]{"", "&fTidak perlu melawan ender king lagi", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3.0F), LoreBuilder.powerBuffer(96000), LoreBuilder.powerPerSecond(6000)});

   }

    private static AttributeModifier createMod(String key, double amount, AttributeModifier.Operation op, EquipmentSlotGroup slot) {
        return new AttributeModifier(new NamespacedKey(SPCAddon.getInstance(), key), amount, op, slot);
    }

    private static void setupTool(SlimefunItemStack item, String keyBase, double dmg, double speed, boolean isUnbreakable) {
        ItemMeta meta = item.getItemMeta();
        if (meta == null) return;
        meta.addAttributeModifier(Attribute.ATTACK_DAMAGE, createMod(keyBase + "_dmg", dmg, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.MAINHAND));
        meta.addAttributeModifier(Attribute.ATTACK_SPEED, createMod(keyBase + "_spd", speed, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.MAINHAND));

        meta.setUnbreakable(isUnbreakable);
        //meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        item.setItemMeta(meta);
    }

    private static void setupArmor(SlimefunItemStack item, String keyBase, double arm, double tough, double kb, double hp, EquipmentSlotGroup slot, boolean isUnbreakable) {
        ItemMeta meta = item.getItemMeta();
        if (meta == null) return;
        meta.addAttributeModifier(Attribute.ARMOR, createMod(keyBase + "_arm", arm, AttributeModifier.Operation.ADD_NUMBER, slot));
        meta.addAttributeModifier(Attribute.ARMOR_TOUGHNESS, createMod(keyBase + "_tough", tough, AttributeModifier.Operation.ADD_NUMBER, slot));
        meta.addAttributeModifier(Attribute.KNOCKBACK_RESISTANCE, createMod(keyBase + "_kb", kb, AttributeModifier.Operation.ADD_NUMBER, slot));
        meta.addAttributeModifier(Attribute.MAX_HEALTH, createMod(keyBase + "_hp", hp, AttributeModifier.Operation.ADD_NUMBER, slot));

        meta.setUnbreakable(isUnbreakable);
        //meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_DYE);

        item.setItemMeta(meta);
    }

    private static void setupOffhand(
            SlimefunItemStack item,
            String keyBase,
            double maxHealth,
            double attackDamage,
            double knockbackRes,
            boolean isUnbreakable
    ) {
        ItemMeta meta = item.getItemMeta();
        if (meta == null) return;

        if (maxHealth != 0) {
            meta.addAttributeModifier(
                    Attribute.MAX_HEALTH,
                    createMod(keyBase + "_hp", maxHealth, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.OFFHAND)
            );
        }

        if (attackDamage != 0) {
            meta.addAttributeModifier(
                    Attribute.ATTACK_DAMAGE,
                    createMod(keyBase + "_atk", attackDamage, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.OFFHAND)
            );
        }

        if (knockbackRes != 0) {
            meta.addAttributeModifier(
                    Attribute.KNOCKBACK_RESISTANCE,
                    createMod(keyBase + "_kb", knockbackRes, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlotGroup.OFFHAND)
            );
        }

        meta.setUnbreakable(isUnbreakable);
        //meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
    }



    private static void setupEnchanted(SlimefunItemStack item) {
        // Apply the enchantment
        item.addUnsafeEnchantment(Enchantment.UNBREAKING, 10);

        // Setup Meta and Hide Enchants
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            item.setItemMeta(meta);
        }
    }

   private SPCItems() {
   }


}
