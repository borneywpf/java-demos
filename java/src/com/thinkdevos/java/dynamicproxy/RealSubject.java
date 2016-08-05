package com.thinkdevos.java.dynamicproxy;

import static com.thinkdevos.java.utils.Print.*;

/**
 * Created by borney on 8/4/16.
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        println("RealSubject doSomething");
    }
}
