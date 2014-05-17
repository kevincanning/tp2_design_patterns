/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.structural.adapter;

/**
 *
 * @author Kevin Canning
 */
public class CelsiusReporter {
    double temperatureInC;
    
    public CelsiusReporter() {}
    
    public double getTemperature() {
        return temperatureInC;
    }
    
    public void setTemperature(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }
}
