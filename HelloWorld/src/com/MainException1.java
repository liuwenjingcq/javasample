package com;

import javax.print.attribute.standard.MediaSize;
//新的异常丢失了原始异常信息，看不到原始异常NullPointerException的信息了，改成v2
public class MainException1 {
    public static void main(String[] args) {
        try{
            process1();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    static void process1(){
        try{
            process2();
        }catch (NullPointerException e){
            throw new IllegalArgumentException();
        }
    }
    static void process2(){
        throw  new NullPointerException();
    }
}
