package com.ZouSheng;

/**
 * Created by Zou Sheng on 2015/11/18.
 */
public class FirstThread extends Thread{
    public void run()
    {
        for (int i=0;i<100;i++) {
            System.out.println("武侠学长真帅!");//黑学长100次（逃）
        }
    }
}
