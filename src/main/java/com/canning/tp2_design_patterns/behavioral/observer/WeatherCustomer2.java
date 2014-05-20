package com.canning.tp2_design_patterns.behavioral.observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Canning
 */
public class WeatherCustomer2 implements WeatherObserver {
   @Override 
   public void doUpdate(int temperature) { 
       System.out.println("Weather customer 2 just found out the temperature is: " + temperature); 
   } 
}
