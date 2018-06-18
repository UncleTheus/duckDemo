package com.demo.duck.model;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
        }

        @Override
        public void display(){
        System.out.println("我是绿头鸭！");
        }
}
