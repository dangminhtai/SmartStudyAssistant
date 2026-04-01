package com.example.smartstudyassistant.data.local.dao

import androidx.room.*
import com.example.smartstudyassistant.data.local.entity.DeckEntity
import com.example.smartstudyassistant.data.local.entity.FlashcardEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface FlashcardDao {
    // Deck operations
    @Query("SELECT * FROM flashcard_decks")
    fun getAllDecks(): Flow<List<DeckEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDeck(deck: DeckEntity)

    // Flashcard operations
    @Query("SELECT * FROM flashcards WHERE deckId = :deckId")
    fun getFlashcardsByDeck(deckId: Int): Flow<List<FlashcardEntity>>

    @Query("SELECT * FROM flashcards WHERE nextReview <= :currentTime")
    fun getFlashcardsToReview(currentTime: Long): Flow<List<FlashcardEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFlashcard(flashcard: FlashcardEntity)

    @Update
    suspend fun updateFlashcard(flashcard: FlashcardEntity)

    @Delete
    suspend fun deleteFlashcard(flashcard: FlashcardEntity)
}
