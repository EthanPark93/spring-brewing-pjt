package com.ethan.homebodybrewery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping
    public String mainBoard() {
        return "pages/mainBoard";
    }

    @GetMapping("/free")
    public String freeBoard() {
        return "pages/freeBoard";
    }
}
