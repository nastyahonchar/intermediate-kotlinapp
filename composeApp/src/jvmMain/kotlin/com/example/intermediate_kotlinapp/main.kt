package com.example.intermediate_kotlinapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.intermediate_kotlinapp.ui.root.AppScaffold
import com.example.intermediate_kotlinapp.ui.theme.AppTheme

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Intermediatekotlinapp",
    ) {
        AppTheme {
            AppScaffold()
        }
    }
}