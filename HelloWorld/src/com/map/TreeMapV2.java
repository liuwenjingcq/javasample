package com.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapV2 {
    public static void main(String[] args) {
        Map<StudentV2, Integer> map = new TreeMap<>(new Comparator<StudentV2>() {
            public int compare(StudentV2 p1, StudentV2 p2) {
                //相等的时候不做说明，get输出为null
                if(p1.score== p2.score){
                    return 0;
                }
                return p1.score > p2.score ? -1 : 1;
            }
        });
        map.put(new StudentV2("Tom", 77), 1);
        map.put(new StudentV2("Bob", 66), 2);
        map.put(new StudentV2("Lily", 99), 3);
        for(StudentV2 key: map.keySet()){
            System.out.println(key);
        }
        System.out.println(map.get(new StudentV2("Bob",66)));//返回null
        //


    }
}
