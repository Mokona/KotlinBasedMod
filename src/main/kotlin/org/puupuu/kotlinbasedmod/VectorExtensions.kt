package org.puupuu.kotlinbasedmod

import net.minecraft.util.math.Vec3i

infix operator fun Vec3i.plus(other: Vec3i): Vec3i {
    return Vec3i(this.x + other.x, this.y + other.y, this.z + other.z)
}

infix operator fun Vec3i.minus(other: Vec3i): Vec3i {
    return Vec3i(this.x - other.x, this.y - other.y, this.z - other.z)
}
