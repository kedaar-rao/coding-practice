package com.practice.coding.problems.abstractclassprob;

public class HighwayMain {

    /**
     * Problem Explanation: What happens here:
     * First, the Vehicle constructor executes.
     * Vehicle constructor: speed = setSpeed(); -> this calls Car.setSpeed()
     * But the Car.speed is still 0 because its constructor is not run yet. So speed = 0.
     * After that, the Car constructor runs. But it sets Car.speed = 100, which is not Vehicle.speed.
     * It gets shadowed. So final output is Speed: 0.
    **/
    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println("Speed: " + v.speed);
    }
}
