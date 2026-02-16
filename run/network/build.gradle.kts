plugins {
    alias(libs.plugins.run.android.library)
    alias(libs.plugins.run.jvm.ktor)
}

android {
    namespace = "com.plcoding.run.network"
}

dependencies {
    implementation(project(":core:domain"))
    implementation(project(":core:data"))
}