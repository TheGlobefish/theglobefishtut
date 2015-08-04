package com.theglobefishtut.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.theglobefishtut.main.TutMod;

public class TutItem extends Item {
	public static final String name = "tutitem";
	public TutItem() {
		super();
		this.setUnlocalizedName(TutMod.MODID + "_" + this.name);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
}
