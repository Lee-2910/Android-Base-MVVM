plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id ("base-plugin")
}

android {
    namespace = "com.mycode.lee"
    compileSdk = Configuration.compileSdk
    defaultConfig {
        applicationId = "com.mycode.lee"
        minSdk =  Configuration.minSdk
        targetSdk = Configuration.targetSdk
        versionCode = Configuration.versionCode
        versionName = Configuration.versionName
        multiDexEnabled = true
        vectorDrawables.useSupportLibrary = true
        testInstrumentationRunner =  "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isDebuggable = false
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
        getByName("debug") {
            isMinifyEnabled = false
            enableUnitTestCoverage = true
        }
    }
    compileOptions {
        sourceCompatibility  = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    buildFeatures {
        dataBinding = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    val composeBom = platform("androidx.compose:compose-bom:2022.12.00")
    implementation(composeBom)
    androidTestImplementation(composeBom)

    addCompose()

    addLifeCycle()

    addAndroidUI()

    addKotlin()

    addEspresso()

    addJunit()

    addHilt()

    addTimber()
}