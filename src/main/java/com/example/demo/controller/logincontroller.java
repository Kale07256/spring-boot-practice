package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class logincontroller {
    @RequestMapping("/")
    public ModelAndView word() {
        ModelAndView modelAndView = new ModelAndView();

//        modelAndView.addObject("type", "something");
        modelAndView.setViewName("loginindex.html");
        return modelAndView;
    }

}


