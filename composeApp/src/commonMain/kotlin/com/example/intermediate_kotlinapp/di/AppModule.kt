package com.example.intermediate_kotlinapp.di

import com.russhwolf.settings.ObservableSettings
import com.russhwolf.settings.Settings
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module
import org.koin.plugin.module.dsl.create
import org.koin.plugin.module.dsl.single
import org.koin.plugin.module.dsl.viewModel
import com.example.intermediate_kotlinapp.data.about.AboutRepository
import com.example.intermediate_kotlinapp.data.about.Platform
import com.example.intermediate_kotlinapp.data.common.preferences.AppPreferences
import com.example.intermediate_kotlinapp.data.common.preferences.Preferences
import com.example.intermediate_kotlinapp.data.reminders.RemindersRepository
import com.example.intermediate_kotlinapp.ui.about.AboutViewModel
import com.example.intermediate_kotlinapp.ui.reminders.ReminderViewModel

private fun createSettings() : Settings = Settings()
val dataModule = module {
    single { create(::createSettings) } binds arrayOf(Settings::class, ObservableSettings::class)
    singleOf(::AppPreferences) bind Preferences::class
}

val appModule = module {
    includes(dataModule)
    single<Platform>()
    single<AboutRepository>()
    viewModel<AboutViewModel>()
    single<RemindersRepository>()
    viewModel<ReminderViewModel>()
}