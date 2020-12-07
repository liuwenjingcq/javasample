package com.lambda;

import java.util.List;
import java.util.stream.*;

public class LambdaV2 {
    public static void main(String[] args) {
        List<String> names = List.of("Bob", "Alice", "Tim");
        List<Person> persons = names.stream().map(Person::new).collect(Collectors.toList());
        System.out.println(persons);
    }
}

class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
    public String toString() {
        return "Person:" + this.name;
    }

    /*FunctionalInterface允许传入:
    接口的实现类（传统写法、代码较繁琐）
    lambda表达式（只需要列出参数名，由编译器推断类型）
    符合方法签名的静态方法
    符合方法签名的实例方法（实例类型被看作第一个参数类型）
    符合放过签名的构造方法（实例类型被看做返回类型）
    FunctionalInterface不强制继承关系，不需要方法名称相同，只要求方法参数（类型和数量）与方法返回类型相同，即认为方法签名相同。
    * */

    
}
