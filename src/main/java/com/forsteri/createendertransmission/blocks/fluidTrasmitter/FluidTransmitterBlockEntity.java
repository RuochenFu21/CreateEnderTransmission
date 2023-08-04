package com.forsteri.createendertransmission.blocks.fluidTrasmitter;

import com.forsteri.createendertransmission.blocks.AbstractMatterTransmitterBlockEntity;
import com.forsteri.createendertransmission.blocks.MatterTransmitterNetwork;
import io.github.fabricators_of_create.porting_lib.transfer.fluid.FluidTransferable;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class FluidTransmitterBlockEntity extends AbstractMatterTransmitterBlockEntity implements FluidTransferable {
    public FluidTransmitterBlockEntity(BlockEntityType<?> typeIn, BlockPos pos, BlockState state) {
        super(typeIn, pos, state);
    }

    @Override
    protected MatterTransmitterNetwork getNetwork() {
        return MatterTransmitterNetwork.FLUID;
    }

    @SuppressWarnings("UnstableApiUsage")
    @Override
    public @Nullable Storage<FluidVariant> getFluidStorage(@Nullable Direction face) {
        return (SerializableSmartFluidTank) getInv();
    }
}