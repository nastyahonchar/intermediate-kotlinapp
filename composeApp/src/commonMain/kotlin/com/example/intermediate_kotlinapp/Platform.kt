package com.example.intermediate_kotlinapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform