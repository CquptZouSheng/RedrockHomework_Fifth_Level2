package com.ZouSheng;

/**
 * Created by Zou Sheng on 2015/11/18.
 */
public class SecondThread implements Runnable{
    public void run()
    {
        for (int i=0;i<100;i++) {
            System.out.println("凌霄学姐真漂亮!");//黑学姐100次（逃）
        }
    }
}
