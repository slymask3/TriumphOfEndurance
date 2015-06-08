package com.abstractlabs.toe.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorToe implements IWorldGenerator  {
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		case 8: generateHollows(world, random, chunkX*16, chunkZ*16);
		}
	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		//generateArena(world, random, blockX + random.nextInt(16), random.nextInt(60), blockZ + random.nextInt(16), new WorldGenArenaDesert(), 200); //500
		//generateArena(world, random, blockX + random.nextInt(16), random.nextInt(60), blockZ + random.nextInt(16), new WorldGenArenaUnderwater(), 300);
	}

	private void generateNether(World world, Random random, int blockX, int blockZ) {
		//todo nether domes
	}

	private void generateArena(World world, Random random, int x, int y, int z, WorldGenerator gen, int rarity) {
		if(random.nextInt(rarity) == 0) {
			gen.generate(world, random, x, y, z);
		}
	}

	private void generateHollows(World world, Random random, int chunkX, int chunkZ)
	{
		/*
		for(int i = 0; i < 20; i++)
		{
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = random.nextInt(90);
			int Zcoord1 = chunkZ + random.nextInt(16);

			(new WorldGenForestHollowTree(false, 7, 0, 0, false)).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
		*/
	}
}