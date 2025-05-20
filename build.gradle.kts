val jimmerVersion by extra { "0.9.46" }
val springBootVersion by extra { "3.4.5" }

allprojects {
    group = "ru.vood.jummer"
    version = jimmerVersion
}

plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}