package dark.detraismc.SPC_SF;

import dark.detraismc.SPC_SF.listener.BlockPlace;
import dark.detraismc.SPC_SF.listener.BossDrop;
import dark.detraismc.SPC_SF.listener.BossEffect;
import dark.detraismc.SPC_SF.listener.DragonDrop;
import dark.detraismc.SPC_SF.listener.EliteMobsDrop;
import dark.detraismc.SPC_SF.listener.EliteMobsEffect;
import dark.detraismc.SPC_SF.listener.EliteMobsSpawn;
import dark.detraismc.SPC_SF.listener.RingEffect;
import dark.detraismc.SPC_SF.listener.SnowballGun;
import dark.detraismc.SPC_SF.listener.WeaponEffect;

import org.bukkit.Bukkit;

final class ListenerSetup {
   static final ListenerSetup INSTANCE = new ListenerSetup();
   private boolean initialised;

   private ListenerSetup() {
   }

   public void init() {
      if (!this.initialised) {
         this.initialised = true;
         Bukkit.getPluginManager().registerEvents(new EliteMobsEffect(), SPCAddon.getInstance());
         Bukkit.getPluginManager().registerEvents(new EliteMobsSpawn(), SPCAddon.getInstance());
         Bukkit.getPluginManager().registerEvents(new EliteMobsDrop(), SPCAddon.getInstance());
         Bukkit.getPluginManager().registerEvents(new DragonDrop(), SPCAddon.getInstance());
         Bukkit.getPluginManager().registerEvents(new SnowballGun(), SPCAddon.getInstance());
         Bukkit.getPluginManager().registerEvents(new BossEffect(), SPCAddon.getInstance());
         Bukkit.getPluginManager().registerEvents(new BossDrop(), SPCAddon.getInstance());
         Bukkit.getPluginManager().registerEvents(new RingEffect(), SPCAddon.getInstance());
         Bukkit.getPluginManager().registerEvents(new WeaponEffect(), SPCAddon.getInstance());
         Bukkit.getPluginManager().registerEvents(new BlockPlace(), SPCAddon.getInstance());
      }
   }
}
