package io.github.crazypiggy.rtdd.registry;

import io.github.crazypiggy.rtdd.RTDDMain;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RTDDBlockItems {
//
//    public static final Item POWER_STONE_BLOCK_ITEM = registerBlockItem("power_stone",
//            new BlockItem(RTDDBlocks.POWER_STONE_BLOCK, new FabricItemSettings().rarity(Rarity.COMMON)));

    public static Item registerBlockItem(String name, BlockItem blockitem) {
        return Registry.register(Registries.ITEM, new Identifier(RTDDMain.MODID, name), blockitem);
    }

    public static void registerModBlockItems() {
        //当执行这一行命令时，会自动执行一遍空参构造
    }
}
