package net.sublime.remoteidentify.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Registration {
    private String  region;
    private String  address;
    private String  country;
    private String  cadastre;
    private String  district;
    private String  regionId;
    private String  countryId;
    private String  districtId;
    private String  regionIdCbu;
    private String  countryIdCbu;
    private String  districtIdCbu;
    private String  registrationDate;

}
