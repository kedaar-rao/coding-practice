package com.practice.coding.problems.polymorphismillusion;

class A {
    private void print(String msg) {
        System.out.println("A: " + msg);
    }

    public void call() {
        print("called from A");
    }
}
