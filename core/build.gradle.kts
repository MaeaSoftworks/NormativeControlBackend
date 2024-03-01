plugins {
    kotlin("jvm") version "1.9.22"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.22"
}

java.sourceCompatibility = JavaVersion.VERSION_20

dependencies {
    implementation(kotlin("reflect"))
    implementation("org.reflections:reflections:0.10.2")
    implementation("org.docx4j:docx4j-JAXB-ReferenceImpl:11.4.10")
    constraints {
        implementation("org.apache.commons:commons-compress:1.26.0")
    }
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.2")
    implementation("org.apache.commons:commons-collections4:4.4")
    implementation("commons-cli:commons-cli:1.6.0")
    implementation("org.slf4j:slf4j-simple:2.0.12")

    testImplementation("io.kotest:kotest-runner-junit5:5.8.0")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.freeCompilerArgs += listOf("-Xcontext-receivers")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}