package themastergeneral.potatoblocks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.themastergeneral.ctdcore.block.CTDBlock;

import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("potatoblocks")
public class PotatoBlocks
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static PotatoBlocks instance;
    
    public static CTDBlock potato_block = new CTDBlock(Properties.of(Material.PLANT));
    public static BlockItem potato_block_item = new BlockItem(potato_block.getBlock(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS));

	public static final String MODID = "potatoblocks";

    public PotatoBlocks() 
    {
    	instance = this;
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    	MinecraftForge.EVENT_BUS.register(this);
    	
    	ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    	BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
		LOGGER.info("Potato Blocks is launching.");
    }
    
    public static class ItemRegistry {
    	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    	
    	public static final RegistryObject<Item> potato_block = ITEMS.register("potato_block", () -> PotatoBlocks.potato_block_item);
    }
    
    public static class BlockRegistry {
    	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    	
    	public static final RegistryObject<Block> potato_block = BLOCKS.register("potato_block", () -> PotatoBlocks.potato_block);
    }

}
