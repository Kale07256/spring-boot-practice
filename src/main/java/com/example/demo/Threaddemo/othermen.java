package com.example.demo.Threaddemo;

public class othermen {


    static class Station extends Thread {

        // 通过构造方法给线程名字赋值
        public Station(String name) {
            super(name);// 给线程名字赋值
        }

        // 为了保持票数的一致，票数要静态
        static int tick = 5;

        // 创建一个静态钥匙
        static Object ob = "aa";//值是任意的

        // 重写run方法，实现买票操作
        @Override
        public void run() {
            while (tick > 0) {
                synchronized (ob) {
                    // 进去的人会把钥匙拿在手上，出来后才把钥匙拿让出来
                    if (tick > 0) {
                        System.out.println(getName() + "卖出了第" + tick + "张票");
                        tick--;
                    } else {
                        System.out.println("票卖完了");
                    }
                    try {
                        sleep(1000);//休息一秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }


    public static void main(String[] args) {
//        Byte[] bytes = new Byte[1];
//        bytes[0] = 1;
//        System.out.println(bytes.length);
//        System.out.println(bytes[0].toString());


////实例化站台对象，并为每一个站台取名字
//        Station station1 = new Station("窗口1");
//        Station station2 = new Station("窗口2");
//        Station station3 = new Station("窗口3");
//
//        // 让每一个站台对象各自开始工作
//        station1.start();
//        station2.start();
//        station3.start();

    }
}
