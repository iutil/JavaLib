package net.iutil.javalib.time;

import net.iutil.javalib.util.Print;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Erwin Feng
 * @since 2019-05-22 22:51
 */
public class Format {

    @Test
    public void test() {
        Print.DEBUG = true;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY MM dd");
        Print.info(formatter.format(LocalDate.now()));
    }

}
