package org.puupuu.kotlinbasedmod

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import org.apache.logging.log4j.Logger

@Mod(modid = KotlinBasedMod.MODID, version = KotlinBasedMod.VERSION,
        modLanguageAdapter = "io.drakon.forge.kotlin.KotlinAdapter")
object KotlinBasedMod {
    const val MODID = "kotlinbasedmod"
    const val VERSION = "0.1"

    private var logger: Logger? = null

    @EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        logger = event.modLog
    }

    @EventHandler
    fun init(event: FMLInitializationEvent) {
    }
}
