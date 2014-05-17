/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.structural.bridge;

/**
 *
 * @author Kevin Canning
 */
public abstract class Vehicle {
    Engine engine;
    int weightInKilos;
    
    public abstract void drive();
    
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    public void reportOnSpeed(int horsePower) {
        int ratio = weightInKilos / horsePower;
        
        if(ratio < 3) {
            System.out.println("This vehicle is going at a fast speed!");
        } else if((ratio >= 3) && (ratio < 8)) {
            System.out.println("This vehicle is going at an average speed!");
        } else {
            System.out.println("This vehicle is going at a slow speed!");
        }
    }
}
