package com.example.taskapp

import androidx.lifecycle.ViewModel

class TaskListViewModel : ViewModel() {
    val tasks = mutableListOf<Task>()

    init {
        for(i in 0 until 100) {
            val task = Task()
            task.title = "Task #$i"
            tasks +=task
        }
    }

    private val taskRepository = TaskRepository.get()
    val  taskListLiveData  = taskRepository.getTasks()

    fun addTask(task: Task){
        TaskRepository.get().addTask(task)
    }
}