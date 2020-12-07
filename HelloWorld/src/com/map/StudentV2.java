package com.map;

public class StudentV2 {
    public  String name;
    public int score;
    StudentV2(String name,int score){
        this.name=name;
        this.score=score;
    }
    public String toString(){
        return String.format("{%s:score=%d}",name,score);
    }
}
