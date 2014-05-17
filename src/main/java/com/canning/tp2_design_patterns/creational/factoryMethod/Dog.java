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
public class Dog extends Animal {
    public static Dog dog;
    
    public static Dog getInstance(){
        if(dog == null){
            dog = new Dog();
        }
        return dog;
    }
    
    @Override
    public String makeSound(){
        return "Woof";
    }
}
