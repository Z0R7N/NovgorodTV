plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "ru.example.novgorodtv"
    compileSdk = 34

    defaultConfig {
        applicationId = "ru.example.novgorodtv"
        minSdk = 21          // Mi Box 4S работает на Android 8.1 (API 27)
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release { isMinifyEnabled = false }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}
// Внешних зависимостей не нужно: используется только системный WebView.
