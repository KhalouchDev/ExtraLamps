package net.khaled.extralamps.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.khaled.extralamps.ExtraLamps;
import net.khaled.extralamps.block.custom.*;
import net.khaled.extralamps.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

public class ModBlocks {

    public static final Block BLUE_LAMP = registerBlock("blue_lamp", new BlueLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(BlueLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block RED_LAMP = registerBlock("red_lamp", new RedLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(RedLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block GREEN_LAMP = registerBlock("green_lamp", new GreenLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(GreenLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block MAGENTA_LAMP = registerBlock("magenta_lamp", new MagentaLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(MagentaLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block YELLOW_LAMP = registerBlock("yellow_lamp", new YellowLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(YellowLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block ORANGE_LAMP = registerBlock("orange_lamp", new OrangeLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(OrangeLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block LIME_LAMP = registerBlock("lime_lamp", new LimeLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(LimeLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block CYAN_LAMP = registerBlock("cyan_lamp", new CyanLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(CyanLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block PINK_LAMP = registerBlock("pink_lamp", new PinkLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(PinkLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block LIGHT_BLUE_LAMP = registerBlock("light_blue_lamp", new LightBlueLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(LightBlueLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block BROWN_LAMP = registerBlock("brown_lamp", new LightBlueLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(BrownLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block GRAY_LAMP = registerBlock("gray_lamp", new GrayLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(GrayLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block LIGHT_GRAY_LAMP = registerBlock("light_gray_lamp", new LightGrayLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(LightGrayLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block WHITE_LAMP = registerBlock("white_lamp", new WhiteLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(WhiteLampBlock.LIT) ? 15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);
    public static final Block BLACK_LAMP = registerBlock("black_lamp", new BlackLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).strength(0.3f).luminance(state -> state.get(BlackLampBlock.LIT) ?  15 : 0).sounds(BlockSoundGroup.GLASS)), ModItemGroup.LAMPS);

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
