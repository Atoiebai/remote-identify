package net.sublime.remoteidentify.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DocData {

   private String passData;
   private String issuedBy;
   private String issuedById;
   private String issuedDate;
   private String expiryDate;
   private String docType;
   private String docTypeId;
}
