package com.thinkdevos.java.dynamicproxy;

/**
 * Created by borney on 8/4/16.
 */
public class Client {

    public static void main(String[] args) {
        RealSubject real = new RealSubject();
        ProxySubject proxy = new ProxySubject(real);

        proxy.doSomething();
        proxy.doOtherthing();
    }
}
/*
ProxySubject before real doSomething
RealSubject doSomething
ProxySubject end real doSomething
ProxySubject doOtherthing
 */
