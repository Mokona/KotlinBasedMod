package org.puupuu.kotlinbasedmod

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraftforge.fml.common.registry.GameRegistry

class ModBuilder(val proxy: CommonProxy) {
    fun preInit() {
        val itemName = "kotlinbasedmod_item"

        with(Item()) {
            register(itemName)
            associateTexture(proxy, itemName)
            setCreativeTab(CreativeTabs.tabTools)
        }
    }
}

fun Item.register(name: String) {
    setRegistryName(KotlinBasedMod.MODID, name)
    unlocalizedName = registryName.toString()
    GameRegistry.register(this)
}

fun Item.associateTexture(safeProxy: CommonProxy, name: String) {
    safeProxy.associateTextureToItem(this, name)
}
