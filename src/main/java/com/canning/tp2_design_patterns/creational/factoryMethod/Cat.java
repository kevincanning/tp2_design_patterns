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
public class Cat extends Animal {
   
    public static Cat cat;
    
    public static Cat getInstance(){
        if(cat == null){
            cat = new Cat();
        }
        return cat;
    }
    @Override
    public String makeSound(){
        return "Meow";
    }
}
