package com.intellij.rtdd.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static com.intellij.rtdd.Main.ofModIdentifier;

public class Blocks {
    public static final Block TEST_BLOCK = new Block(FabricBlockSettings.of(Material.BAMBOO).hardness(1.0f));

    public static void register() {
        register("test_block", TEST_BLOCK);
    }

    private static void register(String path, Block block) {
        Registry.register(Registries.BLOCK, ofModIdentifier(path), block);
    }
}