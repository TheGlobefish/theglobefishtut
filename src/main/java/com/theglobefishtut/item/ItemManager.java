package com.theglobefishtut.item;

import net.minecraftforge.fml.common.registry.GameRegistry;
 
public class ItemManager {
	
	public static TutItem tutItem;
	
    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
 
    public static void initializeItem() {
    	tutItem = new TutItem();
    }
 
    public static void registerItem() {
    	GameRegistry.registerItem(tutItem, tutItem.name);
    }
 
}