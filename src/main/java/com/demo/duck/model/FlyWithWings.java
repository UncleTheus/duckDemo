package com.demo.duck.model;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("FlyWithWings Complete.");
    }

}
