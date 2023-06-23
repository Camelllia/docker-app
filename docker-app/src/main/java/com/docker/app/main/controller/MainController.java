package com.docker.app.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/docker-app")
    public ResponseEntity<?> docker() {
        return new ResponseEntity<>("------- Docker APP -------", HttpStatus.OK);
    }

    @GetMapping("/jenkins-webhooks")
    public ResponseEntity<?> jenkins() {
        return new ResponseEntity<>("------- commit -------", HttpStatus.OK);
    }
}
