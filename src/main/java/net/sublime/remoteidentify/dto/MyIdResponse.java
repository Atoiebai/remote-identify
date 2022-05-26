package net.sublime.remoteidentify.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MyIdResponse {
    private CommonData commonData;
    private DocData docData;
    private Contacts contacts;
    private Address address;
    private String authenticationMethod;

}
