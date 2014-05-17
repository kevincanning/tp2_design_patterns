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
public class SmallEngine implements Engine{
    int horsePower;
    
    public SmallEngine() {
        horsePower = 100;
    }
    
    @Override
    public int go() {
        System.out.println("The Small Engine is running!");
        return horsePower;
    }
}
