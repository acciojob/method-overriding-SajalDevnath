package com.driver.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.driver.A;
import com.driver.B;

public class TestCases {

    @Test
    public void testMethodFromA() {
        A objA = new A();
        assertEquals("Invoking method from class A", objA.meth());
    }

    @Test
    public void testOverriddenMethodFromB() {
        B objB = new B();
        assertEquals("Method is overridden in Extended class B", objB.meth());
    }

    @Test
    public void testMethodFromAUsingBObject() {
        A objA = new B(); // Polymorphism
        assertEquals("Method is overridden in Extended class B", objA.meth());
    }
}

