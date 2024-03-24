package com.virginonline.docshare;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class BackendApplication {

  public static void main(String... args) {
    new SpringApplicationBuilder()
        .sources(BackendApplication.class)
        .bannerMode(Mode.OFF)
        .run(args);
  }
}
