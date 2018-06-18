package com.demo.duck.model;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack(){
        System.out.println("...........");
    }
}