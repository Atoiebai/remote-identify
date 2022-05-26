package net.sublime.remoteidentify.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonRootName("profile")
public class Profile {
    @JsonProperty("common_data") private CommonData commonData;
    @JsonProperty("doc_data") private DocData    docData;
    @JsonProperty("contacts") private Contacts   contacts;
    @JsonProperty("address") private Address    address;
    @JsonProperty("authentication_method") private String     authenticationMethod;

}
