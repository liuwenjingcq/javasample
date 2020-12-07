package com.io;

import com.fanxing.Pair;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

//path对象
public class FileStudyV4 {
    public static void main(String[] args) {
        Path path = Paths.get(".", "project", "study");//构造一个path对象
        System.out.println(path);
        Path path2 = path.toAbsolutePath();//转换为绝对路径
        System.out.println(path2);
        Path path3 = path2.normalize();//转换为规范路径
        System.out.println(path3);
        File file = path3.toFile();//转换为file对象
        System.out.println(file);
        for (Path p : Paths.get("...").toAbsolutePath()) {//遍历path
            System.out.println(" " + p);
        }
    }
}
