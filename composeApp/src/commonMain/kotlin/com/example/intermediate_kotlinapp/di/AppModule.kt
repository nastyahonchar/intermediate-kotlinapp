package com.example.intermediate_kotlinapp.di

import org.koin.dsl.module
import org.koin.plugin.module.dsl.single
import org.koin.plugin.module.dsl.viewModel
import com.example.intermediate_kotlinapp.data.about.AboutRepository
import com.example.intermediate_kotlinapp.data.about.Platform
import com.example.intermediate_kotlinapp.data.reminders.RemindersRepository
import com.example.intermediate_kotlinapp.ui.about.AboutViewModel
import com.example.intermediate_kotlinapp.ui.reminders.ReminderViewModel

val appModule = module {
    single<Platform>()
    single<AboutRepository>()
    viewModel<AboutViewModel>()
    single<RemindersRepository>()
    viewModel<ReminderViewModel>()
}