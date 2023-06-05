package com.intellij.rtdd.registry;

import com.intellij.rtdd.RTDDMain;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class RTDDItemGroups {

    public static final ItemGroup DECO = FabricItemGroup.builder(new Identifier(RTDDMain.MODID, "deco"))
            .displayName(Text.translatable("itemGroup.rtdd.deco"))
            .icon(() -> new ItemStack(RTDDBlocks.PILE_OF_GOLD_COINS_BLOCK.asItem()))
            .entries((displayContext, entries) -> {

                entries.add(RTDDBlocks.PILE_OF_GOLD_COINS_BLOCK);
                entries.add(RTDDBlocks.PILE_OF_APPLES_BLOCK);


            })
            .build();

    public static void registerModItemGroup() {
        //当执行这一行命令时，会自动执行一遍空参构造
    }
}
