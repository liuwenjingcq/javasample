package com.map;

import java.time.DayOfWeek;
import java.util.*;

/***
 * hashmap是一种通过key计算hashcode()通过空间换时间的方式
 * enumMap一个紧凑的数组存储value，并根据enum类型的key直接定位到内部数组的索引，并不需要计算hashcode ()，不但效率最高也没有额外的空间浪费
 * DayOfWeek 枚举类型
 * 如果map的key是enum，推荐使用enummap，既保证速度也不浪费空间
 * 使用enummap的时候，根据面向抽象编程的原则，应持有map接口
 */
public class EnumMap {
    public static void main(String[] args) {
        Map<DayOfWeek,String> map = new java.util.EnumMap<DayOfWeek, String>(DayOfWeek.class);
        map.put(DayOfWeek.MONDAY,"星期一");
        map.put(DayOfWeek.TUESDAY,"星期二");
        map.put(DayOfWeek.WEDNESDAY,"星期三");
        map.put(DayOfWeek.THURSDAY,"星期四");
        map.put(DayOfWeek.FRIDAY,"星期五");
        map.put(DayOfWeek.SATURDAY,"星期六");
        map.put(DayOfWeek.SUNDAY,"星期日");
        //使用enumMap的时候，总是用map饮用，实际hashmap和enummap互换，客户端没有任何区别；
        System.out.println(map);
        System.out.println(map.get(DayOfWeek.MONDAY));
    }
}
