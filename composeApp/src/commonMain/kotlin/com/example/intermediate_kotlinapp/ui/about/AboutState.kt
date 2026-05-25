package com.example.intermediate_kotlinapp.ui.about

internal data class AboutState(
    val platformInfo: List<Pair<String, String>> = emptyList(),
    val visitedCount: Int = 0
)