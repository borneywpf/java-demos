package com.thinkdevos.java.dynamicproxy;

import static com.thinkdevos.java.utils.Print.*;

/**
 * Created by borney on 8/4/16.
 */
public class ProxySubject implements Subject {
    private Subject real;

    public ProxySubject(Subject real) {
        this.real = real;
    }

    @Override
    public void doSomething() {
        println("ProxySubject before real doSomething");
        real.doSomething();
        println("ProxySubject end real doSomething");
    }

    public void doOtherthing() {
        println("ProxySubject doOtherthing");
    }
}
