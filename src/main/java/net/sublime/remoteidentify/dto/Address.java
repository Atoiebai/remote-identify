package net.sublime.remoteidentify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonRootName("address")
public class Address {
    @JsonProperty("permanent_address") private String permanentAddress;
    @JsonProperty("temporary_address") private String temporaryAddress;
    @JsonProperty("permanent_registration") private PermanentRegistration permanentRegistration;
    @JsonProperty("temporary_registration") private TemporaryRegistration temporaryRegistration;
}
