package net.iutil.javalib.time;

import org.junit.Test;

import java.time.LocalDate;

/**
 * @author Erwin Feng
 * @since 2019-05-22 22:28
 */
public class Java8Date {

    // 获取今天的日期
    @Test
    public void simple() {
        // 获取今天的日期
        LocalDate dayDate = LocalDate.now();
        System.out.println(dayDate); // 2019-05-22
    }

}
