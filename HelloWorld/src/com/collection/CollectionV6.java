package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collection.*;
import static java.util.Collections.shuffle;

public class CollectionV6 {
    public static void main(String[] args) {
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            list.add(i);
        }
        System.out.println("yuanshi: " + list.toString());
        //洗牌算法shuffle可以随机交换list中的元素位置
        Collections.shuffle(list);
        System.out.println("jiaohuan: " + list.toString());
        int removed = list.remove((int) (Math.random() * list.size()));
        System.out.println("shanchu: " + list.toString());
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number:" + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }

    static int findMissingNumber(int start, int end, List<Integer> list) {
        List<Integer> lists = new ArrayList<>();
        for(int i=start; i <= end;i++) {
            lists.add(i);
        }
        for(Integer n : lists) {
            if(list.contains(n)==false) {
                return n;
            }
        }
        return 0;
    }

}
