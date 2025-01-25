package net.maksiurino.gamingconsoles.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maksiurino.gamingconsoles.GamingConsoles;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item LCD = registerItem("lcd", new Item(new FabricItemSettings()));
    public static final Item BLACK_GRILL = registerItem("black_grill", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(LCD);
        entries.add(BLACK_GRILL);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GamingConsoles.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GamingConsoles.LOGGER.info("Registering Mod Items for " + GamingConsoles.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
