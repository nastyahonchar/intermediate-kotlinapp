package com.example.intermediate_kotlinapp.data.reminders

internal data class Reminder (
    val id: String,
    val title: String,
    val isCompleted: Boolean = false,
)