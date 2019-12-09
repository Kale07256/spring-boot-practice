package com.example.demo.Threaddemo;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class CustomMultiThreadingService {

    private Logger logger = LoggerFactory.getLogger(CustomMultiThreadingService.class);
    static int yigezhi = 5;

    private final static Byte[] ob = new Byte[1];


    @Async
    public void executorAysncTask1() {
        synchronized (ob) {
            while (yigezhi > 0) {
                yigezhi--;

                System.out.println(yigezhi);
            }
        }
        logger.info("CustomMultiThreadingService ==> executeAysncTask1 method: 执行异步任务{}", Thread.currentThread().getName());
    }

    @Async
    public void executeAsyncTask2(Integer i, int ou) {
        ou = ou - 1;
        System.out.println(ou);
        logger.info("CustomMultiThreadingService ==> executeAysncTask2 method: 执行异步任务{}", i);
    }


}
