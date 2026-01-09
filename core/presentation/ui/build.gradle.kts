plugins {
    alias(libs.plugins.run.android.library.compose)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.plcoding.presentation.ui"
}

dependencies {

    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)

    implementation(project(":core:domain"))
    implementation(project(":core:presentation:designsystem"))
}