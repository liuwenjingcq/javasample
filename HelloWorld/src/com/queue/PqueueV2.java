package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PqueueV2 {
    public static void main(String[] args) {
        //UserComparator A10 会早于A2
        //Queue<User> q = new PriorityQueue<>(new UserComparator());
        //UserComparatorV2 比较过长度，所以A2在A10前面
        Queue<User> q = new PriorityQueue<>(new UserComparatorV2());
        q.offer(new User("Bob","A10"));
        q.offer(new User("Alice","A2"));
        q.offer(new User("Boss","V1"));
        System.out.println(q.poll());//Boss/V1
        System.out.println(q.poll());//Bob/A1
        System.out.println(q.poll());//Alice/A2
        System.out.println(q.poll());//null
    }
}
