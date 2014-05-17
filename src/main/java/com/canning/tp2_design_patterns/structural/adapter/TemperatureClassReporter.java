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
public class TemperatureClassReporter extends CelsiusReporter implements TemperatureInfo {

    @Override
    public double getTemperatureInF() {
       return convertToF(temperatureInC);
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        this.temperatureInC = Math.round(convertToC(temperatureInF));
    }

    @Override
    public double getTemperatureInC() {
        return temperatureInC;
    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }
    
    private double convertToC(double f) {
        return ((f - 32) * 5 / 9);
    }
    
    private double convertToF(double c) {
        return ((c * 9 / 5) + 32);
    }
}
