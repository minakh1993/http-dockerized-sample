package com.tosan.modern.httpdockerizedsample.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping(value = "/helloWorld")
    public String helloWorld(HttpServletRequest httpRequest) {
        String name = httpRequest.getParameter("name");
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
