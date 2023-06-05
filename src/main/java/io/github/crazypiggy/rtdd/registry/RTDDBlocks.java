package io.github.crazypiggy.rtdd.registry;

import io.github.crazypiggy.rtdd.RTDDMain;
import io.github.crazypiggy.rtdd.common.block.LargePileOfItemsBlock;
import io.github.crazypiggy.rtdd.common.block.SmallPileOfItemsBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;


public class RTDDBlocks {
//    public static final Block POWER_STONE_BLOCK = registerBlock("power_stone",
//            new PowerStoneBlock(FabricBlockSettings.of(Material.METAL, MapColor.LIGHT_BLUE).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).solidBlock(AbstractBlock.AbstractBlockState::isTransparent)));

    public static final Block PILE_OF_GOLD_COINS_BLOCK = registerBlockWithItem("b_86", new SmallPileOfItemsBlock(FabricBlockSettings.of(Material.DECORATION).strength(1F).sounds(BlockSoundGroup.METAL).noCollision()));
    public static final Block PILE_OF_APPLES_BLOCK = registerBlockWithItem("b_1", new LargePileOfItemsBlock(FabricBlockSettings.of(Material.DECORATION).strength(1F).sounds(BlockSoundGroup.WOOD)));


    //default registry
    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(RTDDMain.MODID, name), block);
    }

    private static Block registerBlockWithItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(RTDDMain.MODID, name), new BlockItem(block, new FabricItemSettings().rarity(Rarity.COMMON)));
        return Registry.register(Registries.BLOCK, new Identifier(RTDDMain.MODID, name), block);
    }

    private static Block registerBlockWithItem(String name, Block block, Item.Settings settings) {
        Registry.register(Registries.ITEM, new Identifier(RTDDMain.MODID, name), new BlockItem(block, settings));
        return Registry.register(Registries.BLOCK, new Identifier(RTDDMain.MODID, name), block);
    }

    public static void registerModBlock() {
        //当执行这一行命令时，会自动执行一遍空参构造
    }
}
