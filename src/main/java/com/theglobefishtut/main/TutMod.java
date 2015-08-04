package com.theglobefishtut.main;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

import com.theglobefishtut.block.BlockManager;
import com.theglobefishtut.item.ItemManager;

@Mod(modid = TutMod.MODID, name = TutMod.NAME, version = TutMod.VERSION)
public class TutMod
{
    public static final String MODID = "theglobefishtut";
    public static final String NAME = "TheGlobefish's TutMod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preint(FMLPreInitializationEvent event)
    {
    	ItemManager.mainRegistry();
    	BlockManager.mainRegistry();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	if(event.getSide() == Side.CLIENT)
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
 
            renderItem.getItemModelMesher().register(ItemManager.tutItem, 0, new ModelResourceLocation(this.MODID + ":" + ItemManager.tutItem.name, "inventory"));
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(BlockManager.tutBlock), 0, new ModelResourceLocation(this.MODID + ":" + BlockManager.tutBlock.name, "inventory"));
        }
    }
}
