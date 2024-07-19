package com.workai.jeromod.world.gen;

import com.workai.jeromod.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;

public enum OreType {
    JEROMIUM(ModBlocks.JEROMIUM_ORE, 3, 2, 16, 2);

    private final RegistryObject<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int veinsPerChunk;

    OreType(RegistryObject<Block> block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
    }

    public RegistryObject<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }
}
