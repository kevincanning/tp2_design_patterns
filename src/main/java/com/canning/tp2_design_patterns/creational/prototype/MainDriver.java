/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.creational.prototype;

/**
 *
 * @author Kevin Canning
 */
public class MainDriver {
    public static void main(String[] args) {
        Person person1 = new Person("Kevin");
        System.out.println("Person1: " + person1);
        Person person2 = (Person) person1.doClone();
        System.out.println("Person2: " + person2);
        
        Dog dog1 = new Dog("Woof");
        System.out.println("Dog1: " + dog1);
        Dog dog2 = (Dog) dog1.doClone();
        System.out.println("Dog2: " + dog2);
    }
}
