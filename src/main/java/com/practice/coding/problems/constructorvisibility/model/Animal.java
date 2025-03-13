package com.practice.coding.problems.constructorvisibility.model;

public class Animal {

    protected Animal() {
        System.out.println("Animal created");
    }

    Animal(String msg) {
        System.out.println("Package protected: " + msg);
    }
}
