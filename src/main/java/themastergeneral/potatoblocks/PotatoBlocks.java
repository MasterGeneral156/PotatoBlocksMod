package themastergeneral.potatoblocks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("potatoblocks")
public class PotatoBlocks
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static PotatoBlocks instance;

	public static final String MODID = "potatoblocks";

    public PotatoBlocks() 
    {
    	instance = this;
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(this::setup);
        modbus.addListener(this::fillTab);

        // Register ourselves for server, registry and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        
        ItemRegistry.ITEMS.register(modbus);
        BlockRegistry.BLOCKS.register(modbus);
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
		LOGGER.info("Potato Blocks is launching.");
    }
    
    private void fillTab(BuildCreativeModeTabContentsEvent ev)
	{
		if (ev.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS)
			ev.accept(ModItems.potato_block_item);
	}
}
