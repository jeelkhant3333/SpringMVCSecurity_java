package com.jash.springboot.demoSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showLogin(){
        //return "plain-login";
        return "fancy-login";
    }

    @GetMapping("/error")
    public String showError(){
        return "error";
    }
}
