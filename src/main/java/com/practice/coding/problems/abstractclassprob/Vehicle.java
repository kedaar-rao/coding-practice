package com.practice.coding.problems.abstractclassprob;

public abstract class Vehicle {
    int speed;

    Vehicle() {
        speed = setSpeed(); // Dangerous practice
    }

    abstract int setSpeed();
}
