package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*启动类*/
//@RestController
@SpringBootApplication
public class DemoApplication extends WebMvcConfig {


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

