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
@JsonRootName("doc_data")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocData {

   @JsonProperty("pass_data") private String passData;
   @JsonProperty("issued_by") private String issuedBy;
   @JsonProperty("issued_by_id") private String issuedById;
   @JsonProperty("issued_date") private String issuedDate;
   @JsonProperty("expiry_date") private String expiryDate;
   @JsonProperty("doc_type") private String docType;
   @JsonProperty("doc_type_id") private String docTypeId;
}
