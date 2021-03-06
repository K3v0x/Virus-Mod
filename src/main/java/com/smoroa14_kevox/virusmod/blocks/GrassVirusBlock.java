package com.smoroa14_kevox.virusmod.blocks;


import com.smoroa14_kevox.virusmod.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class GrassVirusBlock extends Block{
    public GrassVirusBlock(String name)
    {
        super(Material.GRASS);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        //Configuration block
        setHardness(2.f);
        setResistance(4.f);
        setSoundType(SoundType.PLANT);
    }


    public void updateTick(World world, int x, int y, int z, Random rand)
    {
        System.out.println("update!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }


    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random rand)
    {
        Block b = world.getBlockState(new BlockPos(x+1, y, z)).getBlock();
        if(b != Blocks.AIR && b != CommonProxy.GRASS_VIRUS_BLOCK)
        {
            world.setBlockState(new BlockPos(x+1, y, z), world.getBlockState(new BlockPos(x, y, z)));
        }
        b = world.getBlockState(new BlockPos(x-1, y, z)).getBlock();
        if(b != Blocks.AIR && b != CommonProxy.GRASS_VIRUS_BLOCK)
        {
            world.setBlockState(new BlockPos(x-1, y, z), world.getBlockState(new BlockPos(x, y, z)));
        }
        b = world.getBlockState(new BlockPos(x, y, z+1)).getBlock();
        if(b != Blocks.AIR && b != CommonProxy.GRASS_VIRUS_BLOCK)
        {
            world.setBlockState(new BlockPos(x, y, z+1), world.getBlockState(new BlockPos(x, y, z)));
        }
        b = world.getBlockState(new BlockPos(x, y, z-1)).getBlock();
        if(b != Blocks.AIR && b != CommonProxy.GRASS_VIRUS_BLOCK)
        {
            world.setBlockState(new BlockPos(x+1, y, z-1), world.getBlockState(new BlockPos(x, y, z)));
        }
    }


}
