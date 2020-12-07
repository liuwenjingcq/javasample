package com.stream;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroup {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Blackberry", "Coconut", "Avocado", "Cherry", "Apricots");
        Map<String,List<String>> groups = list.stream()
                .collect(Collectors.groupingBy(s->s.substring(0,1), Collectors.toList()));
        //Collectors.groupingBy 提供两个函数，一个是分组的keys->s.substring(0,1)，表示只要首字母相同的string分到第一组，第二个是分组的
        // value，这里直接使用，Collectors.toList()表示输出为List
        System.out.println(groups);
    }
}
