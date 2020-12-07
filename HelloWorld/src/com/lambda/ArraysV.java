package com.lambda;
import java.util.Arrays;

public class ArraysV {
    public static void main(String[] args) {
        String[] array = new String[] {"apple", "orange", "banana", "lemon"};
        Arrays.sort(array, (s1, s2) -> {
            return s1.compareTo(s2);
        });
        //只有一行return 可以简化 Arrays.sort(array,(s1,s2)->s1.compareTo(s2);
        System.out.println(String.join(", ", array));
    }
    /*
    * 参数是（s1,s2），参数类型可以省略，编辑器会自动推断出string
    * ->{...}表示方法体，所有代码写在内部即可
    * lambda 表达式没有class定义，写法非常简洁
    * 返回值的类型也是编译器自动推断
    * */


    /*
     * 我们把只定义单方法的接口称之为：FunctionalInterface，用注解@FunctionInterface 标记
     * */
}
