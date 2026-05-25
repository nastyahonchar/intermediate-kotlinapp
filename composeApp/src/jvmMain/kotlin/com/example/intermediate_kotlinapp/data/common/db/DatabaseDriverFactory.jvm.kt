package com.example.intermediate_kotlinapp.data.common.db

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import com.example.intermediate_kotlinapp.Kotlinapp
import java.io.File

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class DatabaseDriverFactory {

    actual fun create(): SqlDriver {
        val dbPath = "${System.getProperty("user.home")}/.kotlinapp/kotlinapp.db"
        File(dbPath).parentFile?.mkdirs()
        val driver: SqlDriver = JdbcSqliteDriver("jdbc:sqlite:$dbPath")
        if (!File(dbPath).exists()) {
            Kotlinapp.Schema.create(driver)
        }
        return driver
    }
}