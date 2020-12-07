package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//洗牌,随机打乱list内部元素的顺序
public class CollectionsV2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i =0;i<10;i++){
            list.add(i);
        }
        //洗牌前
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
