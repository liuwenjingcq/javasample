package com.reflection;

public class MainClass {
    public static void main(String[] args) {
        Number n = new Double(123.456);
        //无继承关系的数据类型无法赋值
        //String s = new Double(123.456);//compile error
//Class实例在jvm中是唯一的，所以class实例是同一个实例
        Class cls1 = String.class;
        String s = "hello";
        Class cls2 = s.getClass();
        System.out.println(cls1 == cls2);

        Integer n1 = new Integer(123);
        boolean b1 = n1 instanceof Integer;//true 因为n是integer类型
        System.out.println(b1);
        boolean b2 = n1 instanceof Number;//true 因为n是number类型的子类
        System.out.println(b2);
        boolean b3 = n1.getClass() == Integer.class; //true 因为n.getclass()返回的Integer.class
        System.out.println(b3);
        //boolean b4 = n1.getClass() == Number.class;
        // false因为Integer.class!=Number.class//报错不能比较
        //System.out.println(b4);
    }

}
