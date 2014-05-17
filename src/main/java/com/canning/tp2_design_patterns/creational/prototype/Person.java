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
public class Person implements Prototype {

    String name;
    public Person(String name) {
        this.name = name;
    }
    
    @Override
    public Prototype doClone() {
        return new Person(name);
    } 

    @Override
    public String toString() {
        return "This person is named " + name;
    }
}
