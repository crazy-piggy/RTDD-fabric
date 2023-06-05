package io.github.crazypiggy.rtdd.common.item;

import net.minecraft.item.ItemPlacementContext;

/**
 * 可以右键与售卖盒交互的物品
 */
public interface SaleBoxInteractive {

    void onInteract(ItemPlacementContext itemPlacementContext);
}
