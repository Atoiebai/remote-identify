package net.sublime.remoteidentify.controller;

import net.sublime.remoteidentify.dto.MyIdResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/myid")
@RestController
public class EchoController {

    @PostMapping
    public ResponseEntity<Object> echo(@RequestBody MyIdResponse object) {
        return ResponseEntity.ok(object);
    }

    @GetMapping
    public ResponseEntity<Object> echoGet() {
        return ResponseEntity.ok("Success 200");
    }


}
