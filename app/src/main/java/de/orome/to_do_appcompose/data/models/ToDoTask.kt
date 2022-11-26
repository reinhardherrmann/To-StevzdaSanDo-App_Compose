package de.orome.to_do_appcompose.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import de.orome.to_do_appcompose.util.Constants.TASK_TABLE_NAME

@Entity(
    tableName = TASK_TABLE_NAME
)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)
