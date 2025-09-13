package com.mks.azure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AzureDemoController {

    @GetMapping("/deploy/azure")
    public ResponseEntity<String> getResponse(){
        return ResponseEntity.ok("congratulations you have successfully deploy app on azure \uD83C\uDF89");
    }
}
