package net.sublime.remoteidentify.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import lombok.RequiredArgsConstructor;
import net.sublime.remoteidentify.dto.MyIdAccessTokenResponse;
import net.sublime.remoteidentify.dto.MyIdMobileRequest;
import net.sublime.remoteidentify.service.MyIdService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
import java.net.URISyntaxException;


@RequestMapping("/api/v1/myid")
@RestController
@RequiredArgsConstructor
public class MyIdController {

    private final MyIdService myIdService;

    @PostMapping
    public ResponseEntity<Object> echoGet(@RequestBody MyIdMobileRequest myIdMobileRequest) throws UnirestException, JsonProcessingException {
      String tokenResponse = myIdService.getToken(myIdMobileRequest).getBody();
      return ResponseEntity.ok(myIdService.getUserData(tokenResponse));
    }



}
