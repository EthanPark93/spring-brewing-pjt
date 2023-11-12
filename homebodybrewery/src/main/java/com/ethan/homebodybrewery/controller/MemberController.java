package com.ethan.homebodybrewery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
public class MemberController {

    @GetMapping("/new")
    public String createMemberForm() {
        return "pages/createMemberForm";
    }

    @PostMapping("/new")
    public String createMember() {
        return "index";
    }
}
