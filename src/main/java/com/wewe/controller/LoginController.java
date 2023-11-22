package com.wewe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("")
@Controller
public class LoginController {


    @GetMapping(value = "/login")
    public String login(ModelMap modelMap) {
        System.out.println("hello login");
        return "login";
    }
}
