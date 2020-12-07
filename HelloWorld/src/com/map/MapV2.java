package com.map;

import java.lang.invoke.StringConcatFactory;
import java.util.HashMap;
import java.util.Map;

/***
 * 重复方式key-value不会有问题
 * 一个key只能关联一个value
 * map不存在重复的key，因为放入相同的key，只会把原来的key-value对应的value替换
 * map 不可以重复，value可以重复
 */
public class MapV2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("apple",123);
        map.put("pear",456);
        map.put("banana",123);
        System.out.println(map.get("apple"));
        map.put("apple",789);
        System.out.println(map.get("apple"));

    }
}
