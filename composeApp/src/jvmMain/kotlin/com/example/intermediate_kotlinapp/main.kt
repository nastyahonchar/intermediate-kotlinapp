package com.example.intermediate_kotlinapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.intermediate_kotlinapp.ui.root.AppScaffold

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Intermediatekotlinapp",
    ) {
        AppScaffold()
    }
}