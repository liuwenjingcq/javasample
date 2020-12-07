package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections还提供了一组方法把可变集合封装成不可变集合：
 * 封装成不可变List：List<T> unmodifiableList(List<? extends T> list)
 * 封装成不可变Set：Set<T> unmodifiableSet(Set<? extends T> set)
 * 封装成不可变Map：Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> m)
 */
public class CollectionsV3 {
    public static void main(String[] args) {
        List<String> mutable = new ArrayList<>();
        mutable.add("apple");
        mutable.add("pear");
        List<String> immutable = Collections.unmodifiableList(mutable);
        //变为不可变list后，不可以修改删除不可变list
        //immutable.add("orange");//// UnsupportedOperationException!
        //继续对原始的可变List进行增删是可以的，并且，会直接影响到封装后的“不可变”List：
        //因此，如果我们希望把一个可变List封装成不可变List，那么，返回不可变List后，最好立刻扔掉可变List的引用，这样可以保证后续操作不会意外改变原始对象，从而造成“不可变”List变化了：
        mutable.add("orange");
        System.out.println(mutable);
        System.out.println(immutable);
        //扔掉原list的引用
        mutable = null;
        System.out.println(mutable);
        System.out.println(immutable);
    }

    /*
    线程安全集合
    Collections还提供了一组方法，可以把线程不安全的集合变为线程安全的集合：

    变为线程安全的List：List<T> synchronizedList(List<T> list)
    变为线程安全的Set：Set<T> synchronizedSet(Set<T> s)
    变为线程安全的Map：Map<K,V> synchronizedMap(Map<K,V> m)
    多线程的概念我们会在后面讲。因为从Java 5开始，引入了更高效的并发集合类，所以上述这几个同步方法已经没有什么用了。*/
}
