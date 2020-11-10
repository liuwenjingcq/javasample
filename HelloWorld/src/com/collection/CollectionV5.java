package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionV5 {
    public static void main(String[] args) {
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        System.out.println(removed);
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }
//方式1：新建一个新的list，依次对比
//    static int findMissingNumber(int start, int end, List<Integer> list) {
//        List<Integer> list2 = new ArrayList<>();
//        int i;
//        int j;
//        for (i = start; i <= end; i++) {
//            list2.add(i);
//        }
//        System.out.println("list2:" + list2.toString());
//        for (j = 0; j < list.size(); j++) {
//            if (list2.get(j) != list.get(j)){break;}
//
//        }
//        return list2.get(j);
//    }

    //方式2：新建list，对比；遍历方式更换
    static int findMissingNumber(int start, int end, List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        int found = 0;
        for (int i = start; i <= end; i++) {
            list1.add(i);
        }
        for (Integer integer : list1) {
            if (!list.contains(integer)) {
                found = integer;
            }
        }
        return found;
    }
}
