package com.example.smartstudyassistant.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subjects")
data class SubjectEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val color: String, // Hex color code
    val credits: Int = 0,
    val userId: Int,
    val createdAt: Long = System.currentTimeMillis()
)
