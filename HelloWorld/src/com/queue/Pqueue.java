package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * priorityQueue vip会员；必须给每个元素定义优先级
 */
public class Pqueue {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        System.out.println(q.poll());//apple
        System.out.println(q.poll());//banana
        System.out.println(q.poll());//pear
        System.out.println(q.poll());//null
        //输入顺序和输出顺序不一致；输出是字符排序；所以放入priorityqueue，必须要实现comparable
    }
}
