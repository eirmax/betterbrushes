package com.eirmax.betterbrushes.item;


import com.eirmax.betterbrushes.BetterBrushes;
import com.eirmax.betterbrushes.item.Brushes.Diamond_brush;
import com.eirmax.betterbrushes.item.Brushes.Gold_brush;
import com.eirmax.betterbrushes.item.Brushes.Iron_brush;
import com.eirmax.betterbrushes.item.Brushes.Netherite_brush;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BetterBrushes.MOD_ID, name), item);
    }


    public static final Item IRON_BRUSH = registerItem("iron_brush",
             new Iron_brush(new Item.Settings().maxDamage(100)));
    public static final Item GOLD_BRUSH = registerItem("gold_brush",
            new Gold_brush(new Item.Settings().maxDamage(250)));
    public static final Item DIAMOND_BRUSH = registerItem("diamond_brush",
            new Diamond_brush(new Item.Settings().maxDamage(340)));
    public static final Item NETHERITE_BRUSH = registerItem("netherite_brush",
            new Netherite_brush(new Item.Settings().maxDamage(500)));
    public static final Item IMPROVED_FEATHER = registerItem("improved_feather",
            new Item(new Item.Settings()));





    public static void registerModItems() {
        BetterBrushes.LOGGER.info("Registering Mod Items for " + BetterBrushes.MOD_ID);

    }
}