package com.workai.jeromod.block;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.Tags.IOptionalNamedTag;

public class JeromodTags {
    
    public static class Items {
        
        public static final Tags.IOptionalNamedTag<Item> JEROMIUM = createForgeTag("gems/jeromium");

        private static IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}
