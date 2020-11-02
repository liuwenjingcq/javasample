package com;

import javax.print.DocFlavor;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main1 {
//    public static void main(String[] args) {
//        byte[] bs = toGBK("中文");
//        System.out.println(Arrays.toString(bs));
//    }
//    static byte[] toGBK(String s){
//        //直接输出编译报错
//        //return s.getBytes("GBK");
//        //捕获异常正常
//        try{
//          return s.getBytes("GBK");
//        }catch(UnsupportedEncodingException e){
//            System.out.println(e);
//            return s.getBytes();
//        }
//    }
    //只要方法申明的checked excepiton，不在调用层捕获，也必须在更高的调用层捕获，所有未捕获的异常，最终也必须在main中捕获，不会漏写try的清
//    public static void main(String[] args) {
//        try {
//            byte[] bs = toGBK("中文");
//            System.out.println(Arrays.toString(bs));
//        } catch (UnsupportedEncodingException e) {
//            System.out.println(e);
//        }
//    }
//
//    static byte[] toGBK(String s) throws UnsupportedEncodingException {
//        // 用指定编码转换String为byte[]:
//        return s.getBytes("GBK");
//    }

    //如果是测试代码，不想写任意try，直接mian throw
    public static void main(String[] args) throws  Exception {
        byte[] bs =toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }
    static byte[] toGBK(String s) throws UnsupportedEncodingException{
        return s.getBytes("GBK");
    }
}
