package com.example.intermediate_kotlinapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Intermediatekotlinapp",
    ) {
        App()
    }
}