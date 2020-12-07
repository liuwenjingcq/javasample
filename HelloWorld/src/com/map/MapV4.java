package com.map;

import java.util.HashMap;
import java.util.Map;

//同时遍历key 和value，for each循环遍历map的entryset()，包含每一个key-value映射

/***
 * map和list不同，map存储的是key-value的映射关系，不保证顺序；遍历的顺序不一定是put时的顺序；
 * 遍历map时，不可假设输出的key是有序的
 */
public class MapV4 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 123);
        map.put("pear", 456);
        map.put("banan", 789);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
