package net.polly.stumped.block.entity;

import net.polly.stumped.mixin.SignTypeAccessor;
import net.minecraft.util.SignType;

public class ModSignTypes {
    public static final SignType TEMPLATE =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("template"));
}
