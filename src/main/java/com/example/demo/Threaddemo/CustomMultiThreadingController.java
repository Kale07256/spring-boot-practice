package com.example.demo.Threaddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/multithreading")
public class CustomMultiThreadingController {


    @Autowired
    private CustomMultiThreadingService customMultiThreadingService;

    @ResponseBody
    @RequestMapping(value = "/dotask")
    public String doTask() {
        customMultiThreadingService.executorAysncTask1();
        customMultiThreadingService.executorAysncTask1();
//            customMultiThreadingService.executeAsyncTask2(i,aaa);


        return "success";
    }
}
