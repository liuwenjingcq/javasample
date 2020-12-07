package com.io;

import java.io.File;

public class FileStudyV5 {
    public static void main(String[] args) throws Exception {
        File targetFolder = new File("/Users/liuwenjing/liuwenjing/document");
        String indentation="";
        listDir(targetFolder.getCanonicalFile(),indentation);//传入当前路径的规范路径和空字符串
    }

    static void listDir(File dir, String indentation) {//每个目录下的二级目录需要缩进，同级目录不缩进
        File[] fs = dir.listFiles();
        if (fs != null) {
            for (File f : fs) {
                if (f.isDirectory()) {
                    System.out.println(indentation + f.getName() + "/");
                    listDir(f, indentation + "  ");
                } else {
                    System.out.println(indentation + f.getName());
                }
            }
        }
    }
}
