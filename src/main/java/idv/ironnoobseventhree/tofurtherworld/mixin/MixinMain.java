package idv.ironnoobseventhree.tofurtherworld.mixin;

import idv.ironnoobseventhree.tofurtherworld.Core;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MixinMain {
    private void init(CallbackInfo info) {
        System.out.println("This line is printed by an example mod mixin!");
    }
}
