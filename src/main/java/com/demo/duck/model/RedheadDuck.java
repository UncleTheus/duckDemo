package com.demo.duck.model;

public class RedheadDuck extends Duck{

    public RedheadDuck(){
        quackBehavior=new MuteQuack();
        flyBehavior=new FlyWithRocket();
    }

    @Override
    public void display(){
        System.out.println("我是火箭鸭！");
    }



}
