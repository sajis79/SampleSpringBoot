package com.saji.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sajis on 12/02/17.
 */
@RestController
@EnableAutoConfiguration
public class StudentController {
    @RequestMapping("/")
    public String sayHello(){
        return "Hello from my first spring App";
    }
}
