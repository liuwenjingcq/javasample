package com.exception;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class MainException {
    public static void main(String[] args) {
        try {
            process1();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void process1() {
        process2();
    }
    private static void process2(){
        Integer.parseInt(null);
    }

    private static void process2(String s) {
        if(s==null){
            //用户输入非法的字符，抛出异常；创建某个excepiton实例，用thorw抛出
            NullPointerException e = new NullPointerException();
            throw e;
            //上面两句合并为一行
            //throw new NullPointerException();
        }
    }

    private static void process3() {
    }

}
