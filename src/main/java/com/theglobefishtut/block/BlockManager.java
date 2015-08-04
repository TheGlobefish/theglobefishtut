package com.theglobefishtut.block;

import net.minecraftforge.fml.common.registry.GameRegistry;
 
public class BlockManager {
	
	public static TutBlock tutBlock;
	
    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
 
    public static void initializeItem() {
    	tutBlock = new TutBlock();
    }
 
    public static void registerItem() {
    	GameRegistry.registerBlock(tutBlock, tutBlock.name);
    }
 
}