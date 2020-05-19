package fr.mateoox600.nukecraft.init;

import fr.mateoox600.nukecraft.Main;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Main.MOD_ID)
public class BlocksInit {

    public static final Block iridium_ore = null;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e){
        e.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2f, 10f).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)).setRegistryName("iridium_ore"));
    }

    @SubscribeEvent
    public static void registerBlocksItem(RegistryEvent.Register<Item> e){
        e.getRegistry().register(new BlockItem(iridium_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("iridium_ore"));
    }

}
