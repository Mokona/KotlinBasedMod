package org.puupuu.kotlinbasedmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = KotlinBasedMod.MODID, version = KotlinBasedMod.VERSION)
public class KotlinBasedMod
{
    static final String MODID = "kotlinbasedmod";
    static final String VERSION = "0.1";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        TestKotlin test = new TestKotlin(logger);
        test.go();
    }
}
