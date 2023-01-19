package com.example.apidemo.rest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/echo/{text}")
    public ResponseEntity getEcho(@PathVariable String text) {

        if (text.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(text);
    }

}
