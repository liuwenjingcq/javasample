package com.stream;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamV1 {
//    int result = createNaturalStream()//创建stream
//                 .filter(n->n%2 ==0)//任意个转换
//                 .map(n->n*n)//任意个转换
//                 .limit(100) //任意个转换
//                 .sum();//最终计算结果

    /*Stream API的特点是：
     Stream API提供了一套新的流式处理的抽象序列；
     Stream API支持函数式编程和链式操作；
     Stream可以表示无限序列，并且大多数情况下是惰性求值的。*/


    public static void main(String[] args) {
        //创建stream;创建Stream最简单的方式是直接用Stream.of()静态方法，传入可变参数即创建了一个能输出确定元素的Stream：
        Stream<String> stream = Stream.of("A", "B", "C", "D");
        //foreach()方法相当于内部循环嗲用
        //可传入符合cosumer接口的void accept（T t）的方法引用
        stream.forEach(System.out::println);
        //第二种创建stream的方法是基于一个数组或者collection，这样/stream输出的元素就是数组或者collection持有的元素
        //把数组变成Stream使用Arrays.stream()方法。对于Collection（List、Set、Queue等），直接调用stream()方法就可以获得Stream。
        //上述创建Stream的方法都是把一个现有的序列变为Stream，它的元素是固定的。
        Stream<String> stream1 = Arrays.stream(new String[]{"A", "B", "C"});
        Stream<String> stream2 = List.of("X", "Y", "Z").stream();
        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);

        //创建stream可以通过Stream.generate()方法，它需要传入一个Supplier对象
        //基于Supplier创建的Stream会不断调用Supplier.get()方法来不断产生下一个元素，这种Stream保存的不是元素，而是算法，它可以用来表示无限序列。
        //编写一个不断生产自然数的supplier
        //Stream<Integer> natual = Stream.generate(new NatualSupplier());
        Stream<Integer> natual = Stream.generate(new NatualSupplier());
        //注意 无限序列必须先编程有限序列再打印
        natual.limit(20).forEach(System.out::println);
        //对于无限序列，如果直接调用forEach()或者count()这些最终求值操作，会进入死循环，因为永远无法计算完这个序列，所以正确的方法是先把无限序列变成有限序列，例如，用limit()方法可以截取前面若干个元素，这样就变成了一个有限序列，对这个有限序列调用forEach()或者count()操作就没有问题。

//        //创建stream 的第单中方法是一些api提供的接口直接获得stream
//        try (Stream<String> lines = Files.lines(Paths.get("/path/to/file.txt"))) {
//    ...
//        }

        }
}
