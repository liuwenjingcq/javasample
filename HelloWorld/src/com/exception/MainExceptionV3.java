package com.exception;

public class MainExceptionV3 {
    //第一行打印了catched，说明进入了catch语句块。第二行打印了finally，说明执行了finally语句块。
    //在catch中抛出异常，不会影响finally的执行。JVM会先执行finally，然后抛出异常。

//    public static void main(String[] args) {
//        try {
//            Integer.parseInt("abc");
//        }catch (Exception e){
//            System.out.println("catched");
//            throw new RuntimeException(e);
//        }finally {
//            System.out.println("finally");
//        }
//    }
    //被屏蔽的异常
    //finally抛出异常后，原来在catch中准备抛出的异常就“消失”了，因为只能抛出一个异常。没有被抛出的异常称为“被屏蔽”的异常（Suppressed Exception）。
   /* public static void main(String[] args) {
        try {
            Integer.parseInt("abc");
        } catch (Exception e) {
            System.out.println("catched");
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally");
            throw new IllegalArgumentException();
        }
    }*/

    //极少数情况，需要获知所有异常；
    //如何保存所有的异常信息？方法是先用origin变量保存原始异常，然后调用Throwable.addSuppressed()，把原始异常添加进来，最后在finally抛出：
    public static void main(String[] args) throws Exception {
        Exception origin = null;
        try {
            System.out.println(Integer.parseInt("abc"));
        } catch (Exception e) {
            origin = e;
            throw e;
        } finally {
            //Throwable.getSuppressed() 可以获取所有的Suppressed exception
            //大多数，不用抛出异常，不关心Suppressed exception
            Exception e = new IllegalArgumentException();
            if (origin != null) {
                e.addSuppressed(origin);
            }
            throw e;
        }

    }
}
