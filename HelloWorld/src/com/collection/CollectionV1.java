package com.collection;
//一个java对象在内部持有若干其他java对象，并对外提供访问接口，把这个java对象成为集合；比如java数组

import java.util.ArrayList;
import java.util.List;

/***
 * java标准库自带java.util包含集合类：collection；除map外所有集合类的根接口，包含三种类型集合
 * list：一种有序列表的集合；比如：按照索引排列的student的list
 * set：一种保证没有重复元素的集合；比如，所有无重复名称的student的set
 * map：一种通过键值查找的映射表集合；比如student的name查找的student的map
 *
 * java集合的特点
 * 1、实现接口和实现类分离；比如有序接口是list，具体实现类 arraylist linkedlist
 * 2、支持泛型，我们只限制在一个集合中只能放入同一种数据类型的元素
 *
 * java集合通过统一的方式-迭代器来实现，好处无需知道集合内部元素是按什么方式存储
 */
public class CollectionV1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");//size=1
        list.add("pear");//size=2
        list.add("apple");//允许重复添加元素 size=3
        list.add(null);//允许添加null
        String second = list.get(1);
        System.out.println(list.size());
        System.out.println(second);
    }

}
