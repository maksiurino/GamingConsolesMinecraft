package net.maksiurino.gamingconsoles.block;

import net.maksiurino.gamingconsoles.GamingConsoles;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block NINTENDO_SWITCH = new NintendoSwitch(AbstractBlock.Settings.create(Material.STONE));

    public static void registerBlocks() {
        Registry.register(Registries.BLOCK, new Identifier(GamingConsoles.MOD_ID, "nintendo_switch"), NINTENDO_SWITCH);
    }

    public static void registerModBlocks() {
        GamingConsoles.LOGGER.info("Registering ModBlocks for " + GamingConsoles.MOD_ID);
    }
}
