package com.smoroa14_kevox.virusmod;

import com.smoroa14_kevox.virusmod.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = VirusMod.MODID, version = VirusMod.VERSION)
public class VirusMod
{
    public static final String MODID = "virusmod";
    public static final String VERSION = "1.0";

    @Mod.Instance
    public static VirusMod instance;

    @SidedProxy(clientSide = "com.smoroa14_kevox.virusmod.proxy.ClientProxy",
            serverSide = "com.smoroa14_kevox.virusmod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
     proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
