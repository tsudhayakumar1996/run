plugins {
    alias(libs.plugins.run.android.feature.ui)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.plcoding.auth.presentation"
}

dependencies {
    implementation(project(":auth:domain"))
    implementation(project(":core:domain"))
}