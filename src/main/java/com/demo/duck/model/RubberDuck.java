package com.demo.duck.model;

public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehavior=new Squeak();
        flyBehavior=new FlyNoWay();
    }

    @Override
    public void display(){
        System.out.println("我是塑料鸭！");

    }
}
