package fr.mateoox600.nukecraft.init;

import fr.mateoox600.nukecraft.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Main.MOD_ID)
public class ItemsInit {

    public static final Item iridium = null;
    public static final Item iridium_ingot = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> e){
        e.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("iridium"));
        e.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("iridium_ingot"));
    }

}
