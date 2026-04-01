package com.example.smartstudyassistant.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pomodoro_sessions")
data class PomodoroSessionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val startTime: Long,
    val duration: Int, // minutes
    val taskId: Int?,
    val focusScore: Int = 0,
    val distractionCount: Int = 0,
    val createdAt: Long = System.currentTimeMillis()
)
