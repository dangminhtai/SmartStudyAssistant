package com.example.smartstudyassistant.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "achievements")
data class AchievementEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val description: String,
    val icon: String, // Resource name or URL
    val unlockedAt: Long? = null,
    val userId: Int,
    val createdAt: Long = System.currentTimeMillis()
)
