package com.reflection;

import java.lang.reflect.Field;

public class MainFieldsV2 {
    public static void main(String[] args) throws Exception {
        Object p = new Person("xiaoming");
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        //正常情况下mian不能访问person的priva字段，别管这个字段是不是public，一律允许访问
        f.setAccessible(true);
        Object value = f.get(p);
        System.out.println(value); //xiaoming

    }

}

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }
}

