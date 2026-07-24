package com.example.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class ExampleMixin {

    @Inject(method = "getCurrentFps", at = @At("RETURN"), cancellable = true)
    private static void modifyFps(CallbackInfoReturnable<Integer> cir) {
        int realFps = cir.getReturnValue();
        // Additionne 2500 aux vrais FPS
        cir.setReturnValue(realFps + 2500);
    }
}
