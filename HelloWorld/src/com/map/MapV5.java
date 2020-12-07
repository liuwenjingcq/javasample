package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapV5 {
    /***
     * Map是一种键-值映射表
     * hashmap之所以能通过key快速拿到value，原因是内部通过空间换时间的方法，用一个大数组存储所有的value，并根据key直接计算出value应该存储在哪个索引
     * 如果key的值"a"的计算得到的索引是1，因此返回value为Person("xiaoming")
     * 问题：两个key内容相同，但不一定是同一个对象
     */
    public static void main(String[] args) {
        String key1 ="a";
        Map<String,Integer> map = new HashMap<>();
        map.put(key1,123);

        String key2 = new String("a");
        map.get(key2);
        System.out.println(map.get(key2));//123

        System.out.println(key1 == key2);//flase
        //map内部对key的比较通过equals实现，string作为key，string已经覆写了eauals()方法；如果传入的key是自己写的类，一定保证正确覆写了equals方法
        //hashmap为什么能通过key直接结算处value存储的索引，相同的key必须计算出相同的索引，否则相同的key每次取出的calue就不一定对
        System.out.println(key1.equals(key2));//true
        /***
         * 通过key计算索引的方式就是调用key对象的hashcode()方法；返回了一个int整数
         * hashmap正式通过这个方法直接定位key对应的value的索引，继而直接返回value
         * 因此，正确使用map必须保证：
         * 1、作为key的对象必须正确覆写equals()方法，相等的两个key实例调用equals()必须返回true
         *  --必须保证实现，否则hashmap不能正常工作
         * 2、作为key的对象还必须正确覆写hashcode()方法，且hashcode(0方法要严格遵守以下规范
         * --尽量满足，则可以保证查询效率；因为不同的对象，如果返回相同的hashcode，会造成map内部存储冲突，使存储的效率下降
         *  1）如果两个对象相等，则两个对象的hashCode()必须相等
         *  2）如果两个对象不相等，则两个对象的hashCode()尽量不要相等
         */
    }
}
