package com;

public class LearnStringBuilder {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder(1024);
//        for(int i =0;i<10;i++){
//            sb.append(',');
//            sb.append(i);
//        }
//        String s = sb.toString();
//        System.out.println(s);
        var sb = new StringBuilder(1024);
        sb.append(" Mr")
                .append(" Bob")
                .append("!")
                .insert(0, "hello,");
        System.out.println(sb.toString());
    }
}
