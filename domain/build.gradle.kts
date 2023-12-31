plugins {
    id("java-conventions")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

group = "nl.sogyo.myproject"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.7.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

tasks.test {
    useJUnitPlatform()
}