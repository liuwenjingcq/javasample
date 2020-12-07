package com.map;

import java.util.Comparator;
import java.util.Map;

/***
 * hashmap顺序是不可预测的
 * 有一种map内部会对key进行排序，这种map就是sortedmap，SortedMap是接口，它的实现类是TreeMap
 * 使用TreeMap的时候，放入的key必须实现comparable接口；string integer这些类已经实现了，所以可以直接作为key使用。
 * 如果作为key的class没有实现comparable接口，必须在创建treemap的时候指定一个自定义排序算法
 */
public class TreeMapV1 {

    public static void main(String[] args) {
        Map<PersonV2, Integer> map = new java.util.TreeMap<>(new Comparator<PersonV2>() {
            public int compare(PersonV2 o1, PersonV2 o2) {
                return o1.name.compareTo(o2.name);
            }
            /***
             * comparator接口实现一个比较方法，负责比较传入的两个元素a和b，如果a<b则返回负数，-1；如果a=b返回0；如果a>b,则返回正数=1；
             * treemap内部根据比较结果对key进行排序
             */
        });
        map.put(new PersonV2("tom"), 1);
        map.put(new PersonV2("bob"), 2);
        map.put(new PersonV2("lily"), 3);
        for (PersonV2 key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println(map.get(new PersonV2("bob")));
    }
}


