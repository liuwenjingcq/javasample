package com.map;

public class Person {
    String firstName;
    String lastName;
    int age;

    @Override
    public  int hashCode() {
        int h = 0;
        //尽量把不同的person实例的hashcode均匀分布到整个int范围
        h = 31 * h + firstName.hashCode();
        h = 31 * h + lastName.hashCode();
        h = 31 * h + age;
        return  h;
        //如果firstName或lastName为null，上述代码工作起来就会抛NullPointerException，为了解决这个问题，计算hashcode的是你，经常借助Objects.hash()来计算
        // return Objects.hash(firstName, lastName, age);
        //当a不为空的时候，hash()执行的流程是
        //a不为空 hash(）执行的是31*1+a.hashCode(); 即在a的hash值上加上31，所以输出结果是31+97=128.
        /***
         * equals()用到的用于比较的每一个字段，都必须在hashCode()用于计算；
         * equals()中没有使用到的字段，绝不可放在hashCode(）中计算
         * 对于放入hashmap的value对象，没有任何要求
         *
         * 问题：hashmap内部使用数组，如果hashcode返回的你超多+-21亿，hashmao内部使用的数组得有多大？
         * 实际上hashmap默认数组大小16，任何key不管hashcode多大，都可以通过
         * int index = key.hashCode() & 0xf；//oxf=15// 把索引确定在0-15，不会超出数组范围
         * 问题：如果添加超过16个key-value到hashmap数组不够用怎么办，hashmap自动扩容，16的倍数；需要重新确定hashcode计算索引位置
         * 因为扩容会重新分配已有的key-value，频繁扩容对hashmap性能影响很大，最好是创建的时候指定容量
         * Map<String, Integer> map = new HashMap<>(10000);
         * 虽然指定容量是10000，但HashMap内部的数组长度总是2n，因此，实际数组长度被初始化为比10000大的16384（214）。
         * 问题：如果不同的两个key 例如"a"和"b"，它们的hashCode()恰好是相同的，相同的数组索引，
         * 那么hashmap的数组中实际存储的不是一个person实例，而是一个list，包含两个entry，一个是a的映射，一个是b的映射
         * person p =map.get("a")
         * HashMap内部通过"a"找到的实际是List<Entry<String, Person>>，还需要遍历这个list，并找到一个entry，他的key是字段"a"，才能返回person实例
         * 把不同的key具有相同的hashcode()的情况称为哈希冲突
         * 在冲突的时候就是用list存储hashcode相同的key-value，冲突的概率越大，list越长，map.get()的效率越低
         * 答：map 只要key不同，映射的value就无不干扰；
         */


        /**
         * 要正确使用HashMap，作为key的类必须正确覆写equals()和hashCode()方法；
         * 一个类如果覆写了equals()，就必须覆写hashCode()，并且覆写规则是：
         * 如果equals()返回true，则hashCode()返回值必须相等；
         * 如果equals()返回false，则hashCode()返回值尽量不要相等。
         * 实现hashCode()方法可以通过Objects.hashCode()辅助方法实现。
         */
    }
}
