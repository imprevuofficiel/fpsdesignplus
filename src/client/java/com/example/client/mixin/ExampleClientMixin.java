package com.example.client.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class ExampleMixin {

    @Inject(method = "getFps", at = @At("RETURN"), cancellable = true)
    private static void modifyFps(CallbackInfoReturnable<Integer> cir) {
        int realFps = cir.getReturnValue();
        // Ajoute 2500 aux FPS réels
        cir.setReturnValue(realFps + 2500);
    }
}
