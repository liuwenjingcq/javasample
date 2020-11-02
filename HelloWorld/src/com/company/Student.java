package com.company;

public class Student  extends  PersonV2{
    private int score;
    public int getScore(){
        return  score;
    }
    public void setScore(int score){
        this.score=score;
    }
    @Override
    public String hello() {
        // 调用父类的hello()方法:
        return super.hello() + "!";
    }
    @Override
    public void  run(){

    }
}

