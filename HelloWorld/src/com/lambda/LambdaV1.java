package com.lambda;

import java.util.Arrays;

public class LambdaV1 {
    public static void main(String[] args) {
        String[] array = new String[] {"Apple","orange","banana","orange"};
        //在Arrays.sort()中直接传入静态方法cmp的引用
        //所谓的方法引用，是指如果某个方法的签名和接口恰好一致，可以直接传入方法引用
        //因为Comparator<String>接口定义的方法是int compare(String, String)，和静态方法int cmp(String, String)相比，
        // 除了方法名外，方法参数一致，返回类型相同，因此，我们说两者的方法签名一致，可以直接把方法名作为Lambda表达式传入：Arrays.sort(array, Main::cmp);
        //Arrays.sort(array, Main::cmp);
        //注意：方法签名只看参数类型和返回类型，不看方法名称，也不看类的继承关系
        Arrays.sort(array,LambdaV1::cmp);
        //String.compareTo()方法也符合Lambda定义
        /*查看string.compareTo()的方法定义
        public final class String{
            public int compareTo(String 0){}
            }
             这个方法只有一个参数，为什么和int Comparator<String>.compare(String, String)能匹配呢
             因为实例方法有一个隐藏的this参数，String类的compareTo()方法在实际调用的时候，第一个隐含参数总是传入this，相当于静态方法：
             public static int compareTo(this, String o);
        * */
        Arrays.sort(array,String::compareTo);
        System.out.println(String.join(", ",array));
    }
    static int cmp(String s1,String s2){
        return s1.compareTo(s2);
    }
    /*除了可以引用静态方法和实例方法，还可以引用构造方法

    * */
}
