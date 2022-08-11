package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/{user}") // POST PUT DELETE
    public String hello(@PathVariable String user) // REQUEST PARAM / REQUEST BODY
    {
        return "Hello " + user;
    }
}

