package com;

import java.util.logging.Logger;

public class MainAssert {
    //尽快减少用assert,更多用单元测试
//    public static void main(String[] args) {
//        double x = Math.abs(-123.45);
//        double y = -123.45;
//        assert y >=0 : "x must >=0;";
//        System.out.println(x);
//    }
    public static void main(String[] args) {
        Logger logger =Logger.getGlobal();
        logger.info("start process ...");
        logger.warning("memory is running out ...");
        logger.fine("ingored");
        logger.severe("process will be terminated");
    }

}
