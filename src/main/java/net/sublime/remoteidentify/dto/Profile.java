package net.sublime.remoteidentify.dto;


import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Profile {
    private CommonData commonData;
    private DocData docData;
    private Contacts contacts;
    private Address address;
    private String authenticationMethod;

}
