package com.collection;

import java.util.Iterator;
import java.util.List;

public class CollectionV2 {
    public static void main(String[] args) {
        //创建list，除了arraylist 和linkedlist ，还可以用list接口提供的of方法，根据给定元素快速创建list
        List<String> list = List.of("apple","pear","banana");
        //get(int) 只有arraylist的实现是高效的；换成linkedlist索引越大访问速度越慢，不推荐
//        for(int i =0;i<list.size();i++){
//            String s = list.get(i);
//            System.out.println(s);
//        }
        //坚持使用迭代器访问；Iterator 本身也是一个对象，是由list的实例调用iterator（）方法创建；iterator知道如何遍历一个list，
        // 不同list类型返回iterator对象实现也是不同的，但是具有最高的访问效率
        //Iterator 有两个方法：boolen hasNext()判断是否有下一个元素；E next() 返回下一个元素；
        //通过Iterator遍历List永远是最高效的方式
//        for(Iterator<String> it = list.iterator(); it.hasNext();){
//            String s = it.next();
//            System.out.println(s);
//        }
        //for each 循环本身就可以帮助我们使用Iterator遍历
        for (String s:list){
            System.out.println(s);
        }
    }
}
