package com.theglobefishtut.block;

import com.theglobefishtut.main.TutMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TutBlock extends Block {
	public static final String name = "tutblock";
	public TutBlock() {
		super(Material.rock);
		this.setUnlocalizedName(TutMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabMisc);
	}
}
