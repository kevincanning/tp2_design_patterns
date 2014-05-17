/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.structural.composite;

/**
 *
 * @author Kevin
 */
public class Leaf implements Component {
    String name;
    
    public Leaf(String name) {
        this.name = name;
    }
    
    @Override
    public void sayHello() {
        System.out.println(name + " leaf say Hello!");
    }
    
    @Override
    public void sayGoodBye() {
        System.out.println(name + " leaf says GoodBye.");
    }
}
