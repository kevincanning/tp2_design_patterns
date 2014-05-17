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
public class TemperatureObjectReporter implements TemperatureInfo {
    CelsiusReporter celsiusReporter;
    
    public TemperatureObjectReporter() {
        celsiusReporter = new CelsiusReporter();
    }

    @Override
    public double getTemperatureInF() {
        return convertToF(celsiusReporter.getTemperature());
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        celsiusReporter.setTemperature(convertToC(temperatureInF));
    }

    @Override
    public double getTemperatureInC() {
        return celsiusReporter.getTemperature(); 
    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        celsiusReporter.setTemperature(temperatureInC);
    }
    
    private double convertToC(double f) {
        return ((f - 32) * 5 / 9);
    }
    
    private double convertToF(double c) {
        return ((c * 9 / 5) + 32);
    }
    
}
