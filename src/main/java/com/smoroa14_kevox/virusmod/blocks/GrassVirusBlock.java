package com.smoroa14_kevox.virusmod.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

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
}
