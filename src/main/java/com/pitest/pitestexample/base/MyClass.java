package com.pitest.pitestexample.base;

public class MyClass {

    private int threshold;

    public MyClass(int threshold) {
        this.threshold = threshold;
    }

    public boolean myFunction(int i){
        return i < threshold;
    }
}