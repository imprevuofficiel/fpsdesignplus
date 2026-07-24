package com.example.client.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class ExampleClientMixin {

    @Inject(method = "getCurrentFps", at = @At("RETURN"), cancellable = true, require = 0)
    private static void onGetCurrentFps(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(cir.getReturnValue() + 2500);
    }

    @Inject(method = "getFps", at = @At("RETURN"), cancellable = true, require = 0)
    private static void onGetFps(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(cir.getReturnValue() + 2500);
    }
}
