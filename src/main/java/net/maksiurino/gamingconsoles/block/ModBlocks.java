package net.maksiurino.gamingconsoles.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.maksiurino.gamingconsoles.GamingConsoles;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block NINTENDO_SWITCH = registerBlock("nintendo_switch",
            new Block(FabricBlockSettings.create().mapColor(DyeColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(1.8F)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(GamingConsoles.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(GamingConsoles.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        GamingConsoles.LOGGER.info("Registering ModBlocks for " + GamingConsoles.MOD_ID);
    }
}
