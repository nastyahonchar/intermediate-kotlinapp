package com.example.intermediate_kotlinapp

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.example.intermediate_kotlinapp.di.initKoin
import com.example.intermediate_kotlinapp.ui.root.AppScaffold
import com.example.intermediate_kotlinapp.ui.theme.AppTheme

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    initKoin { printLogger() }
    ComposeViewport {
        AppTheme{
            AppScaffold()
        }
    }
}