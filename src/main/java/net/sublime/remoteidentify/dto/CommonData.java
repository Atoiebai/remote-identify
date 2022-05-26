package net.sublime.remoteidentify.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonRootName("common_data")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonData {
   @JsonProperty("id") private Long id;
    @JsonProperty("first_name") private String firstName;
    @JsonProperty("middle_name") private String middleName;
    @JsonProperty("last_name") private String lastName;
    @JsonProperty("first_name_en") private String firstNameEn;
    @JsonProperty("last_name_en") private String lastNameEn;
    @JsonProperty("pinfl") private String pinfl;
    @JsonProperty("inn") private String inn;
    @JsonProperty("gender") private String gender;
    @JsonProperty("birth_place") private String birthPlace;
    @JsonProperty("birth_country") private String birthCountry;
    @JsonProperty("birth_country_id") private String birthCountryId;
    @JsonProperty("birth_date") private String birthDate;
    @JsonProperty("nationality") private String nationality;
    @JsonProperty("nationality_id") private String nationalityId;
    @JsonProperty("nationality_id_cbu") private String nationalityIdCbu;
    @JsonProperty("citizenship") private String citizenship;
    @JsonProperty("citizenship_id") private String citizenshipId;
    @JsonProperty("sdk_hash") private String sdkHash;
    @JsonProperty("last_update_pass_data") private String lastUpdatePassData;
    @JsonProperty("last_update_inn") private String lastUpdateInn;
    @JsonProperty("last_update_address") private String lastUpdateAddress;

}
