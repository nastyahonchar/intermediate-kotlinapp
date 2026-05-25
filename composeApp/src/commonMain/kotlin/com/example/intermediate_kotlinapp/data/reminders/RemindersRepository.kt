package com.example.intermediate_kotlinapp.data.reminders

import com.example.intermediate_kotlinapp.data.common.db.LocalDataSource
import kotlin.uuid.ExperimentalUuidApi

internal class RemindersRepository(
    private val localDataSource: LocalDataSource
) {
    val reminders: List<Reminder>
        get() = localDataSource.getAllTasks().map { it.map() }


    @OptIn(ExperimentalUuidApi::class)
    fun createReminder(title: String) {
        localDataSource.insertTask(title)
    }

    fun markReminder(id: Long, isCompleted: Boolean) {
        if (isCompleted) {
            localDataSource.markTaskCompleted(id)
        } else {
            localDataSource.markTaskPending(id)
        }
    }
}