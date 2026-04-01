package com.example.smartstudyassistant.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "chat_messages")
data class ChatMessageEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val content: String,
    val role: String, // "user", "model"
    val subjectContext: String?,
    val sessionId: String,
    val timestamp: Long = System.currentTimeMillis()
)
