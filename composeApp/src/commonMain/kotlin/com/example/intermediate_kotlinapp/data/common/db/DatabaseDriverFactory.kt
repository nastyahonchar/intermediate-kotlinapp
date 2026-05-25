package com.example.intermediate_kotlinapp.data.common.db

import app.cash.sqldelight.db.SqlDriver

expect class DatabaseDriverFactory {
    fun create(): SqlDriver
}