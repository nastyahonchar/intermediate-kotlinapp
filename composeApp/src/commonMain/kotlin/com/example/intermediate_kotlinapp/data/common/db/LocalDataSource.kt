package com.example.intermediate_kotlinapp.data.common.db

import kotlinx.coroutines.flow.Flow
import com.example.intermediate_kotlinapp.Task

interface LocalDataSource {

    fun insertTask(description: String)

    fun getAllTasks(): List<Task>

    fun markTaskCompleted(id: Long)

    fun markTaskPending(id: Long)

    fun deleteTask(id: Long)
}