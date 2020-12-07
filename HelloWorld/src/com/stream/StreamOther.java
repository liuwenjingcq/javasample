package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOther {
    public static void main(String[] args) {
        //对stream 排序
        //此方法要求Stream的每个元素必须实现Comparable接口。如果要自定义排序，传入指定的Comparator即可：
        //.sorted(String::compareToIgnoreCase)
        //sorted()只是一个转换操作，它会返回一个新的Stream。
        List<String> list = List.of("Orange","apple","Banana")
                .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);
        //去重
        List<String> list2 =List.of("A", "B", "A", "C", "B", "D")
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list2);

        //截取:截取操作也是一个转换操作，将返回新的Stream。
        List<String> list1 =List.of("A", "B", "C", "D", "E", "F")
                .stream()
                .skip(2)//跳过A,B
                .limit(3) //截取 C,D,E
                .collect(Collectors.toList());//[C,D,E]
        System.out.println(list1);
        //合并：将两个Stream合并为一个Stream可以使用Stream的静态方法concat()：
        Stream<String> s1 = List.of("A","B","C").stream();
        Stream<String> s2 = List.of("D","E").stream();
        Stream<String> s = Stream.concat(s1,s2);
        System.out.println(s.collect(Collectors.toList()));
       //flatMap  如果stream 是元素，希望转换为Stream<Integer>，就可以使用flatMap()：
        //因此，所谓flatMap()，是指把Stream的每个元素（这里是List）映射为Stream，然后合并成一个新的Stream：
        Stream<List<Integer>> ss = Stream.of(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );
        Stream<Integer> i = ss.flatMap(listss ->listss.stream());

        //并行 经过parallel()转换后的Stream只要可能，就会对后续操作进行并行处理。我们不需要编写任何多线程代码就可以享受到并行处理带来的执行效率的提升。
        Stream<String> sss = Stream.of("A", "B", "A", "C", "B", "D");
        String[] result = s.parallel() //变成一个可以并行处理的stream
                           .sorted()
                           .toArray(String[]::new);


        }

}
