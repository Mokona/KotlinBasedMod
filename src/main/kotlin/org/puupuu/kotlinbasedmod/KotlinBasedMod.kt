package org.puupuu.kotlinbasedmod

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.SidedProxy
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import org.apache.logging.log4j.Logger

@Mod(modid = KotlinBasedMod.MODID, version = KotlinBasedMod.VERSION,
        modLanguageAdapter = "io.drakon.forge.kotlin.KotlinAdapter")
object KotlinBasedMod {
    const val MODID = "kotlinbasedmod"
    const val VERSION = "0.1"

    @SidedProxy(clientSide = "org.puupuu.kotlinbasedmod.ClientSideProxy",
            serverSide = "org.puupuu.kotlinbasedmod.ServerSideProxy")
    private var proxy: CommonProxy? = null

    private lateinit var logger: Logger
    private val builder by lazy { ModBuilder(proxy!!) }

    @EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        logger = event.modLog
        builder.preInit()
    }

    @EventHandler
    fun init(event: FMLInitializationEvent) {
    }
}
