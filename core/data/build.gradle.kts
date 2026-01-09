plugins {
    alias(libs.plugins.run.android.library)
}

android {
    namespace = "com.plcoding.core.data"
}

dependencies {

    implementation(libs.timber)
    implementation(project(":core:domain"))
    implementation(project(":core:database"))
}