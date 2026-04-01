plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.hilt)
    alias(libs.plugins.ksp)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.smartstudyassistant"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.smartstudyassistant"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }

    buildTypes {
        debug {
            val apiKey: String = project.rootProject.file("local.properties").let { file ->
                if (file.exists()) {
                    val properties = java.util.Properties()
                    properties.load(file.inputStream())
                    properties.getProperty("GEMINI_API_KEY") ?: ""
                } else ""
            }
            buildConfigField("String", "GEMINI_API_KEY", "\"$apiKey\"")
        }
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            // Trong thực tế release nên lấy từ biến môi trường của CI/CD
            buildConfigField("String", "GEMINI_API_KEY", "\"\"")
        }
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // Compose
    implementation(platform(libs.compose-bom))
    implementation(libs.ui)
    implementation(libs.ui-graphics)
    implementation(libs.ui-tooling-preview)
    implementation(libs.material3)
    implementation(libs.activity-compose)
    implementation(libs.navigation-compose)

    // Hilt
    implementation(libs.hilt-android)
    kapt(libs.hilt-compiler)
    implementation(libs.hilt-navigation-compose)

    // Room
    implementation(libs.room-runtime)
    implementation(libs.room-ktx)
    ksp(libs.room-compiler)

    // Networking & Gemini
    implementation(libs.retrofit)
    implementation(libs.retrofit-gson)
    implementation(libs.okhttp-logging)
    implementation(libs.gemini-sdk)

    // Coroutines & Lifecycle
    implementation(libs.coroutines-android)
    implementation(libs.lifecycle-runtime-ktx)
    implementation(libs.lifecycle-viewmodel-compose)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose-bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)
}