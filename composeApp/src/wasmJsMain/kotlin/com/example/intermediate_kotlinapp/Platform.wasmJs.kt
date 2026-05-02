package com.example.intermediate_kotlinapp

import com.example.intermediate_kotlinapp.data.about.Platform

class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()