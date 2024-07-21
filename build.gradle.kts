plugins {
    kotlin("jvm") version "1.9.23"
    id("edu.wpi.first.GradleRIO") version "2024.3.2"
}

group = "com.avianroboticscms"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        setUrl("https://maven.ctr-electronics.com/release/")
    }
}

dependencies {
    implementation("com.ctre.phoenix6:wpiapi-java:24.3.0")
    testImplementation(kotlin("test"))

    wpi.java.deps.wpilib().forEach {
        implementation(it)
    }
    wpi.java.vendor.java().forEach {
        implementation(it)
    }
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}