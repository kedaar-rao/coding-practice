package com.practice.coding.problems.protectedoverride;

public class TestMain {

    /**
     * Key concept to learn: Unlike methods, fields are not polymorphic in Java.
     * Think of methods like dynamic behavior (runtime) and fields like static structure (compile time).
     *
     */
    public static void main(String[] args) {
        Parent p = new Child();
        new Child().printValues();
//        p.printValues(); // compiler error because p doesn't have the printValues() method because p is of type Parent.
        p.displayMessage(); // even though p is of Parent type, its displayMessage() method is overridden by the Child.
    }
}
