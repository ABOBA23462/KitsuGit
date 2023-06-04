plugins {
    id(Plugins.androidLibrary)
    kotlin(Plugins.kotlinAndroid)

    // Kapt
    kotlin(Plugins.kapt)

    // Hilt
    id(Plugins.hilt)
}

android {
    namespace = "com.example.data"
    compileSdk = Config.compileSdk

    defaultConfig {
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        debug{
            isMinifyEnabled = false
            buildConfigField("String", "BASE_URL", "\"https://kitsu.io/api/\"")

        }
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("String", "BASE_URL", "\"https://kitsu.io/api/\"")
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
        buildConfig = true
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

    // Coroutines
    implementation(Dependencies.Coroutines.kotlinCoroutines)
    implementation(Dependencies.Coroutines.kotlinCoroutinesCore)

    // Retrofit
    implementation(Dependencies.Retrofit.retrofit)

    // Gson
    implementation(Dependencies.Gson.gson)
    
    // OkHttp
    implementation(Dependencies.OkHttp.okHttp)
    implementation(Dependencies.OkHttp.okHttpBom)
    implementation(Dependencies.OkHttp.okHttpLoggingInterceptor)

    // Domain
    implementation(project(":domain"))
}