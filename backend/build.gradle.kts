@Suppress("DSL_SCOPE_VIOLATION")

plugins {
    java
    id(Plugins.spring_boot) version PluginsVers.spring_boot
    id(Plugins.spring_dependency_managment) version PluginsVers.spring_dependency_managment
}

group = "com.virginonline"
version = "0.0.1"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(Libs.spring_boot_starter_webflux)
    implementation(Libs.minio)
    implementation(Libs.liquibase)
    implementation(Libs.pre_liquibase)
    implementation(Libs.spring_boot_starter_jpa)
    implementation(Libs.spring_boot_starter_r2dbc)
    implementation(Libs.slf4j_api)
    implementation(Libs.spring_boot_starter_logging)
    implementation(Libs.spring_jdbc)
    compileOnly(Libs.lombok)
    developmentOnly(Libs.spring_devtools)
    runtimeOnly(Libs.postgres)
    annotationProcessor(Libs.lombok)
    testImplementation(Libs.spring_boot_starter_test)
    testImplementation(Libs.reactor_test)
    runtimeOnly(Libs.r2dbc_postgres)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
