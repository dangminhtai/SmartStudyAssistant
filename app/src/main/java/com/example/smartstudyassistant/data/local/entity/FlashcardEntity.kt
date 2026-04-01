package com.example.smartstudyassistant.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "flashcards")
data class FlashcardEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val front: String,
    val back: String,
    val deckId: Int,
    val easeFactor: Float = 2.5f,
    val interval: Int = 0,
    val nextReview: Long = System.currentTimeMillis(),
    val reviewCount: Int = 0,
    val createdAt: Long = System.currentTimeMillis()
)
