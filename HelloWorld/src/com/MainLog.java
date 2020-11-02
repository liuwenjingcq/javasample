package com;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MainLog {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(MainLog.class);
        log.info("start...");
        log.warn("end.");
    }
}

//编译  javac -cp commons-logging-1.2.jar MainLog.java
//运行 java -cp .:commons-logging-1.2.jar MainLog.java