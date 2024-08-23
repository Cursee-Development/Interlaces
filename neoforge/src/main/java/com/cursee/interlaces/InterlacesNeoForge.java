package com.cursee.interlaces;

import com.cursee.interlaces.core.registry.ModRegistryNeoForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class InterlacesNeoForge {
    
    public InterlacesNeoForge() {
    
        Interlaces.init();

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModRegistryNeoForge.register(bus);
    }
}