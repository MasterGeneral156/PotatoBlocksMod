package com.themastergeneral.potatoblocks.proxy;

import com.themastergeneral.potatoblocks.blocks.ModBlocks;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Common {

	public void preInit(FMLPreInitializationEvent e) {
		ModBlocks.loadBlocks();
	}

	public void init(FMLInitializationEvent e) {

	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}