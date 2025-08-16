package com.elavarasan.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @GetMapping("/public")
    public String publicApi(){
        return "Public api";
    }

    @GetMapping("/private")
    public String privateApi(){
        return "Private api";
    }
}
