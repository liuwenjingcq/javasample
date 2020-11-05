package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainConstructor {
    public static void main(String[] args) throws Exception {
        //获取构造方法
        Constructor cons1 = Integer.class.getConstructor(int.class);
        //调用构造方法
        Integer n1 = (Integer) cons1.newInstance(123);
        System.out.println(n1);
        //获取构造方法
        Constructor cons2= Integer.class.getConstructor(String.class);
        Integer n2 = (Integer) cons2.newInstance("456");
        System.out.println(n2);
    }
}

//>todo Person p =new Person(); 反射来创建 Person p =Person.class.newInstance();
//>todo newInstance()局限只能调用该类的pubilc的无参数的构造方法


//>todo 通过class实例获取constructor的方法如下：
//>todo getConstructor(class...) 获取某个public的constructor
//>todo getDeclaredConstructor(Class...)：获取某个Constructor；
//>todo getConstructors()：获取所有public的Constructor；
//>todo getDeclaredConstructors()：获取所有Constructor。
//>todo 注意 constructor 总是当前类定义的构造方法与父类无关，不存在多态
//>todo 调用非public的constructor 通过setAccessible（true）设置