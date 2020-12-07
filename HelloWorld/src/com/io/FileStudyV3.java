package com.io;

import java.io.File;
import java.io.FilenameFilter;

//遍历文件和目录
//当File对象表示一个目录时，可以使用list()和listFiles()列出目录下的文件和子目录名。
// listFiles()提供了一系列重载方法，可以过滤不想要的文件和目录：
public class FileStudyV3 {
    public static void main(String[] args) {
        File f = new File("/Users/liuwenjing/IdeaProjects/HelloWorld/src/com/io");
        File[] fs1 = f.listFiles();//列出所有文件和子目录
        printFiles(fs1);
        File[] fs2 = f.listFiles(new FilenameFilter() {//仅列出.exe文件
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".exe");//返回true 表示接受该文件
            }
        });
        printFiles(fs2);
    }
    static void printFiles(File[] files){
        System.out.println("==============");
        if(files != null){
            for(File f :files){
                System.out.println(f);
            }
        }
        System.out.println("==============");
    }
    /*File对象如果表示一个目录，可以通过以下方法创建和删除目录：
    boolean mkdir()：创建当前File对象表示的目录；
    boolean mkdirs()：创建当前File对象表示的目录，并在必要时将不存在的父目录也创建出来；
    boolean delete()：删除当前File对象表示的目录，当前目录必须为空才能删除成功。*/
}
