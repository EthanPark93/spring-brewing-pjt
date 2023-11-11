package com.ethan.homebodybrewery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class BasicLoginController {

    @GetMapping
    public String login() {
        return "/pages/login";
    }
}
