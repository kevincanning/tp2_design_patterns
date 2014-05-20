/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.behavioral.chainOfResponsibility;

/**
 *
 * @author Kevin Canning
 */
public class EarthHandler extends PlanetHandler {
    public void handleRequest(PlanetEnum request) { 
        if(request == PlanetEnum.EARTH) { 
            System.out.println("EarthHandler handles " + request); 
            System.out.println("Earth is comfortable.\n"); 
        } else { 
            System.out.println("EarthHandler doesnt handle " + request); 
            if(successor != null) {
                successor.handleRequest(request); 
            }
        }
    }
}
