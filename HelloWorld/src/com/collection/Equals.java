package com.collection;

import java.util.List;

public class Equals {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("xiaoming"),
                new Person("xiaohong"),
                new Person("Bob"),
                new Person("")
        );
        //虽然放了new Person("Bob")，但是用另外一个 new Person("Bob")查不到，是因为person 没有覆写equals()方法
        System.out.println(list.contains(new Person("Bob")));
        System.out.println(list.contains(new Person("")));
    }
    /***
     * 如何编写equals()方法，需要满足以下条件
     * 自反性：对于非null的x来说，x.equals(x)必须返回true；
     * 对称性：对于非null的x和y来说，如果x.equals(y)为true，则y.equals(x)也必须为true；
     * 传递性（Transitive）：对于非null的x、y和z来说，如果x.equals(y)为true，y.equals(z)也为true，那么x.equals(z)也必须为true；
     * 一致性（Consistent）：对于非null的x和y来说，只要x和y状态不变，则x.equals(y)总是一致地返回true或者false；
     * 对null的比较：即x.equals(null)永远返回false。
     */
}
