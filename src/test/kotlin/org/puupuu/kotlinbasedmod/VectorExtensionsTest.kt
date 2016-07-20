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

infix operator fun Vec3i.minus(other: Vec3i): Vec3i {
    return Vec3i(this.x - other.x, this.y - other.y, this.z - other.z)
}

infix operator fun Vec3i.plus(other: Vec3i): Vec3i {
    return Vec3i(this.x + other.x, this.y + other.y, this.z + other.z)
}
