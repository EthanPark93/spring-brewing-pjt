package com.ethan.homebodybrewery.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/auth")
public class Oauth2LoginController {
    @GetMapping(value = "kakao", produces = MediaType.APPLICATION_JSON_VALUE)
    public void getKakaoUserInfo(String code) {
        log.info("OAuth Code : "+code);

    }
}
