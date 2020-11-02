package com.supermarket;
//静态变量引入方式一：import，直接用静态变量名；一种类名.变量名
//import static com.supermarket.Merchandise.DISCONT_FOR_VIP;

public class Main {
    public static void main(String[] args) {
        System.out.println(Merchandise.DISCONT_FOR_VIP);
        System.out.println(Math.random());
    }
}
