package com.aditya.taskmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/v1/test")
    public String test() {
        return "JWT Working Successfully";
    }

    @GetMapping("/api/v1/admin")
    public String admin() {
        return "Admin Access Granted";
    }
}