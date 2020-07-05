package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class THController {

    @RequestMapping("/demo")
    public String hello(Model model){
        model.addAttribute("hello","hello welcome");
        return "demo";
    }
}
