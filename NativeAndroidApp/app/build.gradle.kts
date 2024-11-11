plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")

}

android {
    namespace = "org.neutralnews"
    compileSdk = 34

    defaultConfig {
        applicationId = "org.neutralnews"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.15"
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        viewBinding = true
    }
}

dependencies {
    implementation(libs.hilt.android)
    implementation(libs.androidx.material3.android)
    kapt(libs.hilt.compiler)

    val composeBom = platform("androidx.compose:compose-bom:2024.09.03")
    implementation(composeBom)
    androidTestImplementation(composeBom)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.hilt.navigation.compose)
    implementation(libs.androidx.material3)

    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.cio)
    implementation(libs.ktor.client.content.negotiation)
    implementation(libs.ktor.serialization.kotlinx.json)
    implementation(libs.ktor.client.plugins)



    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

}