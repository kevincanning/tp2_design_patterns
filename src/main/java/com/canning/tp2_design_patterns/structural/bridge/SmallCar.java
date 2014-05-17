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
public class SmallCar extends Vehicle {
        public SmallCar(Engine engine) {
        this.weightInKilos = 600;
        this.engine = engine;
    }
    
    @Override
    public void drive() {
        System.out.println("\nThe Small Car is driving!");
        int horsePower = engine.go();
        reportOnSpeed(horsePower);
    }
}
