package net.khaled.extralamps.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.khaled.extralamps.ExtraLamps;
import net.khaled.extralamps.block.custom.BlueLampBlock;
import net.khaled.extralamps.block.custom.GreenLampBlock;
import net.khaled.extralamps.block.custom.MagentaLampBlock;
import net.khaled.extralamps.block.custom.RedLampBlock;
import net.khaled.extralamps.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block BLUE_LAMP = registerBlock("blue_lamp", new BlueLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(BlueLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block RED_LAMP = registerBlock("red_lamp", new RedLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(RedLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block GREEN_LAMP = registerBlock("green_lamp", new GreenLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(GreenLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block MAGENTA_LAMP = registerBlock("magenta_lamp", new MagentaLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(MagentaLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(ExtraLamps.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem (String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(ExtraLamps.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(ExtraLamps.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    
    public static void registerModBlocks() {
        ExtraLamps.LOGGER.debug("Registering Mod Blocks for " + ExtraLamps.MOD_ID);
    }
}
