package com.example.smartstudyassistant.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val deadline: Long, // Timestamp
    val priority: Int, // 1: High, 2: Medium, 3: Low
    val status: String = "PENDING", // PENDING, COMPLETED
    val subjectId: Int?,
    val userId: Int,
    val category: String = "General",
    val createdAt: Long = System.currentTimeMillis()
)
