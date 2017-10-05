package com.smoroa14_kevox.virusmod.proxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        /*GameRegistry.addShapedRecipe(new ResourceLocation("Test"), null, new ItemStack(Items.EGG),
                " p ",
                " p ",
                " s ",
                'p', Items.PAPER,
                's', Items.STICK);*/




    }
}
