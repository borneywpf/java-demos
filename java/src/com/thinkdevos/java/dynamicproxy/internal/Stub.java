package com.thinkdevos.java.dynamicproxy.internal;
import com.thinkdevos.java.dynamicproxy.Subject;

import static com.thinkdevos.java.utils.Print.*;

/**
 * Created by borney on 8/4/16.
 */
public class Stub implements Subject {
    @Override
    public void doSomething() {
        println("Stub doSomething");
    }
}
