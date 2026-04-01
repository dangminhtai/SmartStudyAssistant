package com.example.smartstudyassistant.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(
    entities = [
        UserEntity::class,
        SubjectEntity::class,
        TaskEntity::class,
        DeckEntity::class,
        FlashcardEntity::class,
        PomodoroSessionEntity::class,
        AchievementEntity::class,
        ChatMessageEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun subjectDao(): SubjectDao
    abstract fun taskDao(): TaskDao
    abstract fun flashcardDao(): FlashcardDao
    abstract fun pomodoroDao(): PomodoroDao
    abstract fun achievementDao(): AchievementDao
    abstract fun chatDao(): ChatDao

    companion object {
        const val DATABASE_NAME = "smart_study_db"
    }
}
