/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.creational.abstractFactory;

/**
 *
 * @author Kevin
 */
public class MainDriver {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();
        
        SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");
        Animal animal1 = speciesFactory1.getAnimal("tyrannosaurus ");
        System.out.println("Animal1 sound is: " + animal1.makeSound());
        Animal animal2 = speciesFactory1.getAnimal("snake");
        System.out.println("Animal2 sound is: " + animal2.makeSound());
        
        SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");
        Animal animal3 = speciesFactory2.getAnimal("dog");
        System.out.println("Animal3 sound is: " + animal3.makeSound());
        Animal animal4 = speciesFactory2.getAnimal("cat");
        System.out.println("Animal4 sound is: " + animal4.makeSound());      
    }
}
