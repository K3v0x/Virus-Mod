package com.smoroa14_kevox.virusmod.proxy;

import jdk.nashorn.internal.ir.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        GameRegistry.addShapedRecipe(new ResourceLocation("Virus Essence"), null, new ItemStack(Items.WATER_BUCKET),
                "XXX",
                "XOX",
                "XXX",
                'X', Items.SLIME_BALL,
                'O', Items.NETHER_STAR);

        GameRegistry.addShapedRecipe(new ResourceLocation("Water Virus"), null, new ItemStack(Blocks.MYCELIUM),
                "XXX",
                "XOX",
                "XXX",
                'X', Blocks.LEAVES,
                'O',Items.WHEAT_SEEDS);

        GameRegistry.addShapedRecipe(new ResourceLocation("Grass Virus"), null, new ItemStack(Items.WATER_BUCKET),
                "XXX",
                "XOX",
                "XXX",
                'X', Blocks.LAPIS_ORE,
                'O', Items.WATER_BUCKET);

        GameRegistry.addShapedRecipe(new ResourceLocation("Lava Virus"), null, new ItemStack(Items.LAVA_BUCKET),
                "XXX",
                "XOX",
                "XXX",
                'X', Items.MAGMA_CREAM,
                'O', Items.LAVA_BUCKET);
    }
}
