package net.sublime.remoteidentify.dto;


import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CommonData {
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String firstNameEn;
    private String lastNameEn;
    private String pinfl;
    private String inn;
    private String gender;
    private String birthPlace;
    private String birthCounty;
    private String birthCountryId;
    private String birthDate;
    private String nationality;
    private String nationalityId;
    private String nationalityIdCbu;
    private String citizenship;
    private String citizenshipId;
    private String sdkHash;
    private String lastUpdatePassData;
    private String lastUpdateInn;
    private String lastUpdateAddress;

}
