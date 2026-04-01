package com.example.smartstudyassistant.data.remote.api

import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.GenerateContentResponse
import com.google.ai.client.generativeai.type.content
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GeminiService @Inject constructor(
    private val generativeModel: GenerativeModel
) {
    /**
     * Gửi một prompt đơn giản và nhận kết quả một lần.
     */
    suspend fun generateContent(prompt: String): GenerateContentResponse {
        return generativeModel.generateContent(prompt)
    }

    /**
     * Gửi prompt và nhận kết quả dạng streaming (năm 2026 yêu cầu tốc độ cao).
     */
    fun generateContentStream(prompt: String): Flow<GenerateContentResponse> {
        return generativeModel.generateContentStream(prompt)
    }

    /**
     * Chat theo ngữ cảnh (Contextual Chat).
     */
    suspend fun startChat(history: List<com.google.ai.client.generativeai.type.Content> = emptyList()) = 
        generativeModel.startChat(history)
}
