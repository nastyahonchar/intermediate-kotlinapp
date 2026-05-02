package com.example.intermediate_kotlinapp

import com.example.intermediate_kotlinapp.data.about.Platform

class JsPlatform: Platform {
    override val name: String = "Web with Kotlin/JS"
}

actual fun getPlatform(): Platform = JsPlatform()