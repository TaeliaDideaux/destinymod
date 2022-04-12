package com.TaeliaDideaux.destinymod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("destinymod")
public class DestinyMod {

	public DestinyMod() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
