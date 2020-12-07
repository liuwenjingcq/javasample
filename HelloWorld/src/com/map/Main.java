package com.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("xiaoming",99);
        Map<String,Student>map = new HashMap<>();
        map.put("xiaoming",s);//将"xiaoming"和student实例映射并关联
        Student target = map.get("xiaoming");//通过key查找并返回映射的student实例
        System.out.println(target == s);
        System.out.println(target.score);
        Student another = map.get("Bob");
        System.out.println(another);
    }
    /***
     * put(k key,v value)把key value 做了映射并放入map；调用get（key）通过key获取value；如果key 不存在返回null
     * map也是一个接口，最常用的实现类是hashmap
     * 如果查询某个key是否存在，boolean containsKey（k key)方法
     *
     */
}
