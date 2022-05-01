package net.polly.stumped.block.entity;

import net.polly.stumped.mixin.SignTypeAccessor;
import net.minecraft.util.SignType;

public class ModSignTypes {

    public static final SignType BLOSSOM =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("blossom"));
    public static final SignType ARAUCARIA =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("araucaria"));
}
