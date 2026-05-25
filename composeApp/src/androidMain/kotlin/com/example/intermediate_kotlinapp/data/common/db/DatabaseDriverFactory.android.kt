package com.example.intermediate_kotlinapp.data.common.db

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.example.intermediate_kotlinapp.Kotlinapp

actual class DatabaseDriverFactory(
    private val context: Context
) {
    actual fun create(): SqlDriver {
        return AndroidSqliteDriver(Kotlinapp.Schema, context, "kotlinapp.db")
    }
}