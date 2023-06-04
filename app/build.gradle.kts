plugins {
    id(Plugins.application)
    kotlin(Plugins.kotlinAndroid)

    // Kapt
    kotlin(Plugins.kapt)

    // Hilt
    id(Plugins.hilt)
}

android {
    namespace = "com.example.kitsugit"
    compileSdk = Config.compileSdk

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

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

    kotlinOptions {
        jvmTarget = Config.jvmTarget
    }
}

dependencies {

    implementation(Dependencies.Fragment.fragment)

    implementation(Dependencies.AndroidCore.core)

    implementation(Dependencies.UIComponents.appCompat)

    implementation(Dependencies.UIComponents.material)

    implementation(Dependencies.UIComponents.constraint)

    implementation(Dependencies.Lifecycles.liveData)

    implementation(Dependencies.Lifecycles.viewModel)

    // Hilt
    implementation(Dependencies.Hilt.hiltAndroid)
    kapt(Dependencies.Hilt.hiltCompiler)

    // Data
    implementation(project(":data"))

    // Presentation
    implementation(project(":presentation"))
}