package net.sublime.remoteidentify.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Address {
    private String permanentAddress;
    private String temporaryAddress;
    private Registration permanentRegistration;
    private Registration temporaryRegistration;
}
