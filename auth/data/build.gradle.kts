plugins {
    alias(libs.plugins.run.android.library)
    alias(libs.plugins.run.jvm.ktor)
}

android {
    namespace = "com.plcoding.auth.data"
}

dependencies {
    implementation(project(":auth:domain"))
    implementation(project(":core:domain"))
    implementation(project(":core:data"))
}