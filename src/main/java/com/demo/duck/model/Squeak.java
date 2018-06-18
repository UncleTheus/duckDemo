package com.demo.duck.model;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("吱吱叫！");
    }
}
