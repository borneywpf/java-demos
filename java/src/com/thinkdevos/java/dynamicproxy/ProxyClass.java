package com.thinkdevos.java.dynamicproxy;

/**
 * Created by borney on 8/5/16.
 */
public class ProxyClass {
    public static void main(String[] args) {
        ProxyUtils.saveProxyClass("/home/borney/tmp/Proxy$0.class", "Proxy$0",
            new Class<?>[]{Subject.class});
    }
}
