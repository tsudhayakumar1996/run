plugins {
    alias(libs.plugins.run.android.library)
}

android {
    namespace = "com.plcoding.run.network"
}

dependencies {
    implementation(project(":core:domain"))
    implementation(project(":core:data"))
}