package com;

import jdk.jshell.spi.SPIResolutionException;

import java.math.BigInteger;

public class MAIN {
    public static void main(String[] args) {
        /***
         * Weekday类  设置默认值
         */
        Weekday day = Weekday.SUN;
        if (day == Weekday.SAT || day == Weekday.SUN) {
            System.out.println("work at home!");
        } else {
            System.out.println("work at office!");
        }
        /***
         * Weekday2类  ，有序号，按照值获取，不用担心顺序
         */
        Weekday2 day2 =Weekday2.SUN;
        if (day2.dayValue == 6 || day2.dayValue == 0) {
            System.out.println("work at home!");
        } else {
            System.out.println("work at office!");
        }

        /***
         * Weekday3类，有序号，有值获取
         */
        Weekday3 day3 =Weekday3.SUN;
        if (day3.dayValue == 6 || day3.dayValue == 0) {
            System.out.println("Today is" + day3 +".work at home!");
        } else {
            System.out.println("Today is" + day3 +".work at office!");
        }

        /***
         * enum switch
         */
        switch (day){
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Today is" + day +".work at home!");
                break;
            case SAT:
            case SUN:
                System.out.println("Today is" + day3 +".work at office!");
                break;
            default://加上default语句，可以在漏写某个枚举常量时自动报错，从而及时发现错误。
                throw new RuntimeException("cannot process"+day);
        }
        BigInteger bi = new BigInteger("1234567890");
        System.out.println(bi.pow(5)); // 2867971860299718107233761438093672048294900000
    }
}
