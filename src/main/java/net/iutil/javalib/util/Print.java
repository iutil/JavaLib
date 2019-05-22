package net.iutil.javalib.util;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 打印工具类
 * @author Erwin Feng
 * @since 2019-05-22 22:34
 */
public class Print {

    /** 打印开关，默认开启 */
    public static boolean DEBUG = true;

    public static void info(Object x) {
        if (DEBUG) {
            System.out.println(
                    LocalDate.now() + " " + LocalTime.now()
                            + " PRINT " + Print.class.getName()
                            + " : " + x);
        }
    }

}
