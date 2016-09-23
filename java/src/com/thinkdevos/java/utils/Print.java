package com.thinkdevos.java.utils;

/**
 * Created by borney on 8/4/16.
 */
public final class Print {
    public static void println(String msg) {
        System.out.println(msg);
    }

    public static void print(String msg) {
        System.out.print(msg);
    }

    public static void println(String format, Object... args) {
        System.out.println(String.format(format, args));
    }

    public static void println(Throwable ex) {

    }
}
