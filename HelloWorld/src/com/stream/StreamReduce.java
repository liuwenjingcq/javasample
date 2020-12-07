package com.stream;

import java.util.stream.Stream;

public class StreamReduce {
    public static void main(String[] args) {
        //指定初始为0 ，每个元素调用（acc，n） acc就是上次计算结果
        //reduce()方法将一个Stream的每个元素依次作用于BinaryOperator，并将结果合并。
        //reduce()是聚合方法，聚合方法会立刻对Stream进行计算。
        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(0,(acc, n) -> acc + n);
        int s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(1,(acc, n) -> acc * n);
        System.out.println(sum);
        System.out.println(s);
    }
}
