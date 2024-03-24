package com.virginonline.docshare.infrastructure.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;

@ConfigurationPropertiesBinding
@ConfigurationProperties(prefix = "minio")
public record MinioProperties(String bucket, String url, String accessKey, String secretKey) {

}
