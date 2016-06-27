package org.puupuu.kotlinbasedmod

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import org.apache.logging.log4j.Logger

@Mod(modid = KotlinBasedMod.MODID, version = KotlinBasedMod.VERSION)
class KotlinBasedMod {
    private var logger: Logger? = null

    @EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        logger = event.modLog
    }

    @EventHandler
    fun init(event: FMLInitializationEvent) {
        val test = TestKotlin(logger!!)
        test.go()
    }

    companion object {
        internal const val MODID = "kotlinbasedmod"
        internal const val VERSION = "0.1"
    }
}
