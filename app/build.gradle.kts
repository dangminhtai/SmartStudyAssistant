plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
    id("org.jetbrains.kotlin.plugin.compose")
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
        viewBinding = true
        buildConfig = true
    }

    buildTypes {
        debug {
            val properties = java.util.Properties()
            val localPropertiesFile = project.rootProject.file("local.properties")
            if (localPropertiesFile.exists()) {
                properties.load(localPropertiesFile.inputStream())
            }
            val apiKey = properties.getProperty("GEMINI_API_KEY") ?: ""
            buildConfigField("String", "GEMINI_API_KEY", "\"$apiKey\"")
        }
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("String", "GEMINI_API_KEY", "\"\"")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
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
    ksp(libs.hilt-compiler)
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
