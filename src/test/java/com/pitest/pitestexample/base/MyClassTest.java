package com.pitest.pitestexample.base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyClassTest {

    private MyClass myClass;

    @BeforeEach
    void setUp() {
        myClass = new MyClass(5);
    }

    @Test
    public void ShouldPassWhenValueIsOne() {
        myClass.myFunction(1);
    }

    @Test
    public void ShouldNotPassWhenValueIsTen() {
        myClass.myFunction(10);
    }

    @Test
    public void _ShouldPassWhenValueIsOne() {
        boolean res = myClass.myFunction(1);
        assertEquals(res, true);
    }

    @Test
    public void _ShouldNotPassWhenValueIsTen() {
        boolean res = myClass.myFunction(10);
        assertEquals(res, false);
    }

//    @Test
//    public void _ShouldNotPassWhenValueIsFive() {
//        boolean res = myClass.myFunction(5);
//        assertEquals(res, false);
//    }
}