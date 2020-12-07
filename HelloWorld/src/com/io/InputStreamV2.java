package com.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//缓冲
//读取流的时候一次读取一个字节肯定不是最搞笑的，很多支持一次性读取多个字节；对于网络和文件来说，利用缓冲区可以一次性读取多个，效率很高；
//inputstrean提供了两个重载方法来支持读取多个字符
//int read(byte[] b)：读取若干字节并填充到byte[]数组，返回读取的字节数
//int read(byte[] b, int off, int len)：指定byte[]数组的偏移量和最大填充数
//利用上述方法一次读取多个字节时，需要先定义一个byte[]数组作为缓冲区，
// read()方法会尽可能多地读取字节到缓冲区， 但不会超过缓冲区的大小。read()方法的返回值不再是字节的int值，而是返回实际读取了多少个字节。如果返回-1，表示没有更多的数据了。
public class InputStreamV2 {
    public void readFile() throws IOException {
        try (InputStream input = new FileInputStream("src/readme.txt")) {
            byte[] buffer = new byte[1000];
            int n;
            while ((n = input.read(buffer)) != -1) {
                System.out.println("read" + n + "byte");
            }
        }
    }
}
