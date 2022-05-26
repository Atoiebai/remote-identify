package net.sublime.remoteidentify.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonRootName("temporary_registration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TemporaryRegistration {
    @JsonProperty("region") private String  region;
    @JsonProperty("address") private String  address;
    @JsonProperty("country") private String  country;
    @JsonProperty("cadastre") private String  cadastre;
    @JsonProperty("district") private String  district;
    @JsonProperty("region_id") private String  regionId;
    @JsonProperty("country_id") private String  countryId;
    @JsonProperty("district_id") private String  districtId;
    @JsonProperty("region_id_cbu") private String  regionIdCbu;
    @JsonProperty("country_id_cbu") private String  countryIdCbu;
    @JsonProperty("district_id_cbu") private String  districtIdCbu;

}
