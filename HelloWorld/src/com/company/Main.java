package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student student = new Student();
        student.setName("zhangsan");
        System.out.println(student.hello());
        PersonV2 personV2 = new PersonV2();
        personV2.setName("第三类动物");
        System.out.println(personV2.hello());
    }
}
