package com.practice.coding.problems.abstractclassprob;

public class Car extends Vehicle {
    int speed;

    Car() {
        this.speed = 100;
    }

    @Override
    int setSpeed() {
        return speed;
    }
}
