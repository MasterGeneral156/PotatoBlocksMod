package com.themastergeneral.potatoblocks.blocks;

import com.themastergeneral.ctdcore.block.RegisterBlock;

public class ModBlocks extends RegisterBlock {
	public static PotatoBlock potato_block;

	public static void loadBlocks() {
		potato_block = register(new PotatoBlock("potato_block"));
	}
}
