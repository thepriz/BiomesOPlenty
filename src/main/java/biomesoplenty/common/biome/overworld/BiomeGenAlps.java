/*******************************************************************************
 * Copyright 2015, the Biomes O' Plenty Team
 * 
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License.
 * 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/.
 ******************************************************************************/

package biomesoplenty.common.biome.overworld;

import net.minecraft.init.Blocks;
import biomesoplenty.api.biome.BOPBiome;

public class BiomeGenAlps extends BOPBiome
{
	private static final Height biomeHeight = new Height(8.0F, 0.025F);
	
	public BiomeGenAlps()
	{
		this.setHeight(biomeHeight);
        this.setColor(13421772);
        this.setEnableSnow();
        this.setTemperatureRainfall(0.0F, 0.5F);
        
		this.topBlock = Blocks.snow.getDefaultState();
		this.fillerBlock = Blocks.snow.getDefaultState();
	}
}