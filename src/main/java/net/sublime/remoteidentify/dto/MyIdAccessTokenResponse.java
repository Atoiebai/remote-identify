package net.sublime.remoteidentify.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MyIdAccessTokenResponse {
    @JsonProperty("access_token") private String accessToken;
    @JsonProperty("expires_in") private Integer expiresIn;
    @JsonProperty("token_type") private String tokenType;
    @JsonProperty("refresh_token") private String refreshToken;
}
