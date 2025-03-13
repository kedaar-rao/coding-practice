package com.practice.coding.problems.constructorvisibility.app;

import com.practice.coding.problems.constructorvisibility.model.Animal;

public class Dog extends Animal {
    public Dog() {
        super(); // this is allowed even though Animal's constructor has protected access modifier
    }
}
