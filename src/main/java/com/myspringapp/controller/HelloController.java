package com.myspringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sushil M S Karki
 * @version 0.1
 * @quote "Did you code today?"
 * @Date 07/28/2021
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld(){
        return "Application starts from here";
    }
}
