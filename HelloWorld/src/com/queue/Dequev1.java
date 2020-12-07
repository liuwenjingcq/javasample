package com.queue;

import java.util.Deque;
import java.util.LinkedList;

//允许两头都进，两头都出的队列，较多双端队列 Double Ended Queue
//可以添加到队尾，也可以添加到队首
//可以从队首获取，又可以从队尾获取
public class Dequev1 {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("A");
        deque.addFirst("B");
        deque.offerFirst("c");
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
    }
}
