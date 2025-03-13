package com.practice.coding.problems.protectedoverride;

public class Child extends Parent {
    protected int value = 20; // Value of Parent was set to 10.

    void printValues() {
        System.out.println("Child value: " + value);
        System.out.println("Parent value: " + super.value);
    }

    @Override
    protected void displayMessage () {
        System.out.println("Message from Child");
    }
}
