object LibVers {
    const val spring_boot = "3.2.4"
    const val minio = "8.5.9"
    const val postgres = "42.7.3"
    const val liquibase = "4.26.0"
    const val slf4j = "2.0.9"
    const val r2dbc_postgres = "1.0.4-RELEASE"
    const val lombok = "1.18.30"
    const val jdbc = "6.1.5"
}

object Libs {
    // Spring
    const val spring_boot_starter_webflux =
        "org.springframework.boot:spring-boot-starter-webflux:${LibVers.spring_boot}"
    const val spring_boot_starter_jpa =
        "org.springframework.boot:spring-boot-starter-data-jpa:${LibVers.spring_boot}"
    const val spring_boot_starter_r2dbc =
        "org.springframework.boot:spring-boot-starter-data-r2dbc:${LibVers.spring_boot}"
    const val spring_boot_starter_logging = "org.springframework.boot:spring-boot-starter-logging:${
        LibVers.spring_boot
    }"
    const val spring_boot_starter_test =
        "org.springframework.boot:spring-boot-starter-test:${LibVers.spring_boot}"
    const val reactor_test = "io.projectreactor:reactor-test:${LibVers.spring_boot}"
    const val spring_jdbc = "org.springframework:spring-jdbc:${LibVers.jdbc}"
    const val spring_devtools =
        "org.springframework.boot:spring-boot-devtools:${LibVers.spring_boot}"

    // Logging
    const val slf4j_api = "org.slf4j:slf4j-api:${LibVers.slf4j}"

    // S3 storage
    const val minio = "io.minio:minio:${LibVers.minio}"

    // Lombok
    const val lombok = "org.projectlombok:lombok:${LibVers.lombok}"

    // Database
    const val postgres = "org.porstgresql:postgresql:${LibVers.postgres}"
    const val liquibase = "org.liquibase:liquibase-core:${LibVers.liquibase}"
    const val r2dbc_postgres = "org.postgresql:r2dbc-postgresql${LibVers.r2dbc_postgres}"

}

object PluginsVers {
    const val spring_boot = LibVers.spring_boot
    const val spring_dependency_managment = "1.1.4"
    const val pmd = "7.0.0"
}

object Plugins {
    const val pmd = "pmd"
    const val check_style = "checkstyle"
    const val spring_boot = "org.springframework.boot"
    const val spring_dependency_managment = "io.spring.dependency-management"
}