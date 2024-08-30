package com.example.miprimerscript

import java.time.LocalDateTime

class Logger private constructor() {
    init {
        println("Logger initialized")
    }

    fun log(message: String) {
        println("[$currentDateTime] - Logging: $message")
    }

    companion object {
        private var instance: Logger? = null

        val currentDateTime: String
            get() = LocalDateTime.now().toString()

        fun getInstance(): Logger {
            if (instance == null) {
                synchronized(Logger::class.java) {
                    if (instance == null) {
                        instance = Logger()
                    }
                }
            }
            return instance!!
        }
    }
}