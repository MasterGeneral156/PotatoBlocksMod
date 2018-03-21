package com.themastergeneral.potatoblocks.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.potatoblocks.PotatoBlocks;

public class PotatoBlock extends CTDBlock {

	public PotatoBlock(String name) {
		super(Material.PLANTS, name, PotatoBlocks.MODID);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

}
