plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.5.21")
    implementation("com.android.tools.build:gradle:7.4.0")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.18.0")
}