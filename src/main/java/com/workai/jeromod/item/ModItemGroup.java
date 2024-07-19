package com.workai.jeromod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup JEROME_ITEM_GROUP = new ItemGroup("jeromod_tab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.JEROMIUM.get());
        }
        
    };
}
