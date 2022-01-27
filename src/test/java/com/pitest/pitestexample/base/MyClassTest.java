package com.pitest.pitestexample.base;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;

class MyClassTest {

    private MyClass myClass;
    private Logger logger = (Logger) LoggerFactory.getLogger(MyClassTest.class);

    @BeforeEach
    void setUp() {
        myClass = new MyClass(5);
    }

    @Test
    public void ShouldPassWhenValueIsOne() {
        myClass.myFunction(1);
        logger.info("Executing ShouldPassWhenValueIsOne");
    }

    @Test
    public void ShouldNotPassWhenValueIsTen() {
        myClass.myFunction(10);
        logger.info("Executing ShouldNotPassWhenValueIsTen");
    }

//    @Test
//    public void _ShouldPassWhenValueIsOne() {
//        boolean res = myClass.myFunction(1);
//        assertEquals(res, true);
//    }
//
//    @Test
//    public void _ShouldNotPassWhenValueIsTen() {
//        boolean res = myClass.myFunction(10);
//        assertEquals(res, false);
//    }

//    @Test
//    public void _ShouldNotPassWhenValueIsFive() {
//        boolean res = myClass.myFunction(5);
//        assertEquals(res, false);
//    }
}