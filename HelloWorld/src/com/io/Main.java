package com.io;

public class Main {
    public static void main(String[] args) {
        /**
         * io 就是 外部-》内存-》外部
         * 单向流动
         * IO流以byte（字节）为最小单位，因此也称为字节流
         * 在Java中，InputStream代表输入字节流，OuputStream代表输出字节流，这是最基本的两种IO流。
         * 如果要读写的是字符，并且字符不全是单字节表示的ascii字符，按照char读写更方便，成为字节流
         * Reader和Writer表示字符流，字符流传输的最小数据单位是char
         */
        /**
         * 同步和异步
         * 同步IO是指，读写IO时代码必须等待数据返回后才继续执行后续代码，它的优点是代码编写简单，缺点是CPU执行效率低。
         * 而异步IO是指，读写IO时仅发出请求，然后立刻执行后续代码，它的优点是CPU执行效率高，缺点是代码编写复杂。
         * Java标准库的包java.io提供了同步IO，而java.nio则是异步IO。上面我们讨论的InputStream、OutputStream、Reader和Writer都是同步IO的抽象类，对应的具体实现类，以文件为例，有FileInputStream、FileOutputStream、FileReader和FileWriter。
         * Java的同步IO，即输入/输出流的IO模型。
         */
    }
}
