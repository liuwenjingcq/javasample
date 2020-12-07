package com.io;

import java.io.File;
//文件和目录
public class FileStudyV1 {
    public static void main(String[] args) {
        File f1 = new File("/Users/liuwenjing/IdeaProjects");
        File f2 = new File("/Users/liuwenjing/IdeaProjects/HelloWorld/src/com/io/note.exe");
        //构造一个File对象，即使传入的文件或目录不存在，代码也不会出错，因为构造一个File对象，并不会导致任何磁盘操作。只有当我们调用File对象的某些方法的时候，才真正进行磁盘操作。
        File f3 = new File("/Users/liuwenjing/IdeaProjects/notte.exe");
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.isDirectory());
        /*
        * 用File对象获取到一个文件时，还可以进一步判断文件的权限和大小：
        * boolean canRead()：是否可读；
        * boolean canWrite()：是否可写；
        * boolean canExecute()：是否可执行；
        * long length()：文件字节大小。
        * 对目录而言，是否可执行表示能否列出它包含的文件和子目录。
        * */
    }
}
