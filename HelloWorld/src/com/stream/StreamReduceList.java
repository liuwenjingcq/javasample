package com.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReduceList {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "", null, "pear", " ", "orange");
        //把Stream的每个元素收集到List的方法是调用collect()并传入Collectors.toList()对象，它实际上是一个Collector实例，通过类似reduce()的操作，把每个元素添加到一个收集器中（实际上是ArrayList）。
        //类似的，collect(Collectors.toSet())可以把Stream的每个元素收集到Set中。//stream把每个元素收集到list方法是调用collect()并传入Collectors.toList()对象，实际上是一个collector实例
        List<String> list = stream.filter(s -> s != null && !s.isBlank()).collect(Collectors.toList());
        System.out.println(list);
        //把stream 的元素输出为数组和输出为list类型
        List<String> list1 = List.of("Apple", "Banana", "Orange");
        String[] array = list1.stream().toArray(String[]::new);
        //输出为map
        Stream<String> stream1 = Stream.of("APPL:apple", "MSFT:Microsoft");
        Map<String, String> map = stream1
                .collect(Collectors.toMap(
                        //把元素s映射为key
                        s -> s.substring(0, s.indexOf(':')),
                        //把元素s映射为value
                        s -> s.substring(s.indexOf(':') + 1)));
        System.out.println(map);
    }

}

