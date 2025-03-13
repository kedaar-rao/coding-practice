package com.practice.coding.problems.constructorvisibility;

import com.practice.coding.problems.constructorvisibility.app.Dog;
import com.practice.coding.problems.constructorvisibility.model.Animal;
import com.practice.coding.problems.constructorvisibility.model.Cat;

public class ConstructorVisibilityMain {
    public static void main(String[] args) {
        Animal dogAnimal = new Dog(); // calls the protected constructor of Animal class
        Animal catAnimal = new Cat(); // calls the default (package-private) constructor of Animal class.
    }
}
