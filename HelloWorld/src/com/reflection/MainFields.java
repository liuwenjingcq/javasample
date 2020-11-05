package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class MainFields {
    public static void main(String[] args) throws  Exception{
        Class stdClass =Student.class;
        System.out.println(stdClass.getField("score"));
        System.out.println(stdClass.getField("name"));
        System.out.println(stdClass.getDeclaredField("grade"));
//        Field f = String.class.getDeclaredField("value");
//        f.getName();
//        f.getType();
//        int m = f.getModifiers();
//        Modifier.isFinal(m);
//        Modifier.isPublic(m);
//        Modifier.isProtected(m);
//        Modifier.isPrivate(m);
//        Modifier.isStatic(m);


    }
    class Student extends Person{
        public int score;
        private int grade;
    }
    class Person{
        public  String name;
    }
//    public final class String{
//        private final byte[] value = new byte[0];
//    }
}
