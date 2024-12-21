package com.eirmax.betterbrushes;





import com.eirmax.betterbrushes.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class BetterBrushes {
    public static final String MOD_ID = "betterbrushes";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    public static void init() {
        ModItems.registerModItems();




    }
}
