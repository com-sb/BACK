package com.sb.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class homeController {
    private final com.sb.service.homeService homeService;

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello 은선";
//        return homeService.name();
    }
}
