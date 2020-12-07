package com.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * queue队列，先进先出
 * 只能把元素添加在队列末尾；
 * 只能从队列头部取出元素
 *
 * java标准库队列接口queue定义几个方法
 * int size()
 * boolean add(E) /boolean offer(E) 添加元素到队尾；添加超出长度 add 返回异常；offer返回false
 * E remove()/E poll() 获取队首元素并从队列中删除； remove返回异常； poll返回null
 * E element()/E peek() 获取队首元素但不删除； element返回异常； peek 返回false/null
 */
public class QueueV1 {
    public static void main(String[] args) {
        Queue<String> q  = new LinkedList<>();
        //添加3个元素到队列
        q.offer("apple");
        q.offer("pear");
        q.offer("banan");
        //队首永远是apple，因为peek不会删除
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek());
        //从队列获取元素
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());//因为队列是空的

    }
}
