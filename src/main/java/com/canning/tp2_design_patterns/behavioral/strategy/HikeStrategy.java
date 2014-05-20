/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.behavioral.strategy;

/**
 *
 * @author Kevin
 */
public class HikeStrategy implements Strategy {
    @Override 
    public boolean checkTemperature(int temperatureInF) { 
        if((temperatureInF >= 50) && (temperatureInF <= 90) ){ 
            return true; 
        } else { 
            return false;
        } 
    }
}
