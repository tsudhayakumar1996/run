plugins {
    alias(libs.plugins.run.jvm.library)
}

dependencies {
    implementation(project(":core:domain"))
}
