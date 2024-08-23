package com.cursee.interlaces;

import com.cursee.interlaces.core.registry.ModRegistryForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class InterlacesForge {
    
    public InterlacesForge() {
    
        Interlaces.init();

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModRegistryForge.register(bus);
    }
}