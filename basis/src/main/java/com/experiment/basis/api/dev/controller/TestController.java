package com.experiment.basis.api.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dev/basis")
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "Stream Consuming Service";
    }

}
