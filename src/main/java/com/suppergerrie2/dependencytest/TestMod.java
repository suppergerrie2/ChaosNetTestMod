package com.suppergerrie2.dependencytest;

import com.amazonaws.opensdk.config.ConnectionConfiguration;
import com.amazonaws.opensdk.config.TimeoutConfiguration;
import com.schematical.chaosnet.ChaosNet;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = TestMod.MODID, name = TestMod.NAME, version = TestMod.VERSION)
public class TestMod {
    public static final String MODID = "sdependencytest";
    public static final String NAME = "Test Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();

        ChaosNet sdk =  ChaosNet.builder()
                .build();

        logger.info(sdk);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }
}
