package com.example.smartstudyassistant.data.local.dao

import androidx.room.*
import com.example.smartstudyassistant.data.local.entity.PomodoroSessionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PomodoroDao {
    @Query("SELECT * FROM pomodoro_sessions ORDER BY startTime DESC")
    fun getAllSessions(): Flow<List<PomodoroSessionEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSession(session: PomodoroSessionEntity)

    @Query("SELECT SUM(duration) FROM pomodoro_sessions WHERE startTime >= :sinceTime")
    fun getTotalFocusTime(sinceTime: Long): Flow<Int>
}
