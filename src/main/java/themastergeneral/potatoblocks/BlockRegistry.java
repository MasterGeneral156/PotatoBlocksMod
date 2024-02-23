package themastergeneral.potatoblocks;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PotatoBlocks.MODID);
	
	public static final RegistryObject<Block> potato_block_reg = BLOCKS.register("potato_block", () -> ModBlocks.potato_block);
}