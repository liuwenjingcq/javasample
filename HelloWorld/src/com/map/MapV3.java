package com.map;

import java.util.HashMap;
import java.util.Map;

//遍历map,遍历key可以使用for each循环遍历map实例的keyset()方法返回set集合，他包含不重复的key的集合
public class MapV3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 123);
        map.put("pear", 456);
        map.put("banana", 789);
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }

    }
}
