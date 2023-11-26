package com.ethan.homebodybrewery.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicLoginController {
    @GetMapping("/loginForm")
    public String login(Authentication authentication) {
//
        if (authentication != null && authentication.isAuthenticated()) {
            // 이미 인증된 사용자라면 리다이렉트
            return "redirect:/mypage";
        } else {
            return "pages/loginForm";
        }
    }
}
