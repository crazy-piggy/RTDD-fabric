package io.github.crazypiggy.rtdd.item;

import io.github.crazypiggy.rtdd.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static io.github.crazypiggy.rtdd.block.Blocks.*;
import static io.github.crazypiggy.rtdd.Main.ofModIdentifier;

public class Items {
    public static final Item TEST_ITEM = new Item(new Item.Settings());
    public static void register() {
        register("test_item", TEST_ITEM);
        register("test_block", new BlockItem(TEST_BLOCK, new Item.Settings()));
    }

    private static void register(String path, Item item) {
        Registry.register(Registries.ITEM, ofModIdentifier(path), item);
    }
}
