package com.example.taskapp

import android.widget.TimePicker
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Time
import java.util.*

@Entity
data class Task
    (
    @PrimaryKey
    val id:UUID = UUID.randomUUID(),
                var title : String = " ",
                var details: String = " ",
                var date : Date = Date())
{

}