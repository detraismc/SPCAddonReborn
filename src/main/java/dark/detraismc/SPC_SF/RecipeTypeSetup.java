package dark.detraismc.SPC_SF;

import dark.detraismc.SPC_SF.implementation.block.Vending_Machine;

final class RecipeTypeSetup {
   static final RecipeTypeSetup INSTANCE = new RecipeTypeSetup();
   private boolean initialised;

   private RecipeTypeSetup() {
   }

   public void init() {
      if (!this.initialised) {
         this.initialised = true;
         (new Vending_Machine()).register(SPCAddon.getInstance());
      }
   }
}
