package com.collection;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person1> list = List.of(
                new Person1("Xiao", "Ming", 18),
                new Person1("Xiao", "Hong", 25),
                new Person1("Bob", "Smith", 20)
        );
        boolean exist = list.contains(new Person1("Bob", "Smith", 20));
        System.out.println(exist ? "测试成功!" : "测试失败!");
    }
}
