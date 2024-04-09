plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
    testLogging.showStandardStreams=true
}