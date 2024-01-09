package com.leronarenwino.springbootapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/app/hello")
    public Map<String, String> hello() {

        Map<String, String> json = new HashMap<>();
        json.put("message", "Hello World!");
        json.put("date", new Date().toString());

        return json;
    }

}
