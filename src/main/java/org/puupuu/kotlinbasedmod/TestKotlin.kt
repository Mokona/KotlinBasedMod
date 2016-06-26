package org.puupuu.kotlinbasedmod

import org.apache.logging.log4j.Logger

class TestKotlin(val logger: Logger) {
    fun go() {
        logger.info("I'm module ${KotlinBasedMod.MODID} at version ${KotlinBasedMod.VERSION}.");
    }
}
