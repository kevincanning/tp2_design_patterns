/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.structural.decorator;

/**
 *
 * @author Kevin Canning
 */
public class WingDecorator extends AnimalDecorator {
    public WingDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("\nI have wings!");
        fly();
    }
    
    public void fly() {
        System.out.println("I can fly!");
    }
    
    
}
