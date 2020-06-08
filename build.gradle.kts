buildscript {
    val springBootVersion = "2.2.2.RELEASE"

    repositories {
        jcenter()
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
    }
}

plugins {
    `java-library`
}
apply(plugin = "org.springframework.boot")
apply(plugin = "io.spring.dependency-management")

group = "org.cat73.demo"
version = "1.0.0-SNAPSHOT"

configure<JavaPluginConvention> {
    val javaVersion = JavaVersion.VERSION_11

    sourceCompatibility = javaVersion
    targetCompatibility = javaVersion
}

repositories {
    jcenter()
}
tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

dependencies {
    implementation      ("org.springframework.boot:spring-boot-starter-security")
}
