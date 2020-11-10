package com.collection;

import com.sun.jdi.ArrayReference;

import java.util.List;

public class CollectionV3 {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "pear", "banaba", "hh");
//        //list变为array； 方法1toarray 返回一个object[] 数组；会丢失信息，实际应用很少
//        Object[] array = list.toArray();
//        for (Object s : array){
//            System.out.println(s);
//        }
        //第二方式 toArray(T[])传入一个类型相同的Array,list内部自动把元素复制到传入的array中
        //Integer[] arrary = list.toArray(new Integer[3]);
        //toArray(T[])方法的泛型参数<T>并不是List接口定义的泛型参数<E>，所以，我们实际上可以传入其他类型的数组，例如我们传入Number类型的数组，返回的仍然是Number类型：
        //如果我们传入类型不匹配的数组，例如，String[]类型的数组，由于List的元素是Integer，所以无法放入String数组，这个方法会抛出ArrayStoreException。
        String[] arrary = list.toArray(new String[4]);
        for (String n : arrary) {
            System.out.println(n);
        }
        //如果传入的数组大小和list不一致；会创建一个足够大的；多余的用null填充；最好传入恰好的数字
        Integer[] array1 = list.toArray(new Integer[list.size()]);
        //还有一种简洁写法通过List接口定义 T[] toArray(IntFunction<T[]>generator)方法
        Integer[] array2 = list.toArray(Integer[]::new);

    }

}
