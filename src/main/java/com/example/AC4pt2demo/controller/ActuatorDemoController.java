package com.example.AC4pt2demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorDemoController {
    @GetMapping("/get-info")
    public String getStringMessage(){
        return "Hi ! You will be able to monitor the health of the application !!";
    }
}
