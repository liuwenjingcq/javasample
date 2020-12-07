package com.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//InputStream就是Java标准库提供的最基本的输入流。它位于java.io这个包里。java.io包提供了所有同步IO的功能。
//InputStream并不是一个接口，而是一个抽象类，它是所有输入流的超类。这个抽象类定义的一个最重要的方法就是int read()
//FileInputStream是InputStream的一个子类。顾名思义，FileInputStream就是从文件流中读取数据
//类似文件、网络端口这些资源，都是由操作系统统一管理的。应用程序在运行的过程中，如果打开了一个文件进行读写，完成后要及时地关闭，以便让操作系统把资源释放掉，否则，应用程序占用的资源会越来越多，不但白白占用内存，还会影响其他应用程序的运行。
//InputStream和OutputStream都是通过close()方法来关闭流。关闭流就会释放对应的底层资源
public class InputStreamV1 {
    public void readFile() throws IOException{
        InputStream input = null;
        //try ... finally
        try{
            input = new FileInputStream("src/readme.txt");
            int n ;
            while ((n = input.read()) !=-1){
                System.out.println(n);
            }
        }finally {
            if(input != null){
                input.close();
            }
        }
    }
    //Java 7引入的新的try(resource)的语法，只需要编写try语句，让编译器自动为我们关闭资源
    //编译器不会特别为inputstream加上自动关闭，编译器只看try（resource= ...)中对象是否实现了java.lang.sutocloseable接口，如果
    //实现了就自动加上finalky 语句并调用close方法；
    //InputStream和OutputStream都实现了这个接口，因此，都可以用在try(resource)中。
    public void readFilev1() throws IOException{
        try (InputStream inputStream = new FileInputStream("src/readme.txt")){
            int n ;
            while ((n = inputStream.read())!= -1){
                System.out.println(n);
            }
        }//编译器在此自动为我们写入finally并调用close
    }
}
