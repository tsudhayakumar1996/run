plugins {
    alias(libs.plugins.run.android.library)
    alias(libs.plugins.run.android.room)
}

android {
    namespace = "com.plcoding.core.database"
}

dependencies {

    implementation(libs.org.mongodb.bson)
    implementation(project(":core:domain"))
}