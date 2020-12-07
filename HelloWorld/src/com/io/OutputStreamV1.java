package com.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
* OutputStream也是抽象类，它是所有输出流的超类。这个抽象类定义的一个最重要的方法就是void write(int b)，签名如下：
   public abstract void write(int b) throws IOException;
   InputStream类似，OutputStream也提供了close()方法关闭输出流，以便释放系统资源。要特别注意：OutputStream还提供了一个flush()方法，它的目的是将缓冲区的内容真正输出到目的地。
   为什么要有flush()？因为向磁盘、网络写入数据的时候，出于效率的考虑，操作系统并不是输出一个字节就立刻写入到文件或者发送到网络，
   而是把输出的字节先放到内存的一个缓冲区里（本质上就是一个byte[]数组），等到缓冲区写满了，再一次性写入文件或者网络。对于很多IO设备来说，一次写一个字节和一次写1000个字节，花费的时间几乎是完全一样的，
   所以OutputStream有个flush()方法，能强制把缓冲区内容输出。
   通常情况下，我们不需要调用这个flush()方法，因为缓冲区写满了OutputStream会自动调用它，并且，在调用close()方法关闭OutputStream之前，也会自动调用flush()方法
   *
* */
public class OutputStreamV1 {
    //每次写入一个字节
    public void writeFile() throws IOException{
        OutputStream output = new FileOutputStream("out/readme.txt");
        output.write(72);// H
        output.write(101);// e
        output.write(108);// l
        output.write(108);// l
        output.write(111);//o
        output.close();
    }
    public void writeFilev1() throws IOException{
        try(OutputStream outputStream = new FileOutputStream("out/readme.txt")){
            outputStream.write("hello".getBytes("UTF-8"));//Hello
        }//编译器在此自动为我们写入finally并调用close
    }


}
