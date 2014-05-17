/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns.structural.facade;

/**
 *
 * @author Kevin Canning
 */
public class MainDriver {
    public static void main(String[] args) {
        Facade facade = new Facade();
        int x = 3;
        System.out.println("Cube of: " + x + ": " + facade.cubeX(x));
        System.out.println("Cube of: " + x + " times 2: " + facade.cubeXTimes2(x));
        System.out.println(x + " to sixth power times 2: " + facade.xToSixthPowerTimes2(x));
    }
}
