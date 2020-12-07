package com.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/*OutputStream的write()方法也是阻塞的

* */
public class OutputStreamV2 {
    public static void main(String[] args) throws IOException {
        byte[] data;
        try(ByteArrayOutputStream output = new ByteArrayOutputStream()){
            output.write("Hello ".getBytes("UTF-8"));
            output.write("world!".getBytes("UTF-8"));
            data = output.toByteArray();
        }
        System.out.println(new String(data,"UTF-8"));
    }
    /*同时操作多个AutoCloseable资源时，在try(resource) { ... }语句中可以同时写出多个资源，用;隔开。例如，同时读写两个文件：
    // 读取input.txt，写入output.txt:
    try (InputStream input = new FileInputStream("input.txt");
     OutputStream output = new FileOutputStream("output.txt"))
    {
    input.transferTo(output); // transferTo的作用是?
    }
    * */





}
