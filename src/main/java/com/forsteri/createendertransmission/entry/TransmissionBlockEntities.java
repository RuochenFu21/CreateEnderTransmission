package com.forsteri.createendertransmission.entry;

import com.forsteri.createendertransmission.blocks.chunkLoader.LoaderBlockEntity;
import com.forsteri.createendertransmission.blocks.chunkLoader.LoaderInstance;
import com.forsteri.createendertransmission.blocks.energyTransmitter.EnergyTransmitterBlockEntity;
import com.forsteri.createendertransmission.blocks.fluidTrasmitter.FluidTransmitterBlockEntity;
import com.forsteri.createendertransmission.blocks.itemTransmitter.ItemTransmitterBlockEntity;
import com.simibubi.create.content.kinetics.base.ShaftInstance;
import com.simibubi.create.foundation.blockEntity.renderer.SmartBlockEntityRenderer;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import com.forsteri.createendertransmission.CreateEnderTransmission;

public class TransmissionBlockEntities {

    private static final CreateRegistrate REGISTRATE = CreateEnderTransmission
            .registrate();

    public static final BlockEntityEntry<LoaderBlockEntity> CHUNK_LOADER_TILE = REGISTRATE
            .blockEntity("chunk_loader", LoaderBlockEntity::new)
            .instance(() -> LoaderInstance::new, false)
            .validBlocks(TransmissionBlocks.CHUNK_LOADER_BLOCK)
            .renderer(() -> SmartBlockEntityRenderer::new)
            .register();

    public static final BlockEntityEntry<EnergyTransmitterBlockEntity> ENERGY_TRANSMITTER_TILE = REGISTRATE
            .blockEntity("energy_transmitter", EnergyTransmitterBlockEntity::new)
            .instance(() -> ShaftInstance::new, false)
            .validBlocks(TransmissionBlocks.ENERGY_TRANSMITTER_BLOCK)
            .renderer(() -> SmartBlockEntityRenderer::new)
            .register();

    public static final BlockEntityEntry<ItemTransmitterBlockEntity> ITEM_TRANSMITTER_TILE_ENTITY = REGISTRATE
            .blockEntity("item_transmitter", ItemTransmitterBlockEntity::new)
            .validBlocks(TransmissionBlocks.ITEM_TRANSMITTER_BLOCK)
            .register();

    public static final BlockEntityEntry<FluidTransmitterBlockEntity> FLUID_TRANSMITTER_TILE_ENTITY = REGISTRATE
            .blockEntity("fluid_transmitter", FluidTransmitterBlockEntity::new)
            .validBlocks(TransmissionBlocks.FLUID_TRANSMITTER_BLOCK)
            .register();

    public static void register(){}
}
