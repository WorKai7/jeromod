package com.workai.jeromod.item;

import com.workai.jeromod.Jeromod;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        Jeromod.MOD_ID);



        public static final RegistryObject<Item> JEROMIUM = ITEMS.register("jeromium",
                        () -> new Item(new Item.Properties().tab(ModItemGroup.JEROME_ITEM_GROUP)));


        public static final RegistryObject<Item> JEROMIUM_NUGGET = ITEMS.register("jeromium_nugget",
                        () -> new Item(new Item.Properties().tab(ModItemGroup.JEROME_ITEM_GROUP)));

        public static final RegistryObject<Item> JEROMIUM_STICK = ITEMS.register("jeromium_stick",
                        () -> new Item(new Item.Properties().tab(ModItemGroup.JEROME_ITEM_GROUP)));



        public static final RegistryObject<Item> JEROMIUM_SWORD = ITEMS.register("jeromium_sword",
                        () -> new SwordItem(ModItemTier.JEROMIUM, 3, -2.4f,
                                        new Item.Properties().tab(ModItemGroup.JEROME_ITEM_GROUP)));

        public static final RegistryObject<Item> JEROMIUM_PICKAXE = ITEMS.register("jeromium_pickaxe",
                        () -> new PickaxeItem(ModItemTier.JEROMIUM, 1, -2.8f,
                                        new Item.Properties().tab(ModItemGroup.JEROME_ITEM_GROUP)));

        public static final RegistryObject<Item> JEROMIUM_AXE = ITEMS.register("jeromium_axe",
                        () -> new AxeItem(ModItemTier.JEROMIUM, 5, -3,
                                        new Item.Properties().tab(ModItemGroup.JEROME_ITEM_GROUP)));

        public static final RegistryObject<Item> JEROMIUM_SHOVEL = ITEMS.register("jeromium_shovel",
                        () -> new ShovelItem(ModItemTier.JEROMIUM, 1.5f, -3,
                                        new Item.Properties().tab(ModItemGroup.JEROME_ITEM_GROUP)));

        public static final RegistryObject<Item> JEROMIUM_HOE = ITEMS.register("jeromium_hoe",
                        () -> new HoeItem(ModItemTier.JEROMIUM, -5, 0,
                                        new Item.Properties().tab(ModItemGroup.JEROME_ITEM_GROUP)));



        public static final RegistryObject<Item> JEROMIUM_BOOTS = ITEMS.register("jeromium_boots",
                        () -> new ArmorItem(ModArmorMaterial.JEROMIUM, EquipmentSlotType.FEET,
                                        new Item.Properties().tab(ModItemGroup.JEROME_ITEM_GROUP)));

        public static final RegistryObject<Item> JEROMIUM_LEGGINGS = ITEMS.register("jeromium_leggings",
                        () -> new ArmorItem(ModArmorMaterial.JEROMIUM, EquipmentSlotType.LEGS,
                                        new Item.Properties().tab(ModItemGroup.JEROME_ITEM_GROUP)));

        public static final RegistryObject<Item> JEROMIUM_CHESTPLATE = ITEMS.register("jeromium_chestplate",
                        () -> new ArmorItem(ModArmorMaterial.JEROMIUM, EquipmentSlotType.CHEST,
                                        new Item.Properties().tab(ModItemGroup.JEROME_ITEM_GROUP)));

        public static final RegistryObject<Item> JEROMIUM_HELMET = ITEMS.register("jeromium_helmet",
                        () -> new ArmorItem(ModArmorMaterial.JEROMIUM, EquipmentSlotType.HEAD,
                                        new Item.Properties().tab(ModItemGroup.JEROME_ITEM_GROUP)));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
