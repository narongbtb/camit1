package com.zib.camit1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamitController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Camit!";
    }
}
