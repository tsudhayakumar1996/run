plugins {
    alias(libs.plugins.run.android.library)
    alias(libs.plugins.run.jvm.ktor)
}

android {
    namespace = "com.plcoding.core.data"
}

dependencies {

    implementation(libs.timber)
    implementation(project(":core:domain"))
    implementation(project(":core:database"))
}