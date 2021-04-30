plugins {
    id("com.github.johnrengelman.shadow") version "6.1.0"
    id("io.micronaut.application") version "1.4.5"
}

version = "0.1"
group = "micronaut.test"

repositories {
    mavenCentral()
}

micronaut {
    runtime("netty")
    testRuntime("junit5")
    processing {
        incremental(true)
        annotations("micronaut.test.*")
    }
}

dependencies {
    implementation("io.micronaut:micronaut-http-client")
    implementation("io.micronaut:micronaut-runtime")
    implementation("io.micronaut:micronaut-validation")
    runtimeOnly("ch.qos.logback:logback-classic")
}


application {
    mainClass.set("micronaut.test.Application")
}
java {
    sourceCompatibility = JavaVersion.toVersion("1.8")
    targetCompatibility = JavaVersion.toVersion("1.8")
}



