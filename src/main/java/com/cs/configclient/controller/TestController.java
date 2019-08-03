package com.cs.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test", produces = "application/json;charset=UTF-8")
public class TestController {

    @Value("${name}")
    private String name;

    @GetMapping("/getName")
    public String testLogin() {
        return name;
    }
}
