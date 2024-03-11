package com.driver;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        A objA = new B();
        System.out.println("Calling method from object of class A: " + objA.meth());
        B objB = new B();
        System.out.println("Calling overridden method from object of class B: " + objB.meth());
    }
}
