package io.github.crazypiggy.rtdd.common.block;


import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

//b_86 金币堆
public class SmallPileOfItemsBlock extends AbstractPileOfItemsBlock {

    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 2.0, 14.0);

    public SmallPileOfItemsBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return Block.hasTopRim(world, pos.down());
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (!canPlaceAt(state, world, pos)) {
            world.removeBlock(pos, false);
            return;
        }
        super.neighborUpdate(state, world, pos, sourceBlock, sourcePos, notify);
    }
}
