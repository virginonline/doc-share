package com.virginonline.docshare.domain.entity.document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;

public record DocumentProperties(Boolean allowDownloading, LocalDateTime expires, String passcode,
                                 String watermark, String accessControl,
                                 String customUrl, Map<String, String> customButton) implements
    Serializable {

  @JsonCreator
  public DocumentProperties(@JsonProperty("allow_downloading") String allowDownloading,
      @JsonProperty("expires") LocalDateTime expires,
      @JsonProperty("passcode") String passcode,
      @JsonProperty("watermark") String watermark,
      @JsonProperty("access_control") String accessControl,
      @JsonProperty("custom_url") String customUrl,
      @JsonProperty("custom_button") Map<String, String> customButton) {
    this(Boolean.parseBoolean(allowDownloading), expires, passcode, watermark, accessControl,
        customUrl, customButton);
  }
}
