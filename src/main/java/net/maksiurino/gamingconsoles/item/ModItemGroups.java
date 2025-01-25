package net.maksiurino.gamingconsoles.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maksiurino.gamingconsoles.GamingConsoles;
import net.maksiurino.gamingconsoles.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup NINTENDO_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GamingConsoles.MOD_ID, "nintendo_switch"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.gamingconsoles.nintendo_switch"))
                    .icon(() -> new ItemStack(ModBlocks.NINTENDO_SWITCH)).entries((displayContext, entries) -> {
                        entries.add(ModItems.LCD);
                        entries.add(ModItems.BLACK_GRILL);
                        entries.add(Items.BLACK_CONCRETE);
                        entries.add(Items.POLISHED_BLACKSTONE_BUTTON);
                        entries.add(Items.BLACK_BANNER);
                        entries.add(ModBlocks.NINTENDO_SWITCH);



                    }).build());

    public static void registerItemGroups() {
        GamingConsoles.LOGGER.info("Registering Item Groups for " + GamingConsoles.MOD_ID);
    }
}
