package com.eirmax.betterbrushes.item;

import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import static dev.architectury.registry.item.ItemPropertiesRegistry.register;

public class ModModelPredicates {
    public ModModelPredicates(){
        register(ModItems.IRON_BRUSH, Identifier.ofVanilla("brushing"), (stack, world, entity, seed) -> {
            return entity != null && entity.getActiveItem() == stack ? (float)(entity.getItemUseTimeLeft() % 10) / 10.0F : 0.0F;

        });
        register(ModItems.GOLD_BRUSH, Identifier.ofVanilla("brushing"), (stack, world, entity, seed) -> {
            return entity != null && entity.getActiveItem() == stack ? (float)(entity.getItemUseTimeLeft() % 10) / 10.0F : 0.0F;

        });
        register(ModItems.DIAMOND_BRUSH, Identifier.ofVanilla("brushing"), (stack, world, entity, seed) -> {
            return entity != null && entity.getActiveItem() == stack ? (float)(entity.getItemUseTimeLeft() % 10) / 10.0F : 0.0F;

        });
        register(ModItems.NETHERITE_BRUSH, Identifier.ofVanilla("brushing"), (stack, world, entity, seed) -> {
            return entity != null && entity.getActiveItem() == stack ? (float)(entity.getItemUseTimeLeft() % 10) / 10.0F : 0.0F;

        });
    }

}
