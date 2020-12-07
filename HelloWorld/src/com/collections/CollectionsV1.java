package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//排序
public class CollectionsV1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("orange");
        System.out.println(list);
        //collections对list进行排序，排序会直接修改list元素的位置
        Collections.sort(list);
        System.out.println(list);
    }
}
