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
public class MainDriver {
    public static void main(String[] args) {
        System.out.println("Class Adapter Test");
        TemperatureInfo temperatureInfo = new TemperatureClassReporter();
        testTemperatureInfo(temperatureInfo);
        
        System.out.println("\nObject Adapter Test");
        temperatureInfo = new TemperatureClassReporter();
        testTemperatureInfo(temperatureInfo);
    }
    
    public static void testTemperatureInfo(TemperatureInfo temperatureInfo) {
        temperatureInfo.setTemperatureInC(0);
        System.out.println("Temperature In C: " + temperatureInfo.getTemperatureInC());
        System.out.println("Temperature In F: " + temperatureInfo.getTemperatureInF());
        
        temperatureInfo.setTemperatureInF(85);
        System.out.println("Temperature In C: " + temperatureInfo.getTemperatureInC());
        System.out.println("Temperature In F: " + temperatureInfo.getTemperatureInF());
    }
}
