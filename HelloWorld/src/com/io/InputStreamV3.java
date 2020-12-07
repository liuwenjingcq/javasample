package com.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

//阻塞
//在调用InputStream的read()方法读取数据时，我们说read()方法是阻塞（Blocking）的。它的意思是，对于下面的代码：
/*
        int n;
        n = input.read(); // 必须等待read()方法返回才能执行下一行代码
        int m = n;
        执行到第二行代码时，必须等read()方法返回后才能继续。因为读取IO流相比执行普通代码，速度会慢很多，因此，无法确定read()方法调用到底要花费多长时间。
        用FileInputStream可以从文件获取输入流，这是InputStream常用的一个实现类。此外，ByteArrayInputStream可以在内存中模拟一个InputStream：
        ByteArrayInputStream实际上是把一个byte[]数组在内存中变成一个InputStream，虽然实际应用不多，但测试的时候，可以用它来构造一个InputStream。
 */
public class InputStreamV3 {
    public static void main(String[] args) throws IOException {
        byte[] data = {72,101,108,108,111,33};
        try(InputStream input = new ByteArrayInputStream(data)){
            int n ;
            while ((n=input.read())!=-1){
                System.out.println((char) n );
            }
        }
    }
}
