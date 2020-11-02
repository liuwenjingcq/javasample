package com;
//新的异常持有原始的exception信息
// Caused by: Xxx，说明捕获的IllegalArgumentException并不是造成问题的根源，根源在于NullPointerException，
// 是在Main.process2()方法抛出的。
//在代码获取原始异常可以使用，Throwable.getCause()方法。如果返回null，说明已经是“根异常”了。
public class MainExceptionV2 {
    public static void main(String[] args) {
        try{
            process1();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    static void process1(){
        try{
            process2();
        }catch (NullPointerException e){
            //throw new IllegalArgumentException(e)持有原始异常e的信息
            //捕获异常再次抛出时，一定要留住原始异常，否则很难定位第一案发现场
            throw new IllegalArgumentException(e);
        }
    }
    static void process2(){
        throw  new NullPointerException();
    }
}
