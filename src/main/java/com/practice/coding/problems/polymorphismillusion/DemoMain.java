package com.practice.coding.problems.polymorphismillusion;

public class DemoMain {
    public static void main(String[] args) {
        A obj = new B();
        obj.call(); // prints: "A: called from A"
        B obj2 = new B();
        obj2.call(); // still prints: "A: called from A" because A.call() is called and it still calls A's private print() method.
    }
}
