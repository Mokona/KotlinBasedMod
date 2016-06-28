package org.puupuu.kotlinbasedmod

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraftforge.fml.common.registry.GameRegistry

class ModBuilder(val proxy: CommonProxy) {
    fun preInit() {
        val item = with(Item()) {
            setMaxStackSize(1)
            setRegistryName(KotlinBasedMod.MODID, "kotlinbasedmod_item")
            unlocalizedName = registryName.toString()
            setCreativeTab(CreativeTabs.tabTools)

            GameRegistry.register(this)
        }

        proxy.associateTextureToItem(item, "kotlinbasedmod_item")
    }
}
