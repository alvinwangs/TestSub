package com.anda.sub

class Application(var started: Boolean = true) {
    fun start(): Boolean {
        println("started")
        return started
    }
}

fun main() {
    Application().start()
}