package net.khaled.extralamps.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.khaled.extralamps.ExtraLamps;
import net.khaled.extralamps.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup LAMPS = FabricItemGroupBuilder.build(new Identifier(ExtraLamps.MOD_ID, "blue_lamp"), () -> new ItemStack(ModBlocks.BLUE_LAMP));
}
