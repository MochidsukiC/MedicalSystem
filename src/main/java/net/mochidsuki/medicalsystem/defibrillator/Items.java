package net.mochidsuki.medicalsystem.defibrillator;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mochidsuki.medicalsystem.MedicalSystem;

public class Items {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MedicalSystem.MODID);

    //医療機器(ブロックあり)
    public static final RegistryObject<Item> DEFIBRILLATOR = ITEMS.register("defibrillator", () -> new BlockItem(Blocks.DEFIBRILLATOR.get(),new Item.Properties().rarity(Rarity.EPIC)));//除細動器
    public static final RegistryObject<Item> ECMO = ITEMS.register("ecmo", () -> new BlockItem(Blocks.ECMO.get(),new Item.Properties().rarity(Rarity.EPIC)));//除細動器
    public static final RegistryObject<Item> HEART_LUNG_MACHINE = ITEMS.register("heart_lung_machine", () -> new BlockItem(Blocks.HEART_LUNG_MACHINE.get(),new Item.Properties().rarity(Rarity.EPIC)));//人工心肺
    public static final RegistryObject<Item> VENTILATOR = ITEMS.register("ventilator", () -> new BlockItem(Blocks.VENTILATOR.get(),new Item.Properties().rarity(Rarity.EPIC)));//人工呼吸器



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
