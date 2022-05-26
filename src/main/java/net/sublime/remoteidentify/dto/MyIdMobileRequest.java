package net.sublime.remoteidentify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MyIdMobileRequest {
    @JsonProperty("code") private String code;
    @JsonProperty("comparison_value") private String comparisonValue;
}
