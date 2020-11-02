package com;

import java.util.Random;

public class LearnMath  {
    public static void main(String[] args) {
        System.out.println(Math.random());
        //math的random使用random类来实现的，它在java.util包
        Random random=new Random();
        for (int i =0;i <100;i++){
            //nextint返回值竟然有负数，需要看文档仔细
            System.out.println(Math.abs(random.nextInt()));
        }
        //取整；需要验证下，看文档；
        System.out.println(Math.round(-9.2));
        System.out.println(Math.round(-9.5));
        System.out.println(Math.round(-9.8));
        System.out.println(Math.round(9.2));
        System.out.println(Math.round(9.5));
        System.out.println(Math.round(9.8));
    }
}
