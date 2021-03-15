plugins {
    kotlin("jvm") version "1.4.30"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("junit:junit:4.12")
    implementation("org.junit.jupiter:junit-jupiter:5.4.2")
}
