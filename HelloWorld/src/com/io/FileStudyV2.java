package com.io;

import java.io.File;

//创建和删除
public class FileStudyV2 {
    public static void main(String[] args) throws Exception{
        File file = File.createTempFile("tmp-",".txt");
        System.out.println(file.isFile());
        file.deleteOnExit();//jvm退出时自动删除
        System.out.println(file.isFile());
        System.out.println(file.getAbsolutePath());
    }
}
