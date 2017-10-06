package com.smoroa14_kevox.virusmod.engine;

import com.smoroa14_kevox.virusmod.proxy.CommonProxy;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PlaceWater implements Runnable {

    private World world;
    private int x;
    private int y;
    private int z;

    public PlaceWater(World world, int x, int y, int z) {

        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void run() {
        Thread[] ts = new Thread[4];
        IBlockState bs = world.getBlockState(new BlockPos(x+1, y, z));
        threads(bs,x+1, y, z, ts, 0);

        bs = world.getBlockState(new BlockPos(x-1, y, z));
        threads(bs,x-1, y, z, ts, 1);

        bs = world.getBlockState(new BlockPos(x, y, z+1));
        threads(bs,x, y, z+1, ts, 2);

        bs = world.getBlockState(new BlockPos(x, y, z-1));
        threads(bs,x, y, z-1, ts, 3);

    }

    public void threads(IBlockState bs, int x, int y, int z, Thread[] ts, int pos)
    {
        System.out.println(pos + " ---------------------------------------------------------------------------------------------");
        bs = world.getBlockState(new BlockPos(x, y, z));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(bs.getBlock() == Blocks.AIR)
        {
            world.setBlockState(new BlockPos(x, y, z), CommonProxy.GRASS_VIRUS_BLOCK.getDefaultState());
            Thread t = new Thread(new PlaceWater(world, x, y, z));
            ts[pos] = t;
                ts[pos].start();
                /*CommonProxy.WATER_VIRUS_BUCKET.notify();
                try {
                    CommonProxy.WATER_VIRUS_BUCKET.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
        }
    }
}
