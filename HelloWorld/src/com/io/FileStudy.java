package com.io;

import javax.sound.midi.Soundbank;
import java.io.File;
//file对象
public class FileStudy {
    public static void main(String[] args) throws Exception{
        //file windows\\ 表示；linux 用/作为路径分隔符
        //绝对路径和相对路径； .当前目录；..上级目录；
        //file对象有3种形式表示的路径；
        //  getpath()返回构造方法传入的路径；
        //  一种是getAbsolutePath()，返回绝对路径，
        //  一种是getCanonicalPath，它和绝对路径类似，但是返回的是规范路径。
        File f = new File ("note.exe");
        System.out.println(f);
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalPath());
        System.out.println(f.separator);//根据当前平台打印\ /
    }
}
