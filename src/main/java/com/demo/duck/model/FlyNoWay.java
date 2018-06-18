package com.demo.duck.model;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("FlyNoWay Complete.");
    }
}
