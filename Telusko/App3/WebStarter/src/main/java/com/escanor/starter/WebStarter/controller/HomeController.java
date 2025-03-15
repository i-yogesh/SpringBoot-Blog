package com.escanor.starter.WebStarter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HomeController {

//    @ResponseBody
    @RequestMapping("/")
    public String greet(){
        return "Welcome to the Darkness!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Angel Of Darkness";
    }
}
