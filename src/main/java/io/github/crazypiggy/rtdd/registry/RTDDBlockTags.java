package io.github.crazypiggy.rtdd.registry;

import io.github.crazypiggy.rtdd.RTDDMain;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class RTDDBlockTags {

    //public static final TagKey<Block> ZOETIC_GRASS_BLOCK_CAN_SPREAD = RTDDBlockTags.of("zoetic_grass_can_spread");

    private static TagKey<Block> of(String name) {
        return TagKey.of(RegistryKeys.BLOCK,new Identifier(RTDDMain.MODID, name));
    }

    public static void registerModBlockTags() {
        //当执行这一行命令时，会自动执行一遍空参构造
    }
}
