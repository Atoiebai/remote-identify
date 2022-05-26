package net.sublime.remoteidentify.service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import net.sublime.remoteidentify.dto.MyIdMobileRequest;
import net.sublime.remoteidentify.dto.MyIdResponse;
import org.json.JSONObject;
import org.springframework.stereotype.Service;


@Service
public class MyIdService {

    ObjectMapper objectMapper = new ObjectMapper();

    {
        objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT , true);

    }
    public HttpResponse<String> getToken(MyIdMobileRequest myIdMobileRequest) throws UnirestException {

        return Unirest.post("https://myid.uz/api/v1/oauth2/access-token")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .field("grant_type", "authorization_code")
                .field("code", myIdMobileRequest.getCode())
                .field("client_id", "kapital-9VKHbbeenXpSrJiyDmJ905PR6oHHiGOPttsDiURB")
                .field("client_secret", "6QahT8JzpMLoP2jOgEqQuVCfKx9PAddmJxShl3HTRk5OVZmV1cADRa4Io8XreqBuDhrK2snchiCe5oiMJnh1ApW6XrA6lHyDvVle")
                .field("method", "simple")
                .asString();
    }

    public MyIdResponse getUserData(String source) throws UnirestException, JsonProcessingException {
        JSONObject json = new JSONObject(source);
        String token = json.getString("access_token");
        json.getString("access_token");
        HttpResponse<String> userDataResponse = Unirest.get("https://myid.uz/api/v1/users/me")
                .header("Authorization", "Bearer " + token)
                .asString();

        return objectMapper.readValue(userDataResponse.getBody() , MyIdResponse.class);

    }
}
