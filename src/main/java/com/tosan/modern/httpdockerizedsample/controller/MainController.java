package com.tosan.modern.httpdockerizedsample.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping(value = "/helloWorld")
    public String helloWorld(@RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            return "hello stranger";
        }
        return "hello " + name;
    }

    @GetMapping(value = "/author", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getAuthorName() {
        return "Mina Khoshnevisan";
    }
}
