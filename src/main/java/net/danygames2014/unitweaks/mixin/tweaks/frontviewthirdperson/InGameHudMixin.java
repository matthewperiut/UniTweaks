package net.danygames2014.unitweaks.mixin.tweaks.frontviewthirdperson;

import net.danygames2014.unitweaks.UniTweaks;
import net.danygames2014.unitweaks.tweaks.frontviewthirdperson.FrontViewMode;
import net.danygames2014.unitweaks.util.ModOptions;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;

@Mixin(InGameHud.class)
public class InGameHudMixin {
    @Shadow
    private Minecraft minecraft;

    @WrapOperation(
            method = "render",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/hud/InGameHud;drawTexture(IIIIII)V", ordinal = 2)
    )
    private void wrapBlit(InGameHud instance, int x, int y, int u, int v, int width, int height, Operation<Void> original) {
        if (!minecraft.options.thirdPerson) {
            original.call(instance, x, y, u, v, width, height);
        }
    }
}
