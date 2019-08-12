package com.anda.sub

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ApplicationTest {


    @Test
    fun shouldStarted() {
        println("shouldStarted")





        val started = Application(true).start()
        assertTrue(started)
    }
}