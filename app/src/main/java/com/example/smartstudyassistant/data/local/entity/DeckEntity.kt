package com.example.smartstudyassistant.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "flashcard_decks")
data class DeckEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val description: String?,
    val subjectId: Int?,
    val cardCount: Int = 0,
    val lastReviewed: Long? = null,
    val createdAt: Long = System.currentTimeMillis()
)
