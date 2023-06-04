object Dependencies {

    object AndroidCore {
        const val core = "androidx.core:core-ktx:${Versions.core}"
    }

    object Fragment {
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    }

    object UIComponents {
        const val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    }

    object Coroutines {
        const val kotlinCoroutines =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        const val kotlinCoroutinesCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    }

    object Gson {
        const val gson = "com.squareup.retrofit2:converter-gson:${Versions.gson}"
    }

    object NavigationComponent {
        const val navigationFragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }

    object Hilt {
        const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    }

    object Glide {
        const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    }

    object ViewBindingPropertyDelegate {
        const val viewBindingPropertyDelegate =
            "com.github.kirich1409:viewbindingpropertydelegate-noreflection:${Versions.viewBindingPropertyDelegate}"
    }

    object OkHttp {
        const val okHttpBom = "com.squareup.okhttp3:okhttp-bom:${Versions.okHttpBom}"
        const val okHttp = "com.squareup.okhttp3:okhttp"
        const val okHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor"
    }

    object ViewPager {
        const val viewPager = "androidx.viewpager2:viewpager2:${Versions.viewPager}"
        const val viewPagerLegacySupport =
            "androidx.legacy:legacy-support-v4:${Versions.viewPagerLegacySupport}"
    }

    object Lifecycles {
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycles}"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycles}"
    }

    object Inject {
        const val inject = "javax.inject:javax.inject:1"
    }
}