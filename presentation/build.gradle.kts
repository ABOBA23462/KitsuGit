plugins {
    id(Plugins.androidLibrary)
    kotlin(Plugins.kotlinAndroid)

    // Kapt
    kotlin(Plugins.kapt)

    // Hilt
    id(Plugins.hilt)

    // Save args
    id(Plugins.safeArgs)
}

android {
    namespace = "com.example.presentation"
    compileSdk = Config.compileSdk

    defaultConfig {
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    buildFeatures {
        // ViewBinding
        viewBinding = true
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

    // NavigationComponent
    implementation(Dependencies.NavigationComponent.navigationFragment)
    implementation(Dependencies.NavigationComponent.navigationUI)

    // ViewBindingPropertyDelegate
    implementation(Dependencies.ViewBindingPropertyDelegate.viewBindingPropertyDelegate)

    // Coroutines
    implementation(Dependencies.Coroutines.kotlinCoroutines)
    implementation(Dependencies.Coroutines.kotlinCoroutinesCore)

    // Gson
    implementation(Dependencies.Gson.gson)

    // Glide
    implementation(Dependencies.Glide.glide)
//    implementation(Dependencies.Glide.glideCompiler)

    // Domain
    api(project(":domain"))
}