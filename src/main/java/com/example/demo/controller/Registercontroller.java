package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Registercontroller {
    @RequestMapping("/registerindex")
    public ModelAndView word() {
        ModelAndView modelAndView = new ModelAndView();

//        modelAndView.addObject("type", "something");
        modelAndView.setViewName("registerindex.html");
        return modelAndView;
    }
}
