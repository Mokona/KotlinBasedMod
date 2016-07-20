package org.puupuu.kotlinbasedmod

import io.kotlintest.specs.WordSpec
import net.minecraft.util.math.Vec3i

class VectorExtensionsTest : WordSpec() {
    init {
        "Vec3i" should {
            "respond to add operator" {
                val a = Vec3i(1, 2, 3)
                val b = Vec3i(3, 2, 1)

                a + b shouldBe Vec3i(4, 4, 4)
            }

            "respond to sub operator" {
                val a = Vec3i(1, 2, 3)
                val b = Vec3i(3, 2, 1)

                a - b shouldBe Vec3i(-2, 0, 2)
            }
        }
    }
}
