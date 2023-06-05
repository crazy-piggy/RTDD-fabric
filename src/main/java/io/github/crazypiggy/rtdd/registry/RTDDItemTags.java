package io.github.crazypiggy.rtdd.registry;

import io.github.crazypiggy.rtdd.RTDDMain;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class RTDDItemTags {

    //public static final TagKey<Item> BARREL_PACKING_BLACKLIST = RTDDItemTags.of("barrel_packing_blacklist");

    private static TagKey<Item> of(String name) {
        return TagKey.of(RegistryKeys.ITEM,new Identifier(RTDDMain.MODID, name));
    }

    public static void registerModItemTags() {
        //当执行这一行命令时，会自动执行一遍空参构造
    }
}
