package net.quackems.quackemsadditions.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.quackems.quackemsadditions.QuackemsAdditions;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, QuackemsAdditions.MOD_ID);



    public static final RegistryObject<Item> TENEBRITE_INGOT = ITEMS.register("tenebrite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TENEBRITE = ITEMS.register("raw_tenebrite",
            () -> new Item(new Item.Properties()));






    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
