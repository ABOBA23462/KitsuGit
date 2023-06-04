// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Plugins.application) version Versions.application apply false
    id(Plugins.androidLibrary) version Versions.library apply false
    kotlin(Plugins.kotlinAndroid) version Versions.kotlinAndroid apply false
    id(Plugins.hilt) version Versions.hilt apply false
    id(Plugins.safeArgs) version Versions.safeArgs apply false
    id(Plugins.kotlinJvm) version Versions.kotlinJvm apply false
}