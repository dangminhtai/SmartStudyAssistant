package com.example.smartstudyassistant.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val email: String,
    val avatarUrl: String?,
    val xp: Int = 0,
    val level: Int = 1,
    val streakCount: Int = 0,
    val createdAt: Long = System.currentTimeMillis()
)
