package com.cursee.interlaces;

import com.cursee.interlaces.core.registry.ModRegistryFabric;
import net.fabricmc.api.ModInitializer;

public class InterlacesFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {

        Interlaces.init();

        ModRegistryFabric.register();
    }
}
