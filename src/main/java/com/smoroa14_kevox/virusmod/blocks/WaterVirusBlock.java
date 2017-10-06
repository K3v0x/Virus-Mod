package com.smoroa14_kevox.virusmod.blocks;

import com.smoroa14_kevox.virusmod.proxy.CommonProxy;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidEvent;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class WaterVirusBlock extends Fluid{
    public WaterVirusBlock(String name) {
        super("infected_water", new ResourceLocation("blocks/water_still"), new ResourceLocation("blocks/water_flow"));

    }




}
