plugins {
    id("com.android.application") version "7.1.0"
    id("com.google.gms.google-services") version "4.3.10"
    kotlin("android") version "1.5.31"
}

repositories {
    google()
    mavenCentral()
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.example.buttonapp"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.31")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.1")
    implementation(platform("com.google.firebase:firebase-bom:28.4.2"))
    implementation("com.google.firebase:firebase-analytics-ktx")
}

// Apply the Google services plugin
apply(plugin = "com.google.gms.google-services")
