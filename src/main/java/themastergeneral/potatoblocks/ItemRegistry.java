package themastergeneral.potatoblocks;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry 
{    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PotatoBlocks.MODID);
	
	public static final RegistryObject<Item> potato_block = ITEMS.register("potato_block", () -> ModItems.potato_block_item);
}
