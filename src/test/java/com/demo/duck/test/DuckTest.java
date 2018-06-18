package com.demo.duck.test;


import com.demo.duck.model.Duck;

import com.demo.duck.model.MallardDuck;
import com.demo.duck.model.RedheadDuck;
import com.demo.duck.model.RubberDuck;


public class DuckTest {

    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck redhead = new RedheadDuck();
        redhead.performFly();
        redhead.performQuack();

        Duck rubber = new RubberDuck();
        rubber.performFly();
        rubber.performQuack();

    }

}
