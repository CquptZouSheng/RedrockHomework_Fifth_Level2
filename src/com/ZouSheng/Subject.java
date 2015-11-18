package com.ZouSheng;

/**
 * Created by Zou Sheng on 2015/11/18.
 */
public class Subject {
    public static void main(String[] args) {
        //生成两个线程对象(一个继承Thread类，一个生成Runnable接口实现类)
        FirstThread a=new FirstThread();
        SecondThread secondThread=new SecondThread();
        Thread b=new Thread(secondThread);
        //启动a,b线程(两个线程同步运行)
        a.start();
        b.start();
        System.out.println("\n");
        //直接调用run方法(两个线程分先后运行)
        a.run();
        b.run();
    }
}
