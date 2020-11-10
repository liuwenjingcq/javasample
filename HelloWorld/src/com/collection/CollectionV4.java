package com.collection;

import java.util.List;

public class CollectionV4 {
    public static void main(String[] args) {
        //array 转换为list
        Integer[] array = {1,2,3};
        List<Integer> list = List.of(array);
        //返回的List不一定就是ArrayList或者LinkedList，因为List只是一个接口，如果我们调用List.of()，它返回的是一个只读List
        //只读List调用add()、remove()方法会抛出UnsupportedOperationException。
        List<Integer> list1 = List.of(12, 34, 56);
        //list1.add(999); // UnsupportedOperationException

    }

}
