package net.quackems.quackemsadditions.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.quackems.quackemsadditions.QuackemsAdditions;
import net.quackems.quackemsadditions.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
                    DeferredRegister.create(Registries.CREATIVE_MODE_TAB, QuackemsAdditions.MOD_ID);


    public static final RegistryObject<CreativeModeTab> QUACKEMS_ADDITIONS_TAB = CREATIVE_MODE_TABS.register("quackems_additions_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TENEBRITE_INGOT.get()))
                    .title(Component.translatable("creativetab.quackemsadditions.quackems_additions"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TENEBRITE_INGOT.get());
                        pOutput.accept(ModItems.RAW_TENEBRITE.get());
                        pOutput.accept(ModItems.SOLARIUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_SOLARIUM.get());


                        pOutput.accept(ModBlocks.TENEBRITE_BLOCK.get());
                        pOutput.accept(ModBlocks.TENEBRITE_ORE.get());
                        pOutput.accept(ModBlocks.TENEBRITE_ORE.get());
                    })


                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
