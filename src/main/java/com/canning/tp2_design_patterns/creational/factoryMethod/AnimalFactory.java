/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.creational.factoryMethod;

/**
 *
 * @author Kevin
 */
public class AnimalFactory {
    public static AnimalFactory animalFactory;
    
    public static AnimalFactory getInstance(){
        if(animalFactory == null){
            animalFactory = new AnimalFactory();
        }
        return animalFactory;
    }
     
        public String sayHello(){
            return "Hello";
        }
}
