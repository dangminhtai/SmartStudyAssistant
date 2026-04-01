package com.example.smartstudyassistant.di

import android.content.Context
import androidx.room.Room
import com.example.smartstudyassistant.data.local.dao.*
import com.example.smartstudyassistant.data.local.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            AppDatabase.DATABASE_NAME
        ).fallbackToDestructiveMigration().build()
    }

    @Provides
    fun provideUserDao(database: AppDatabase): UserDao = database.userDao()

    @Provides
    fun provideSubjectDao(database: AppDatabase): SubjectDao = database.subjectDao()

    @Provides
    fun provideTaskDao(database: AppDatabase): TaskDao = database.taskDao()

    @Provides
    fun provideFlashcardDao(database: AppDatabase): FlashcardDao = database.flashcardDao()

    @Provides
    fun providePomodoroDao(database: AppDatabase): PomodoroDao = database.pomodoroDao()

    @Provides
    fun provideAchievementDao(database: AppDatabase): AchievementDao = database.achievementDao()

    @Provides
    fun provideChatDao(database: AppDatabase): ChatDao = database.chatDao()
}
