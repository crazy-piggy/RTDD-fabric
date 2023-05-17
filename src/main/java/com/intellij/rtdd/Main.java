package com.intellij.rtdd;

import com.intellij.rtdd.block.Blocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {
    public static final String MODID = "rtdd";

    public static Identifier ofModIdentifier(String path) {
        return new Identifier(MODID, path);
    }

    @Override
    public void onInitialize() {
        Blocks.register();
    }
}