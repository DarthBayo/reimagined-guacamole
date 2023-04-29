package com.reimagined.guacamole.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fruits")
public class FruitController {

    @GetMapping
    public Map<String, Object> greettings() {
        Map<String, Object> fancyThing = new HashMap<>() {{
            put("fruits", true);
            put("which", "All of them");
            put("message", "There is no message, bye");
        }};

        return fancyThing;
    }
}
