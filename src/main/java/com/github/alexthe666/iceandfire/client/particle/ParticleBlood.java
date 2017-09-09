package com.github.alexthe666.iceandfire.client.particle;

import net.minecraft.client.particle.ParticleRain;
import net.minecraft.world.World;

public class ParticleBlood extends ParticleRain {

	public ParticleBlood(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn) {
		super(worldIn, xCoordIn, yCoordIn, zCoordIn);
		this.particleRed = 1.0F;
		this.particleGreen = 0.0F;
		this.particleBlue = 0.0F;
	}
}
