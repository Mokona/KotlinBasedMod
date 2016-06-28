package org.puupuu.kotlinbasedmod

import net.minecraft.item.Item
import net.minecraftforge.fml.common.registry.GameRegistry

class ModBuilder() {
    fun preInit() {
        with(Item()) {
            setMaxStackSize(1)
            setRegistryName(KotlinBasedMod.MODID, "kotlinbaseditem")
            unlocalizedName = registryName.toString()

            GameRegistry.register(this)
        }

    }
}