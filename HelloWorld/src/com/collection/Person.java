package com.collection;

import java.util.Objects;

public class Person {
    public String name;
    public int age;

    public Person(String name) {
        this.name = name;
    }

//    //方式一：
//    public boolean equals(Object o) {
//        if (o instanceof Person) {
//            Person p = (Person) o;
//            return this.name.equals(p.name) && this.age == p.age;
//        }
//        return false;
//    }

    //方式二：增加为空判断
//    public boolean equals(Object o) {
//        if (o instanceof Person) {
//            Person p = (Person) o;
//            boolean nameEquals = false;
//            if (this.name == null && p.name == null) {
//                nameEquals = true;
//            }
//            if (this.name != null) {
//                nameEquals = this.name.equals(p.name);
//            }
//            return nameEquals && this.age == p.age;
//        }
//        return false;
//    }

    //方式三：简写 使用bject.equals()静态方法
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person p = (Person) o;
            return Objects.equals(this.name, p.name) && this.age == p.age;
        }
        return false;
    }
}

/***
 * equals的写法：
 * 1、先确定实例相等的逻辑，即哪些字段相等，被认为实例相等
 * 2、用instanceof 判断传入的待比较的object是不是当前类型，如果是继续比较，否则false
 * 3、对引用类型的object.equals()比较，对基本类型直接用==比较
 */
