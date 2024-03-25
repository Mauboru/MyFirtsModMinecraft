package com.mauboru.firstmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("My First Mod")
public class FirtsMod {
    public FirtsMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
