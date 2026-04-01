package com.example.smartstudyassistant.di

import com.example.smartstudyassistant.BuildConfig
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.BlockThreshold
import com.google.ai.client.generativeai.type.HarmCategory
import com.google.ai.client.generativeai.type.SafetySetting
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AIModule {

    @Provides
    @Singleton
    fun provideGenerativeModel(): GenerativeModel {
        // Sử dụng model "gemini-3.1-flash-lite-preview" theo yêu cầu của Anh Tai
        val modelName = "gemini-3.1-flash-lite-preview"
        val apiKey = BuildConfig.GEMINI_API_KEY

        val safetySettings = listOf(
            SafetySetting(HarmCategory.HARASSMENT, BlockThreshold.MEDIUM_AND_ABOVE),
            SafetySetting(HarmCategory.HATE_SPEECH, BlockThreshold.MEDIUM_AND_ABOVE),
            SafetySetting(HarmCategory.SEXUALLY_EXPLICIT, BlockThreshold.MEDIUM_AND_ABOVE),
            SafetySetting(HarmCategory.DANGEROUS_CONTENT, BlockThreshold.MEDIUM_AND_ABOVE),
        )

        return GenerativeModel(
            modelName = modelName,
            apiKey = apiKey,
            safetySettings = safetySettings
        )
    }
}
