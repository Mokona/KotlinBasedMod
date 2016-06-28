package org.puupuu.kotlinbasedmod

import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraftforge.client.model.ModelLoader

open class CommonProxy {
    open fun associateTextureToItem(item: Item, name: String) {
    }
}

class ServerSideProxy : CommonProxy()

class ClientSideProxy : CommonProxy() {
    override fun associateTextureToItem(item: Item, name: String) {
        super.associateTextureToItem(item, name)

        val completeResourceName = KotlinBasedMod.MODID + ":" + name

        ModelLoader.setCustomModelResourceLocation(
                item,
                0,
                ModelResourceLocation(completeResourceName, "inventory"))
    }
}
