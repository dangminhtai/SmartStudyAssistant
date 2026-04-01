package com.example.smartstudyassistant.data.local.dao

import androidx.room.*
import com.example.smartstudyassistant.data.local.entity.AchievementEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface AchievementDao {
    @Query("SELECT * FROM achievements")
    fun getAllAchievements(): Flow<List<AchievementEntity>>

    @Query("SELECT * FROM achievements WHERE unlockedAt IS NOT NULL")
    fun getUnlockedAchievements(): Flow<List<AchievementEntity>>

    @Update
    suspend fun updateAchievement(achievement: AchievementEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAchievements(achievements: List<AchievementEntity>)
}
