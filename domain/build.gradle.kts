plugins {
    id(Plugins.javaLibrary)
    id(Plugins.kotlinJvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {

    // Inject
    implementation(Dependencies.Inject.inject)

    // Coroutines
    implementation(Dependencies.Coroutines.kotlinCoroutinesCore)
}