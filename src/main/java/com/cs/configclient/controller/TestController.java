package com.cs.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping(value = "/test", produces = "application/json;charset=UTF-8")
public class TestController {

    @Value("${name}")
    private String name;

    @Value("${refresh}")
    private String refresh;

    @GetMapping("/getName")
    public String testLogin() {
        return name;
    }

    @GetMapping("/refresh")
    public String getPort() {
        return refresh;
    }
}
