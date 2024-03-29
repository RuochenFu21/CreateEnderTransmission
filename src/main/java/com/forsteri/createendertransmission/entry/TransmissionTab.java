package com.forsteri.createendertransmission.entry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class TransmissionTab {
    public static final CreativeModeTab TAB = new CreativeModeTab("ender_transmission") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(TransmissionBlocks.CHUNK_LOADER_BLOCK.get());
        }
    };
}
