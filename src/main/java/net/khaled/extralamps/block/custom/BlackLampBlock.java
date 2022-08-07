package net.khaled.extralamps.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlackLampBlock extends Block {
    public static final BooleanProperty LIT = BooleanProperty.of("lit");

    public BlackLampBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)this.getDefaultState().with(LIT, false));
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if(!world.isClient){
            boolean bl = state.get(LIT);
            if(bl != world.isReceivingRedstonePower(pos)) {
                world.setBlockState(pos, state.cycle(LIT));
            }
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }
}
