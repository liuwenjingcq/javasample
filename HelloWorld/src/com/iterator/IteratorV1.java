package com.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * JAVA的集合类都可以用for eash 循环；list、set、queue会迭代每个元素；map会迭代每个key
 */
public class IteratorV1 {
    public static void main(String[] args) {
        //java把一起并不知道如何遍历list，是因为编译器把for each循环通过iterator改成了普通的for循环
        List<String> list = List.of("apple","orange","pear");
        for (String s :list){
            System.out.println(s);
        }
        /**
         * 与上述代码等价
        for (Iterator<String> it = list.iterator(); it.hasNext();){
            String s = it.next();
            System.out.println(s);
        }
         通过 Iterator对象遍历集合的模式成为迭代器
         使用迭代器的好处，调用方总是以统一的方式遍历各种集合类型，而不必关心内部的存储结构
         */
        //如果我们自己编写了一个集合类，想要使用for each循环，只需满足以下条件：
        //  集合类实现Iterable接口，该接口要求返回一个Iterator对象；
        //  用Iterator对象迭代集合内部数据。
    }
}
