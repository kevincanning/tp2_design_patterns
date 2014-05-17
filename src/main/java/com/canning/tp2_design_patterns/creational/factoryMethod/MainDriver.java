/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.creational.factoryMethod;

/**
 *
 * @author Kevin Canning
 */
public class MainDriver {
    public static void main(String[] args) {
        Cat cat = Cat.getInstance();
        Dog dog = Dog.getInstance();
        
        String animal1 = cat.makeSound();
        String animal2 = dog.makeSound();
        
        System.out.println("Cat: " + animal1);
        System.out.println("Dog: " + animal2);
        

    }
}
