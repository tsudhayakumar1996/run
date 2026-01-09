plugins {
    alias(libs.plugins.run.android.feature.ui)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.plcoding.run.presentation"
}

dependencies {

    implementation(libs.coil.compose)
    implementation(libs.google.maps.android.compose)
    implementation(libs.androidx.activity.compose)
    implementation(libs.timber)

    implementation(project(":core:domain"))
    implementation(project(":run:domain"))
}